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
import com.ledis.config.SQLConf
import com.ledis.dsl.expressions._
import com.ledis.expressions.expression.{AttributeReference, Expression, If, IsNull}
import com.ledis.expressions.predicate.Or
import com.ledis.expressions.projection.Literal
import com.ledis.types._

case class Count(children: Seq[Expression]) extends DeclarativeAggregate {

  override def nullable: Boolean = false

  // Return data type.
  override def dataType: DataType = LongType

  override def checkInputDataTypes(): TypeCheckResult = {
    if (children.isEmpty && !SQLConf.get.getConf(SQLConf.ALLOW_PARAMETERLESS_COUNT).asInstanceOf[Boolean]) {
      TypeCheckResult.TypeCheckFailure(s"$prettyName requires at least one argument. " +
        s"If you have to call the function $prettyName without arguments, set the legacy " +
        s"configuration `${SQLConf.ALLOW_PARAMETERLESS_COUNT.key}` as true")
    } else {
      TypeCheckResult.TypeCheckSuccess
    }
  }

  protected lazy val count = AttributeReference("count", LongType, nullable = false)()

  override lazy val aggBufferAttributes = count :: Nil

  override lazy val initialValues = Seq(
    /* count = */ Literal(0L)
  )

  override lazy val mergeExpressions = Seq(
    /* count = */ count.left + count.right
  )

  override lazy val evaluateExpression = count

  override def defaultResult: Option[Literal] = Option(Literal(0L))

  override lazy val updateExpressions = {
    val nullableChildren = children.filter(_.nullable)
    if (nullableChildren.isEmpty) {
      Seq(
        /* count = */ count + 1L
      )
    } else {
      Seq(
        /* count = */ If(nullableChildren.map(IsNull).reduce(Or), count, count + 1L)
      )
    }
  }
}

object Count {
  def apply(child: Expression): Count = Count(child :: Nil)
}
