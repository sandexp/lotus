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

import com.ledis.expressions._
import com.ledis.expressions.expression.{AttributeReference, BitwiseAnd, BitwiseOr, BitwiseXor, Expression, If, IsNull}
import com.ledis.expressions.projection.Literal
import com.ledis.types.{AbstractDataType, DataType, IntegralType}

abstract class BitAggregate extends DeclarativeAggregate with ExpectsInputTypes {

  val child: Expression

  def bitOperator(left: Expression, right: Expression): BinaryArithmetic

  override def children: Seq[Expression] = child :: Nil

  override def nullable: Boolean = true

  override def dataType: DataType = child.dataType

  override def inputTypes: Seq[AbstractDataType] = Seq(IntegralType)

  private lazy val bitAgg = AttributeReference(nodeName, child.dataType)()

  override lazy val initialValues: Seq[Literal] = Literal.create(null, dataType) :: Nil

  override lazy val aggBufferAttributes: Seq[AttributeReference] = bitAgg :: Nil

  override lazy val evaluateExpression: AttributeReference = bitAgg

  override lazy val updateExpressions: Seq[Expression] =
    If(IsNull(bitAgg),
      child,
      If(IsNull(child), bitAgg, bitOperator(bitAgg, child))) :: Nil

  override lazy val mergeExpressions: Seq[Expression] =
    If(IsNull(bitAgg.left),
      bitAgg.right,
      If(IsNull(bitAgg.right), bitAgg.left, bitOperator(bitAgg.left, bitAgg.right))) :: Nil
}

case class BitAndAgg(child: Expression) extends BitAggregate {

  override def nodeName: String = "bit_and"

  override def bitOperator(left: Expression, right: Expression): BinaryArithmetic = {
    BitwiseAnd(left, right)
  }
}

case class BitOrAgg(child: Expression) extends BitAggregate {

  override def nodeName: String = "bit_or"

  override def bitOperator(left: Expression, right: Expression): BinaryArithmetic = {
    BitwiseOr(left, right)
  }
}

case class BitXorAgg(child: Expression) extends BitAggregate {

  override def nodeName: String = "bit_xor"

  override def bitOperator(left: Expression, right: Expression): BinaryArithmetic = {
    BitwiseXor(left, right)
  }
}
