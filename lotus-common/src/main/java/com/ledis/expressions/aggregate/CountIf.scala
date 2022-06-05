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
import com.ledis.expressions.expression.{Expression, UnevaluableAggregate}
import com.ledis.expressions.ImplicitCastInputTypes
import com.ledis.types.{AbstractDataType, BooleanType, DataType, LongType}

case class CountIf(predicate: Expression) extends UnevaluableAggregate with ImplicitCastInputTypes {
  override def prettyName: String = "count_if"

  override def children: Seq[Expression] = Seq(predicate)

  override def nullable: Boolean = false

  override def dataType: DataType = LongType

  override def inputTypes: Seq[AbstractDataType] = Seq(BooleanType)

  override def checkInputDataTypes(): TypeCheckResult = predicate.dataType match {
    case BooleanType =>
      TypeCheckResult.TypeCheckSuccess
    case _ =>
      TypeCheckResult.TypeCheckFailure(
        s"function $prettyName requires boolean type, not ${predicate.dataType.catalogString}"
      )
  }
}
