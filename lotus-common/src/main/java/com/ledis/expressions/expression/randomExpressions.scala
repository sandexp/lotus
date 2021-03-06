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

package com.ledis.expressions.expression

import com.ledis.exception.AnalysisException
import com.ledis.expressions.ExpectsInputTypes
import com.ledis.expressions.codegen.{CodeGenerator, CodegenContext, ExprCode, FalseLiteral}
import com.ledis.expressions.codegen.Block._
import com.ledis.expressions.projection.Literal
import com.ledis.types._
import com.ledis.utils.{Utils, XORShiftRandom}
import com.ledis.utils.collections.row.InternalRow

/**
 * A Random distribution generating expression.
 * TODO: This can be made generic to generate any type of random distribution, or any type of
 * StructType.
 *
 * Since this expression is stateful, it cannot be a case object.
 */
abstract class RDG extends UnaryExpression with ExpectsInputTypes with Stateful {
  /**
   * Record ID within each partition. By being transient, the Random Number Generator is
   * reset every time we serialize and deserialize and initialize it.
   */
  @transient protected var rng: XORShiftRandom = _

  override protected def initializeInternal(partitionIndex: Int): Unit = {
    rng = new XORShiftRandom(seed + partitionIndex)
  }

  @transient protected lazy val seed: Long = child match {
    case e if child.foldable && e.dataType == IntegerType => e.eval().asInstanceOf[Int]
    case e if child.foldable && e.dataType == LongType => e.eval().asInstanceOf[Long]
    case _ => throw new AnalysisException(
      s"Input argument to $prettyName must be an integer, long, or null constant.")
  }

  override def nullable: Boolean = false

  override def dataType: DataType = DoubleType

  override def inputTypes: Seq[AbstractDataType] = Seq(TypeCollection(IntegerType, LongType))
}

/**
 * Represents the behavior of expressions which have a random seed and can renew the seed.
 * Usually the random seed needs to be renewed at each execution under streaming queries.
 */
trait ExpressionWithRandomSeed {
  def withNewSeed(seed: Long): Expression
}

/** Generate a random column with i.i.d. uniformly distributed values in [0, 1). */
case class Rand(child: Expression, hideSeed: Boolean = false)
  extends RDG with ExpressionWithRandomSeed {

  def this() = this(Literal(Utils.random.nextLong(), LongType), true)

  def this(child: Expression) = this(child, false)

  override def withNewSeed(seed: Long): Rand = Rand(Literal(seed, LongType))

  override protected def evalInternal(input: InternalRow): Double = rng.nextDouble()

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val className = classOf[XORShiftRandom].getName
    val rngTerm = ctx.addMutableState(className, "rng")
    ctx.addPartitionInitializationStatement(
      s"$rngTerm = new $className(${seed}L + partitionIndex);")
    ev.copy(code = code"""
      final ${CodeGenerator.javaType(dataType)} ${ev.value} = $rngTerm.nextDouble();""",
      isNull = FalseLiteral)
  }

  override def freshCopy(): Rand = Rand(child, hideSeed)

  override def flatArguments: Iterator[Any] = Iterator(child)
  override def sql: String = {
    s"rand(${if (hideSeed) "" else child.sql})"
  }
}

object Rand {
  def apply(seed: Long): Rand = Rand(Literal(seed, LongType))
}

/** Generate a random column with i.i.d. values drawn from the standard normal distribution. */
case class Randn(child: Expression, hideSeed: Boolean = false)
  extends RDG with ExpressionWithRandomSeed {

  def this() = this(Literal(Utils.random.nextLong(), LongType), true)

  def this(child: Expression) = this(child, false)

  override def withNewSeed(seed: Long): Randn = Randn(Literal(seed, LongType))

  override protected def evalInternal(input: InternalRow): Double = rng.nextGaussian()

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val className = classOf[XORShiftRandom].getName
    val rngTerm = ctx.addMutableState(className, "rng")
    ctx.addPartitionInitializationStatement(
      s"$rngTerm = new $className(${seed}L + partitionIndex);")
    ev.copy(code = code"""
      final ${CodeGenerator.javaType(dataType)} ${ev.value} = $rngTerm.nextGaussian();""",
      isNull = FalseLiteral)
  }

  override def freshCopy(): Randn = Randn(child, hideSeed)

  override def flatArguments: Iterator[Any] = Iterator(child)
  override def sql: String = {
    s"randn(${if (hideSeed) "" else child.sql})"
  }
}

object Randn {
  def apply(seed: Long): Randn = Randn(Literal(seed, LongType))
}
