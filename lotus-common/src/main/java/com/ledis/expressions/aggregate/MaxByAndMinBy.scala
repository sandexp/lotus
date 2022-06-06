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

import com.ledis.analysis.TypeCheckResult
import com.ledis.dsl.expressions._
import com.ledis.expressions.expression.{AttributeReference, CaseWhen, Expression, If}
import com.ledis.expressions.projection.Literal
import com.ledis.types._
import com.ledis.utils.util.TypeUtils

/**
 * The shared abstract superclass for `MaxBy` and `MinBy` SQL aggregate functions.
 */
abstract class MaxMinBy extends DeclarativeAggregate {

  def valueExpr: Expression
  def orderingExpr: Expression

  // The predicate compares two ordering values.
  protected def predicate(oldExpr: Expression, newExpr: Expression): Expression
  // The arithmetic expression returns greatest/least value of all parameters.
  // Used to pick up updated ordering value.
  protected def orderingUpdater(oldExpr: Expression, newExpr: Expression): Expression

  override def children: Seq[Expression] = valueExpr :: orderingExpr :: Nil

  override def nullable: Boolean = true

  // Return data type.
  override def dataType: DataType = valueExpr.dataType

  override def checkInputDataTypes(): TypeCheckResult =
    TypeUtils.checkForOrderingExpr(orderingExpr.dataType, s"function $prettyName")

  // The attributes used to keep extremum (max or min) and associated aggregated values.
  private lazy val extremumOrdering =
    AttributeReference("extremumOrdering", orderingExpr.dataType)()
  private lazy val valueWithExtremumOrdering =
    AttributeReference("valueWithExtremumOrdering", valueExpr.dataType)()

  override lazy val aggBufferAttributes: Seq[AttributeReference] =
    valueWithExtremumOrdering :: extremumOrdering :: Nil

  private lazy val nullValue = Literal.create(null, valueExpr.dataType)
  private lazy val nullOrdering = Literal.create(null, orderingExpr.dataType)

  override lazy val initialValues: Seq[Literal] = Seq(
    /* valueWithExtremumOrdering = */ nullValue,
    /* extremumOrdering = */ nullOrdering
  )

  override lazy val updateExpressions: Seq[Expression] = Seq(
    /* valueWithExtremumOrdering = */
    CaseWhen(
      (extremumOrdering.isNull && orderingExpr.isNull, nullValue) ::
        (extremumOrdering.isNull, valueExpr) ::
        (orderingExpr.isNull, valueWithExtremumOrdering) :: Nil,
      If(predicate(extremumOrdering, orderingExpr), valueWithExtremumOrdering, valueExpr)
    ),
    /* extremumOrdering = */ orderingUpdater(extremumOrdering, orderingExpr)
  )

  override lazy val mergeExpressions: Seq[Expression] = Seq(
    /* valueWithExtremumOrdering = */
    CaseWhen(
      (extremumOrdering.left.isNull && extremumOrdering.right.isNull, nullValue) ::
        (extremumOrdering.left.isNull, valueWithExtremumOrdering.right) ::
        (extremumOrdering.right.isNull, valueWithExtremumOrdering.left) :: Nil,
      If(predicate(extremumOrdering.left, extremumOrdering.right),
        valueWithExtremumOrdering.left, valueWithExtremumOrdering.right)
    ),
    /* extremumOrdering = */ orderingUpdater(extremumOrdering.left, extremumOrdering.right)
  )

  override lazy val evaluateExpression: AttributeReference = valueWithExtremumOrdering
}

case class MaxBy(valueExpr: Expression, orderingExpr: Expression) extends MaxMinBy {

  override def prettyName: String = "max_by"

  override protected def predicate(oldExpr: Expression, newExpr: Expression): Expression =
    oldExpr > newExpr

  override protected def orderingUpdater(oldExpr: Expression, newExpr: Expression): Expression =
    greatest(oldExpr, newExpr)
}


case class MinBy(valueExpr: Expression, orderingExpr: Expression) extends MaxMinBy {

  override def prettyName: String = "min_by"

  override protected def predicate(oldExpr: Expression, newExpr: Expression): Expression =
    oldExpr < newExpr

  override protected def orderingUpdater(oldExpr: Expression, newExpr: Expression): Expression =
    least(oldExpr, newExpr)
}
