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

package com.ledis.expressions.aggregate

import com.ledis.config.SQLConf
import com.ledis.dsl.expressions._
import com.ledis.expressions._
import com.ledis.expressions.expression.{AttributeReference, Expression, If}
import com.ledis.expressions.projection.Literal
import com.ledis.types._

/**
 * Compute the covariance between two expressions.
 * When applied on empty data (i.e., count is zero), it returns NULL.
 */
abstract class Covariance(x: Expression, y: Expression, nullOnDivideByZero: Boolean)
  extends DeclarativeAggregate with ImplicitCastInputTypes {

  override def children: Seq[Expression] = Seq(x, y)
  override def nullable: Boolean = true
  override def dataType: DataType = DoubleType
  override def inputTypes: Seq[AbstractDataType] = Seq(DoubleType, DoubleType)

  protected val n = AttributeReference("n", DoubleType, nullable = false)()
  protected val xAvg = AttributeReference("xAvg", DoubleType, nullable = false)()
  protected val yAvg = AttributeReference("yAvg", DoubleType, nullable = false)()
  protected val ck = AttributeReference("ck", DoubleType, nullable = false)()

  protected def divideByZeroEvalResult: Expression = {
    if (nullOnDivideByZero) Literal.create(null, DoubleType) else Double.NaN
  }

  override def stringArgs: Iterator[Any] =
    super.stringArgs.filter(_.isInstanceOf[Expression])

  override val aggBufferAttributes: Seq[AttributeReference] = Seq(n, xAvg, yAvg, ck)

  override val initialValues: Seq[Expression] = Array.fill(4)(Literal(0.0))

  override lazy val updateExpressions: Seq[Expression] = updateExpressionsDef

  override val mergeExpressions: Seq[Expression] = {

    val n1 = n.left
    val n2 = n.right
    val newN = n1 + n2
    val dx = xAvg.right - xAvg.left
    val dxN = If(newN === 0.0, 0.0, dx / newN)
    val dy = yAvg.right - yAvg.left
    val dyN = If(newN === 0.0, 0.0, dy / newN)
    val newXAvg = xAvg.left + dxN * n2
    val newYAvg = yAvg.left + dyN * n2
    val newCk = ck.left + ck.right + dx * dyN * n1 * n2

    Seq(newN, newXAvg, newYAvg, newCk)
  }

  protected def updateExpressionsDef: Seq[Expression] = {
    val newN = n + 1.0
    val dx = x - xAvg
    val dy = y - yAvg
    val dyN = dy / newN
    val newXAvg = xAvg + dx / newN
    val newYAvg = yAvg + dyN
    val newCk = ck + dx * (y - newYAvg)

    val isNull = x.isNull || y.isNull
    Seq(
      If(isNull, n, newN),
      If(isNull, xAvg, newXAvg),
      If(isNull, yAvg, newYAvg),
      If(isNull, ck, newCk)
    )
  }
}

case class CovPopulation(
    left: Expression,
    right: Expression,
    nullOnDivideByZero: Boolean = !SQLConf.get.legacyStatisticalAggregate)
  extends Covariance(left, right, nullOnDivideByZero) {

  def this(left: Expression, right: Expression) =
    this(left, right, !SQLConf.get.legacyStatisticalAggregate)

  override val evaluateExpression: Expression = {
    If(n === 0.0, Literal.create(null, DoubleType), ck / n)
  }
  override def prettyName: String = "covar_pop"
}

case class CovSample(
    left: Expression,
    right: Expression,
    nullOnDivideByZero: Boolean = !SQLConf.get.legacyStatisticalAggregate)
  extends Covariance(left, right, nullOnDivideByZero) {

  def this(left: Expression, right: Expression) =
    this(left, right, !SQLConf.get.legacyStatisticalAggregate)

  override val evaluateExpression: Expression = {
    If(n === 0.0, Literal.create(null, DoubleType),
      If(n === 1.0, divideByZeroEvalResult, ck / (n - 1.0)))
  }
  override def prettyName: String = "covar_samp"
}
