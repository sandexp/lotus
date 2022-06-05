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

package com.ledis.expressions

import com.ledis.config.SQLConf
import com.ledis.expressions.codegen._
import com.ledis.expressions.codegen.Block._
import com.ledis.expressions.expression._
import com.ledis.expressions.projection.Literal
import com.ledis.types._
import com.ledis.utils.collections.row.InternalRow
import com.ledis.utils.UTF8String
import com.ledis.utils.random.RandomUUIDGenerator

/**
 * Print the result of an expression to stderr (used for debugging codegen).
 */
case class PrintToStderr(child: Expression) extends UnaryExpression {

  override def dataType: DataType = child.dataType

  protected override def nullSafeEval(input: Any): Any = {
    // scalastyle:off println
    System.err.println(outputPrefix + input)
    // scalastyle:on println
    input
  }

  private val outputPrefix = s"Result of ${child.simpleString(SQLConf.get.maxToStringFields)} is "

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val outputPrefixField = ctx.addReferenceObj("outputPrefix", outputPrefix)
    nullSafeCodeGen(ctx, ev, c =>
      s"""
         | System.err.println($outputPrefixField + $c);
         | ${ev.value} = $c;
       """.stripMargin)
  }
}

/**
 * Throw with the result of an expression (used for debugging).
 */
case class RaiseError(child: Expression, dataType: DataType)
  extends UnaryExpression with ImplicitCastInputTypes {

  def this(child: Expression) = this(child, NullType)

  override def foldable: Boolean = false
  override def nullable: Boolean = true
  override def inputTypes: Seq[AbstractDataType] = Seq(StringType)

  override def prettyName: String = "raise_error"

  override def eval(input: InternalRow): Any = {
    val value = child.eval(input)
    if (value == null) {
      throw new RuntimeException()
    }
    throw new RuntimeException(value.toString)
  }

  // if (true) is to avoid codegen compilation exception that statement is unreachable
  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val eval = child.genCode(ctx)
    ExprCode(
      code = code"""${eval.code}
        |if (true) {
        |  if (${eval.isNull}) {
        |    throw new RuntimeException();
        |  }
        |  throw new RuntimeException(${eval.value}.toString());
        |}""".stripMargin,
      isNull = TrueLiteral,
      value = JavaCode.defaultLiteral(dataType)
    )
  }
}

object RaiseError {
  def apply(child: Expression): RaiseError = new RaiseError(child)
}

/**
 * A function that throws an exception if 'condition' is not true.
 */
case class AssertTrue(left: Expression, right: Expression, child: Expression)
  extends RuntimeReplaceable {

  override def prettyName: String = "assert_true"

  def this(left: Expression, right: Expression) = {
    this(left, right, If(left, Literal(null), RaiseError(right)))
  }

  def this(left: Expression) = {
    this(left, Literal(s"'${left.simpleString(SQLConf.get.maxToStringFields)}' is not true!"))
  }

  override def flatArguments: Iterator[Any] = Iterator(left, right)
  override def exprsReplaced: Seq[Expression] = Seq(left, right)
}

object AssertTrue {
  def apply(left: Expression): AssertTrue = new AssertTrue(left)
}

/**
 * Returns the current database of the SessionCatalog.
 */
case class CurrentDatabase() extends LeafExpression with Unevaluable {
  override def dataType: DataType = StringType
  override def nullable: Boolean = false
  override def prettyName: String = "current_database"
}

/**
 * Returns the current catalog.
 */
case class CurrentCatalog() extends LeafExpression with Unevaluable {
  override def dataType: DataType = StringType
  override def nullable: Boolean = false
  override def prettyName: String = "current_catalog"
}

case class Uuid(randomSeed: Option[Long] = None) extends LeafExpression with Stateful
    with ExpressionWithRandomSeed {

  def this() = this(None)

  override def withNewSeed(seed: Long): Uuid = Uuid(Some(seed))

  override lazy val resolved: Boolean = randomSeed.isDefined

  override def nullable: Boolean = false

  override def dataType: DataType = StringType

  @transient private[this] var randomGenerator: RandomUUIDGenerator = _

  override protected def initializeInternal(partitionIndex: Int): Unit =
    randomGenerator = RandomUUIDGenerator(randomSeed.get + partitionIndex)

  override protected def evalInternal(input: InternalRow): Any =
    randomGenerator.getNextUUIDUTF8String()

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val randomGen = ctx.freshName("randomGen")
    ctx.addMutableState("com.ledis.utils.random.RandomUUIDGenerator", randomGen,
      forceInline = true,
      useFreshName = false)
    ctx.addPartitionInitializationStatement(s"$randomGen = " +
      "new com.ledis.utils.random.RandomUUIDGenerator(" +
      s"${randomSeed.get}L + partitionIndex);")
    ev.copy(code = code"final UTF8String ${ev.value} = $randomGen.getNextUUIDUTF8String();",
      isNull = FalseLiteral)
  }

  override def freshCopy(): Uuid = Uuid(randomSeed)
}

case class TypeOf(child: Expression) extends UnaryExpression {
  override def nullable: Boolean = false
  override def foldable: Boolean = true
  override def dataType: DataType = StringType
  override def eval(input: InternalRow): Any = UTF8String.fromString(child.dataType.catalogString)

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, _ => s"""UTF8String.fromString(${child.dataType.catalogString})""")
  }
}
