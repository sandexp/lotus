/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ledis.expressions.predicate

import scala.collection.immutable.TreeSet
import com.ledis.analysis.TypeCheckResult
import com.ledis.config.SQLConf
import com.ledis.expressions._
import com.ledis.expressions.util.BindReferences.bindReference
import com.ledis.expressions.codegen._
import com.ledis.expressions.codegen.Block._
import com.ledis.expressions.collections.AttributeSet
import com.ledis.expressions.expression._
import com.ledis.expressions.helpers.AliasHelper
import com.ledis.expressions.projection.Literal
import com.ledis.sql.catalyst.expressions.NullIntolerant
import com.ledis.plans.logical.{Aggregate, LeafNode, LogicalPlan, Project}
import com.ledis.types._
import com.ledis.utils.collections.row.InternalRow
import com.ledis.utils.util.TypeUtils


/**
 * A base class for generated/interpreted predicate
 */
abstract class BasePredicate {
  def eval(r: InternalRow): Boolean

  /**
   * Initializes internal states given the current partition index.
   * This is used by nondeterministic expressions to set initial states.
   * The default implementation does nothing.
   */
  def initialize(partitionIndex: Int): Unit = {}
}

case class InterpretedPredicate(expression: Expression) extends BasePredicate {
  private[this] val subExprEliminationEnabled = SQLConf.get.subexpressionEliminationEnabled
  private[this] lazy val runtime =
    new SubExprEvaluationRuntime(SQLConf.get.subexpressionEliminationCacheMaxEntries)
  private[this] val expr = if (subExprEliminationEnabled) {
    runtime.proxyExpressions(Seq(expression)).head
  } else {
    expression
  }

  override def eval(r: InternalRow): Boolean = {
    if (subExprEliminationEnabled) {
      runtime.setInput(r)
    }

    expr.eval(r).asInstanceOf[Boolean]
  }

  override def initialize(partitionIndex: Int): Unit = {
    super.initialize(partitionIndex)
    expr.foreach {
      case n: Nondeterministic => n.initialize(partitionIndex)
      case _ =>
    }
  }
}

/**
 * An [[Expression]] that returns a boolean value.
 */
trait Predicate extends Expression {
  override def dataType: DataType = BooleanType
}

/**
 * The factory object for `BasePredicate`.
 */
object Predicate extends CodeGeneratorWithInterpretedFallback[Expression, BasePredicate] {

  override protected def createCodeGeneratedObject(in: Expression): BasePredicate = {
    GeneratePredicate.generate(in, SQLConf.get.subexpressionEliminationEnabled)
  }

  override protected def createInterpretedObject(in: Expression): BasePredicate = {
    InterpretedPredicate(in)
  }

  def createInterpreted(e: Expression): InterpretedPredicate = InterpretedPredicate(e)

  /**
   * Returns a BasePredicate for an Expression, which will be bound to `inputSchema`.
   */
  def create(e: Expression, inputSchema: Seq[Attribute]): BasePredicate = {
    createObject(bindReference(e, inputSchema))
  }

  /**
   * Returns a BasePredicate for a given bound Expression.
   */
  def create(e: Expression): BasePredicate = {
    createObject(e)
  }
}

trait PredicateHelper extends AliasHelper {
  protected def splitConjunctivePredicates(condition: Expression): Seq[Expression] = {
    condition match {
      case And(cond1, cond2) =>
        splitConjunctivePredicates(cond1) ++ splitConjunctivePredicates(cond2)
      case other => other :: Nil
    }
  }

  /**
   * Find the origin of where the input references of expression exp were scanned in the tree of
   * plan, and if they originate from a single leaf node.
   * Returns optional tuple with Expression, undoing any projections and aliasing that has been done
   * along the way from plan to origin, and the origin LeafNode plan from which all the exp
   */
  def findExpressionAndTrackLineageDown(
      exp: Expression,
      plan: LogicalPlan): Option[(Expression, LogicalPlan)] = {

    plan match {
      case p: Project =>
        val aliases = getAliasMap(p)
        findExpressionAndTrackLineageDown(replaceAlias(exp, aliases), p.child)
      // we can unwrap only if there are row projections, and no aggregation operation
      case a: Aggregate =>
        val aliasMap = getAliasMap(a)
        findExpressionAndTrackLineageDown(replaceAlias(exp, aliasMap), a.child)
      case l: LeafNode if exp.references.subsetOf(l.outputSet) =>
        Some((exp, l))
      case other =>
        other.children.flatMap {
          child => if (exp.references.subsetOf(child.outputSet)) {
            findExpressionAndTrackLineageDown(exp, child)
          } else {
            None
          }
        }.headOption
    }
  }

  protected def splitDisjunctivePredicates(condition: Expression): Seq[Expression] = {
    condition match {
      case Or(cond1, cond2) =>
        splitDisjunctivePredicates(cond1) ++ splitDisjunctivePredicates(cond2)
      case other => other :: Nil
    }
  }

  /**
   * Returns true if `expr` can be evaluated using only the output of `plan`.  This method
   * can be used to determine when it is acceptable to move expression evaluation within a query
   * plan.
   *
   * For example consider a join between two relations R(a, b) and S(c, d).
   *
   * - `canEvaluate(EqualTo(a,b), R)` returns `true`
   * - `canEvaluate(EqualTo(a,c), R)` returns `false`
   * - `canEvaluate(Literal(1), R)` returns `true` as literals CAN be evaluated on any plan
   */
  protected def canEvaluate(expr: Expression, plan: LogicalPlan): Boolean =
    expr.references.subsetOf(plan.outputSet)

  /**
   * Returns true iff `expr` could be evaluated as a condition within join.
   */
  protected def canEvaluateWithinJoin(expr: Expression): Boolean = expr match {
    // Non-deterministic expressions are not allowed as join conditions.
    case e if !e.deterministic => false
    case _: ListQuery | _: Exists =>
      // A ListQuery defines the query which we want to search in an IN subquery expression.
      // Currently the only way to evaluate an IN subquery is to convert it to a
      // LeftSemi/LeftAnti/ExistenceJoin by `RewritePredicateSubquery` rule.
      // It cannot be evaluated as part of a Join operator.
      // An Exists shouldn't be push into a Join operator too.
      false
    case e: SubqueryExpression =>
      // non-correlated subquery will be replaced as literal
      e.children.isEmpty
    case a: AttributeReference => true
    // PythonUDF will be executed by dedicated physical operator later.
    // For PythonUDFs that can't be evaluated in join condition, `ExtractPythonUDFFromJoinCondition`
    // will pull them out later.
    case e: Unevaluable => false
    case e => e.children.forall(canEvaluateWithinJoin)
  }

  /**
   * Returns a filter that its reference is a subset of `outputSet` and it contains the maximum
   * constraints from `condition`. This is used for predicate pushdown.
   * When there is no such filter, `None` is returned.
   */
  protected def extractPredicatesWithinOutputSet(
      condition: Expression,
      outputSet: AttributeSet): Option[Expression] = condition match {
    case And(left, right) =>
      val leftResultOptional = extractPredicatesWithinOutputSet(left, outputSet)
      val rightResultOptional = extractPredicatesWithinOutputSet(right, outputSet)
      (leftResultOptional, rightResultOptional) match {
        case (Some(leftResult), Some(rightResult)) => Some(And(leftResult, rightResult))
        case (Some(leftResult), None) => Some(leftResult)
        case (None, Some(rightResult)) => Some(rightResult)
        case _ => None
      }

    // The Or predicate is convertible when both of its children can be pushed down.
    // That is to say, if one/both of the children can be partially pushed down, the Or
    // predicate can be partially pushed down as well.
    //
    // Here is an example used to explain the reason.
    // Let's say we have
    // condition: (a1 AND a2) OR (b1 AND b2),
    // outputSet: AttributeSet(a1, b1)
    // a1 and b1 is convertible, while a2 and b2 is not.
    // The predicate can be converted as
    // (a1 OR b1) AND (a1 OR b2) AND (a2 OR b1) AND (a2 OR b2)
    // As per the logical in And predicate, we can push down (a1 OR b1).
    case Or(left, right) =>
      for {
        lhs <- extractPredicatesWithinOutputSet(left, outputSet)
        rhs <- extractPredicatesWithinOutputSet(right, outputSet)
      } yield Or(lhs, rhs)

    // Here we assume all the `Not` operators is already below all the `And` and `Or` operators
    // after the optimization rule `BooleanSimplification`, so that we don't need to handle the
    // `Not` operators here.
    case other =>
      if (other.references.subsetOf(outputSet)) {
        Some(other)
      } else {
        None
      }
  }
}

case class Not(child: Expression)
  extends UnaryExpression with Predicate with ImplicitCastInputTypes with NullIntolerant {

  override def toString: String = s"NOT $child"

  override def inputTypes: Seq[DataType] = Seq(BooleanType)

  // +---------+-----------+
  // | CHILD   | NOT CHILD |
  // +---------+-----------+
  // | TRUE    | FALSE     |
  // | FALSE   | TRUE      |
  // | UNKNOWN | UNKNOWN   |
  // +---------+-----------+
  protected override def nullSafeEval(input: Any): Any = !input.asInstanceOf[Boolean]

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, c => s"!($c)")
  }

  override def sql: String = s"(NOT ${child.sql})"
}

/**
 * Evaluates to `true` if `values` are returned in `query`'s result set.
 */
case class InSubquery(values: Seq[Expression], query: ListQuery)
  extends Predicate with Unevaluable {

  @transient private lazy val value: Expression = if (values.length > 1) {
    CreateNamedStruct(values.zipWithIndex.flatMap {
      case (v: NamedExpression, _) => Seq(Literal(v.name), v)
      case (v, idx) => Seq(Literal(s"_$idx"), v)
    })
  } else {
    values.head
  }


  override def checkInputDataTypes(): TypeCheckResult = {
    if (values.length != query.childOutputs.length) {
      TypeCheckResult.TypeCheckFailure(
        s"""
           |The number of columns in the left hand side of an IN subquery does not match the
           |number of columns in the output of subquery.
           |#columns in left hand side: ${values.length}.
           |#columns in right hand side: ${query.childOutputs.length}.
           |Left side columns:
           |[${values.map(_.sql).mkString(", ")}].
           |Right side columns:
           |[${query.childOutputs.map(_.sql).mkString(", ")}].""".stripMargin)
    } else if (!DataType.equalsStructurally(
      query.dataType, value.dataType, ignoreNullability = true)) {

      val mismatchedColumns = values.zip(query.childOutputs).flatMap {
        case (l, r) if l.dataType != r.dataType =>
          Seq(s"(${l.sql}:${l.dataType.catalogString}, ${r.sql}:${r.dataType.catalogString})")
        case _ => None
      }
      TypeCheckResult.TypeCheckFailure(
        s"""
           |The data type of one or more elements in the left hand side of an IN subquery
           |is not compatible with the data type of the output of the subquery
           |Mismatched columns:
           |[${mismatchedColumns.mkString(", ")}]
           |Left side:
           |[${values.map(_.dataType.catalogString).mkString(", ")}].
           |Right side:
           |[${query.childOutputs.map(_.dataType.catalogString).mkString(", ")}].""".stripMargin)
    } else {
      TypeUtils.checkForOrderingExpr(value.dataType, s"function $prettyName")
    }
  }

  override def children: Seq[Expression] = values :+ query
  override def nullable: Boolean = children.exists(_.nullable)
  override def toString: String = s"$value IN ($query)"
  override def sql: String = s"(${value.sql} IN (${query.sql}))"
}


/**
 * Evaluates to `true` if `list` contains `value`.
 */
case class In(value: Expression, list: Seq[Expression]) extends Predicate {

  require(list != null, "list should not be null")

  override def checkInputDataTypes(): TypeCheckResult = {
    val mismatchOpt = list.find(l => !DataType.equalsStructurally(l.dataType, value.dataType,
      ignoreNullability = true))
    if (mismatchOpt.isDefined) {
      TypeCheckResult.TypeCheckFailure(s"Arguments must be same type but were: " +
        s"${value.dataType.catalogString} != ${mismatchOpt.get.dataType.catalogString}")
    } else {
      TypeUtils.checkForOrderingExpr(value.dataType, s"function $prettyName")
    }
  }

  override def children: Seq[Expression] = value +: list
  lazy val inSetConvertible = list.forall(_.isInstanceOf[Literal])
  private lazy val ordering = TypeUtils.getInterpretedOrdering(value.dataType)

  override def nullable: Boolean = children.exists(_.nullable)
  override def foldable: Boolean = children.forall(_.foldable)

  override def toString: String = s"$value IN ${list.mkString("(", ",", ")")}"

  override def eval(input: InternalRow): Any = {
    val evaluatedValue = value.eval(input)
    if (evaluatedValue == null) {
      null
    } else {
      var hasNull = false
      list.foreach { e =>
        val v = e.eval(input)
        if (v == null) {
          hasNull = true
        } else if (ordering.equiv(v, evaluatedValue)) {
          return true
        }
      }
      if (hasNull) {
        null
      } else {
        false
      }
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val javaDataType = CodeGenerator.javaType(value.dataType)
    val valueGen = value.genCode(ctx)
    val listGen = list.map(_.genCode(ctx))
    // inTmpResult has 3 possible values:
    // -1 means no matches found and there is at least one value in the list evaluated to null
    val HAS_NULL = -1
    // 0 means no matches found and all values in the list are not null
    val NOT_MATCHED = 0
    // 1 means one value in the list is matched
    val MATCHED = 1
    val tmpResult = ctx.freshName("inTmpResult")
    val valueArg = ctx.freshName("valueArg")
    // All the blocks are meant to be inside a do { ... } while (false); loop.
    // The evaluation of variables can be stopped when we find a matching value.
    val listCode = listGen.map(x =>
      s"""
         |${x.code}
         |if (${x.isNull}) {
         |  $tmpResult = $HAS_NULL; // ${ev.isNull} = true;
         |} else if (${ctx.genEqual(value.dataType, valueArg, x.value)}) {
         |  $tmpResult = $MATCHED; // ${ev.isNull} = false; ${ev.value} = true;
         |  continue;
         |}
       """.stripMargin)

    val codes = ctx.splitExpressionsWithCurrentInputs(
      expressions = listCode,
      funcName = "valueIn",
      extraArguments = (javaDataType, valueArg) :: (CodeGenerator.JAVA_BYTE, tmpResult) :: Nil,
      returnType = CodeGenerator.JAVA_BYTE,
      makeSplitFunction = body =>
        s"""
           |do {
           |  $body
           |} while (false);
           |return $tmpResult;
         """.stripMargin,
      foldFunctions = _.map { funcCall =>
        s"""
           |$tmpResult = $funcCall;
           |if ($tmpResult == $MATCHED) {
           |  continue;
           |}
         """.stripMargin
      }.mkString("\n"))

    ev.copy(code =
      code"""
         |${valueGen.code}
         |byte $tmpResult = $HAS_NULL;
         |if (!${valueGen.isNull}) {
         |  $tmpResult = $NOT_MATCHED;
         |  $javaDataType $valueArg = ${valueGen.value};
         |  do {
         |    $codes
         |  } while (false);
         |}
         |final boolean ${ev.isNull} = ($tmpResult == $HAS_NULL);
         |final boolean ${ev.value} = ($tmpResult == $MATCHED);
       """.stripMargin)
  }

  override def sql: String = {
    val valueSQL = value.sql
    val listSQL = list.map(_.sql).mkString(", ")
    s"($valueSQL IN ($listSQL))"
  }
}

/**
 * Optimized version of In clause, when all filter values of In clause are
 * static.
 */
case class InSet(child: Expression, hset: Set[Any]) extends UnaryExpression with Predicate {

  require(hset != null, "hset could not be null")

  override def toString: String = s"$child INSET ${hset.mkString("(", ",", ")")}"

  @transient private[this] lazy val hasNull: Boolean = hset.contains(null)
  @transient private[this] lazy val isNaN: Any => Boolean = child.dataType match {
    case DoubleType => (value: Any) => java.lang.Double.isNaN(value.asInstanceOf[java.lang.Double])
    case FloatType => (value: Any) => java.lang.Float.isNaN(value.asInstanceOf[java.lang.Float])
    case _ => (_: Any) => false
  }
  @transient private[this] lazy val hasNaN = child.dataType match {
    case DoubleType | FloatType => set.exists(isNaN)
    case _ => false
  }


  override def nullable: Boolean = child.nullable || hasNull

  protected override def nullSafeEval(value: Any): Any = {
    if (set.contains(value)) {
      true
    } else if (isNaN(value)) {
      hasNaN
    } else if (hasNull) {
      null
    } else {
      false
    }
  }

  @transient lazy val set: Set[Any] = child.dataType match {
    case t: AtomicType if !t.isInstanceOf[BinaryType] => hset
    case _: NullType => hset
    case _ =>
      // for structs use interpreted ordering to be able to compare UnsafeRows with non-UnsafeRows
      TreeSet.empty(TypeUtils.getInterpretedOrdering(child.dataType)) ++ (hset - null)
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    if (canBeComputedUsingSwitch && hset.size <= SQLConf.get.optimizerInSetSwitchThreshold) {
      genCodeWithSwitch(ctx, ev)
    } else {
      genCodeWithSet(ctx, ev)
    }
  }

  private def canBeComputedUsingSwitch: Boolean = child.dataType match {
    case ByteType | ShortType | IntegerType | DateType => true
    case _ => false
  }

  private def genCodeWithSet(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    nullSafeCodeGen(ctx, ev, c => {
      val setTerm = ctx.addReferenceObj("set", set)

      val setIsNull = if (hasNull) {
        s"${ev.isNull} = !${ev.value};"
      } else {
        ""
      }

      val ret = child.dataType match {
        case DoubleType => Some((v: Any) => s"java.lang.Double.isNaN($v)")
        case FloatType => Some((v: Any) => s"java.lang.Float.isNaN($v)")
        case _ => None
      }

      ret.map { isNaN =>
        s"""
          |if ($setTerm.contains($c)) {
          |  ${ev.value} = true;
          |} else if (${isNaN(c)}) {
          |  ${ev.value} =  $hasNaN;
          |}
          |$setIsNull
          |""".stripMargin
      }.getOrElse(
        s"""
           |${ev.value} = $setTerm.contains($c);
           |$setIsNull
         """.stripMargin)
    })
  }

  // spark.sql.optimizer.inSetSwitchThreshold has an appropriate upper limit,
  // so the code size should not exceed 64KB
  private def genCodeWithSwitch(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val caseValuesGen = hset.filter(_ != null).map(Literal(_).genCode(ctx))
    val valueGen = child.genCode(ctx)

    val caseBranches = caseValuesGen.map(literal =>
      code"""
        case ${literal.value}:
          ${ev.value} = true;
          break;
       """)

    val switchCode = if (caseBranches.size > 0) {
      code"""
        switch (${valueGen.value}) {
          ${caseBranches.mkString("\n")}
          default:
            ${ev.isNull} = $hasNull;
        }
       """
    } else {
      s"${ev.isNull} = $hasNull;"
    }

    ev.copy(code =
      code"""
        ${valueGen.code}
        ${CodeGenerator.JAVA_BOOLEAN} ${ev.isNull} = ${valueGen.isNull};
        ${CodeGenerator.JAVA_BOOLEAN} ${ev.value} = false;
        if (!${valueGen.isNull}) {
          $switchCode
        }
       """)
  }

  override def sql: String = {
    val valueSQL = child.sql
    val listSQL = hset.toSeq
      .map(elem => Literal(elem, child.dataType).sql)
      .mkString(", ")
    s"($valueSQL IN ($listSQL))"
  }
}

case class And(left: Expression, right: Expression) extends BinaryOperator with Predicate {

  override def inputType: AbstractDataType = BooleanType

  override def symbol: String = "&&"

  override def sqlOperator: String = "AND"

  // +---------+---------+---------+---------+
  // | AND     | TRUE    | FALSE   | UNKNOWN |
  // +---------+---------+---------+---------+
  // | TRUE    | TRUE    | FALSE   | UNKNOWN |
  // | FALSE   | FALSE   | FALSE   | FALSE   |
  // | UNKNOWN | UNKNOWN | FALSE   | UNKNOWN |
  // +---------+---------+---------+---------+
  override def eval(input: InternalRow): Any = {
    val input1 = left.eval(input)
    if (input1 == false) {
       false
    } else {
      val input2 = right.eval(input)
      if (input2 == false) {
        false
      } else {
        if (input1 != null && input2 != null) {
          true
        } else {
          null
        }
      }
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val eval1 = left.genCode(ctx)
    val eval2 = right.genCode(ctx)

    // The result should be `false`, if any of them is `false` whenever the other is null or not.
    if (!left.nullable && !right.nullable) {
      ev.copy(code = code"""
        ${eval1.code}
        boolean ${ev.value} = false;

        if (${eval1.value}) {
          ${eval2.code}
          ${ev.value} = ${eval2.value};
        }""", isNull = FalseLiteral)
    } else {
      ev.copy(code = code"""
        ${eval1.code}
        boolean ${ev.isNull} = false;
        boolean ${ev.value} = false;

        if (!${eval1.isNull} && !${eval1.value}) {
        } else {
          ${eval2.code}
          if (!${eval2.isNull} && !${eval2.value}) {
          } else if (!${eval1.isNull} && !${eval2.isNull}) {
            ${ev.value} = true;
          } else {
            ${ev.isNull} = true;
          }
        }
      """)
    }
  }
}

case class Or(left: Expression, right: Expression) extends BinaryOperator with Predicate {

  override def inputType: AbstractDataType = BooleanType

  override def symbol: String = "||"

  override def sqlOperator: String = "OR"

  // +---------+---------+---------+---------+
  // | OR      | TRUE    | FALSE   | UNKNOWN |
  // +---------+---------+---------+---------+
  // | TRUE    | TRUE    | TRUE    | TRUE    |
  // | FALSE   | TRUE    | FALSE   | UNKNOWN |
  // | UNKNOWN | TRUE    | UNKNOWN | UNKNOWN |
  // +---------+---------+---------+---------+
  override def eval(input: InternalRow): Any = {
    val input1 = left.eval(input)
    if (input1 == true) {
      true
    } else {
      val input2 = right.eval(input)
      if (input2 == true) {
        true
      } else {
        if (input1 != null && input2 != null) {
          false
        } else {
          null
        }
      }
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val eval1 = left.genCode(ctx)
    val eval2 = right.genCode(ctx)

    // The result should be `true`, if any of them is `true` whenever the other is null or not.
    if (!left.nullable && !right.nullable) {
      ev.isNull = FalseLiteral
      ev.copy(code = code"""
        ${eval1.code}
        boolean ${ev.value} = true;

        if (!${eval1.value}) {
          ${eval2.code}
          ${ev.value} = ${eval2.value};
        }""", isNull = FalseLiteral)
    } else {
      ev.copy(code = code"""
        ${eval1.code}
        boolean ${ev.isNull} = false;
        boolean ${ev.value} = true;

        if (!${eval1.isNull} && ${eval1.value}) {
        } else {
          ${eval2.code}
          if (!${eval2.isNull} && ${eval2.value}) {
          } else if (!${eval1.isNull} && !${eval2.isNull}) {
            ${ev.value} = false;
          } else {
            ${ev.isNull} = true;
          }
        }
      """)
    }
  }
}


abstract class BinaryComparison extends BinaryOperator with Predicate {

  // Note that we need to give a superset of allowable input types since orderable types are not
  // finitely enumerable. The allowable types are checked below by checkInputDataTypes.
  override def inputType: AbstractDataType = AnyDataType

  override def checkInputDataTypes(): TypeCheckResult = super.checkInputDataTypes() match {
    case TypeCheckResult.TypeCheckSuccess =>
      TypeUtils.checkForOrderingExpr(left.dataType, this.getClass.getSimpleName)
    case failure => failure
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    if (CodeGenerator.isPrimitiveType(left.dataType)
        && left.dataType != BooleanType // java boolean doesn't support > or < operator
        && left.dataType != FloatType
        && left.dataType != DoubleType) {
      // faster version
      defineCodeGen(ctx, ev, (c1, c2) => s"$c1 $symbol $c2")
    } else {
      defineCodeGen(ctx, ev, (c1, c2) => s"${ctx.genComp(left.dataType, c1, c2)} $symbol 0")
    }
  }

  protected lazy val ordering: Ordering[Any] = TypeUtils.getInterpretedOrdering(left.dataType)
}


object BinaryComparison {
  def unapply(e: BinaryComparison): Option[(Expression, Expression)] = Some((e.left, e.right))
}


/** An extractor that matches both standard 3VL equality and null-safe equality. */
object Equality {
  def unapply(e: BinaryComparison): Option[(Expression, Expression)] = e match {
    case EqualTo(l, r) => Some((l, r))
    case EqualNullSafe(l, r) => Some((l, r))
    case _ => None
  }
}

case class EqualTo(left: Expression, right: Expression)
    extends BinaryComparison with NullIntolerant {

  override def symbol: String = "="

  // +---------+---------+---------+---------+
  // | =       | TRUE    | FALSE   | UNKNOWN |
  // +---------+---------+---------+---------+
  // | TRUE    | TRUE    | FALSE   | UNKNOWN |
  // | FALSE   | FALSE   | TRUE    | UNKNOWN |
  // | UNKNOWN | UNKNOWN | UNKNOWN | UNKNOWN |
  // +---------+---------+---------+---------+
  protected override def nullSafeEval(left: Any, right: Any): Any = ordering.equiv(left, right)

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, (c1, c2) => ctx.genEqual(left.dataType, c1, c2))
  }
}

// in equality comparison
case class EqualNullSafe(left: Expression, right: Expression) extends BinaryComparison {

  override def symbol: String = "<=>"

  override def nullable: Boolean = false

  // +---------+---------+---------+---------+
  // | <=>     | TRUE    | FALSE   | UNKNOWN |
  // +---------+---------+---------+---------+
  // | TRUE    | TRUE    | FALSE   | FALSE   |
  // | FALSE   | FALSE   | TRUE    | FALSE   |
  // | UNKNOWN | FALSE   | FALSE   | TRUE    |
  // +---------+---------+---------+---------+
  override def eval(input: InternalRow): Any = {
    val input1 = left.eval(input)
    val input2 = right.eval(input)
    if (input1 == null && input2 == null) {
      true
    } else if (input1 == null || input2 == null) {
      false
    } else {
      ordering.equiv(input1, input2)
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val eval1 = left.genCode(ctx)
    val eval2 = right.genCode(ctx)
    val equalCode = ctx.genEqual(left.dataType, eval1.value, eval2.value)
    ev.copy(code = eval1.code + eval2.code + code"""
        boolean ${ev.value} = (${eval1.isNull} && ${eval2.isNull}) ||
           (!${eval1.isNull} && !${eval2.isNull} && $equalCode);""", isNull = FalseLiteral)
  }
}

case class LessThan(left: Expression, right: Expression)
    extends BinaryComparison with NullIntolerant {

  override def symbol: String = "<"

  protected override def nullSafeEval(input1: Any, input2: Any): Any = ordering.lt(input1, input2)
}

case class LessThanOrEqual(left: Expression, right: Expression)
    extends BinaryComparison with NullIntolerant {

  override def symbol: String = "<="

  protected override def nullSafeEval(input1: Any, input2: Any): Any = ordering.lteq(input1, input2)
}

case class GreaterThan(left: Expression, right: Expression)
    extends BinaryComparison with NullIntolerant {

  override def symbol: String = ">"

  protected override def nullSafeEval(input1: Any, input2: Any): Any = ordering.gt(input1, input2)
}

case class GreaterThanOrEqual(left: Expression, right: Expression)
    extends BinaryComparison with NullIntolerant {

  override def symbol: String = ">="

  protected override def nullSafeEval(input1: Any, input2: Any): Any = ordering.gteq(input1, input2)
}

/**
 * IS UNKNOWN and IS NOT UNKNOWN are the same as IS NULL and IS NOT NULL, respectively,
 * except that the input expression must be of a boolean type.
 */
object IsUnknown {
  def apply(child: Expression): Predicate = {
    new IsNull(child) with ExpectsInputTypes {
      override def inputTypes: Seq[DataType] = Seq(BooleanType)
      override def sql: String = s"(${child.sql} IS UNKNOWN)"
    }
  }
}

object IsNotUnknown {
  def apply(child: Expression): Predicate = {
    new IsNotNull(child) with ExpectsInputTypes {
      override def inputTypes: Seq[DataType] = Seq(BooleanType)
      override def sql: String = s"(${child.sql} IS NOT UNKNOWN)"
    }
  }
}
