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

import com.ledis.analysis.{FunctionRegistry, TypeCheckResult}
import com.ledis.expressions._
import com.ledis.expressions.expression.{Expression, UnevaluableAggregate}
import com.ledis.types.{AbstractDataType, BooleanType, DataType}

abstract class UnevaluableBooleanAggBase(arg: Expression)
  extends UnevaluableAggregate with ImplicitCastInputTypes {

  override def children: Seq[Expression] = arg :: Nil

  override def dataType: DataType = BooleanType

  override def inputTypes: Seq[AbstractDataType] = Seq(BooleanType)

  override def checkInputDataTypes(): TypeCheckResult = {
    arg.dataType match {
      case dt if dt != BooleanType =>
        TypeCheckResult.TypeCheckFailure(s"Input to function '$prettyName' should have been " +
          s"${BooleanType.simpleString}, but it's [${arg.dataType.catalogString}].")
      case _ => TypeCheckResult.TypeCheckSuccess
    }
  }
}

case class BoolAnd(arg: Expression) extends UnevaluableBooleanAggBase(arg) {
  override def nodeName: String = getTagValue(FunctionRegistry.FUNC_ALIAS).getOrElse("bool_and")
}

case class BoolOr(arg: Expression) extends UnevaluableBooleanAggBase(arg) {
  override def nodeName: String = getTagValue(FunctionRegistry.FUNC_ALIAS).getOrElse("bool_or")
}
