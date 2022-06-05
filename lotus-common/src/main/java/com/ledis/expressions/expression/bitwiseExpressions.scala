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

import com.ledis.expressions.codegen._
import com.ledis.expressions.{BinaryArithmetic, ExpectsInputTypes}
import com.ledis.types._


/**
 * A function that calculates bitwise and(&) of two numbers.
 *
 * Code generation inherited from BinaryArithmetic.
 */

case class BitwiseAnd(left: Expression, right: Expression) extends BinaryArithmetic {

  protected override val failOnError: Boolean = false

  override def inputType: AbstractDataType = IntegralType

  override def symbol: String = "&"

  private lazy val and: (Any, Any) => Any = dataType match {
    case ByteType =>
      ((evalE1: Byte, evalE2: Byte) => (evalE1 & evalE2).toByte).asInstanceOf[(Any, Any) => Any]
    case ShortType =>
      ((evalE1: Short, evalE2: Short) => (evalE1 & evalE2).toShort).asInstanceOf[(Any, Any) => Any]
    case IntegerType =>
      ((evalE1: Int, evalE2: Int) => evalE1 & evalE2).asInstanceOf[(Any, Any) => Any]
    case LongType =>
      ((evalE1: Long, evalE2: Long) => evalE1 & evalE2).asInstanceOf[(Any, Any) => Any]
  }

  protected override def nullSafeEval(input1: Any, input2: Any): Any = and(input1, input2)
}

/**
 * A function that calculates bitwise or(|) of two numbers.
 *
 * Code generation inherited from BinaryArithmetic.
 */
case class BitwiseOr(left: Expression, right: Expression) extends BinaryArithmetic {

  protected override val failOnError: Boolean = false

  override def inputType: AbstractDataType = IntegralType

  override def symbol: String = "|"

  private lazy val or: (Any, Any) => Any = dataType match {
    case ByteType =>
      ((evalE1: Byte, evalE2: Byte) => (evalE1 | evalE2).toByte).asInstanceOf[(Any, Any) => Any]
    case ShortType =>
      ((evalE1: Short, evalE2: Short) => (evalE1 | evalE2).toShort).asInstanceOf[(Any, Any) => Any]
    case IntegerType =>
      ((evalE1: Int, evalE2: Int) => evalE1 | evalE2).asInstanceOf[(Any, Any) => Any]
    case LongType =>
      ((evalE1: Long, evalE2: Long) => evalE1 | evalE2).asInstanceOf[(Any, Any) => Any]
  }

  protected override def nullSafeEval(input1: Any, input2: Any): Any = or(input1, input2)
}

/**
 * A function that calculates bitwise xor({@literal ^}) of two numbers.
 *
 * Code generation inherited from BinaryArithmetic.
 */
case class BitwiseXor(left: Expression, right: Expression) extends BinaryArithmetic {

  protected override val failOnError: Boolean = false

  override def inputType: AbstractDataType = IntegralType

  override def symbol: String = "^"

  private lazy val xor: (Any, Any) => Any = dataType match {
    case ByteType =>
      ((evalE1: Byte, evalE2: Byte) => (evalE1 ^ evalE2).toByte).asInstanceOf[(Any, Any) => Any]
    case ShortType =>
      ((evalE1: Short, evalE2: Short) => (evalE1 ^ evalE2).toShort).asInstanceOf[(Any, Any) => Any]
    case IntegerType =>
      ((evalE1: Int, evalE2: Int) => evalE1 ^ evalE2).asInstanceOf[(Any, Any) => Any]
    case LongType =>
      ((evalE1: Long, evalE2: Long) => evalE1 ^ evalE2).asInstanceOf[(Any, Any) => Any]
  }

  protected override def nullSafeEval(input1: Any, input2: Any): Any = xor(input1, input2)
}

/**
 * A function that calculates bitwise not(~) of a number.
 */
case class BitwiseNot(child: Expression)
  extends UnaryExpression with ExpectsInputTypes with NullIntolerant {

  override def inputTypes: Seq[AbstractDataType] = Seq(IntegralType)

  override def dataType: DataType = child.dataType

  override def toString: String = s"~$child"

  private lazy val not: (Any) => Any = dataType match {
    case ByteType =>
      ((evalE: Byte) => (~evalE).toByte).asInstanceOf[(Any) => Any]
    case ShortType =>
      ((evalE: Short) => (~evalE).toShort).asInstanceOf[(Any) => Any]
    case IntegerType =>
      ((evalE: Int) => ~evalE).asInstanceOf[(Any) => Any]
    case LongType =>
      ((evalE: Long) => ~evalE).asInstanceOf[(Any) => Any]
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, c => s"(${CodeGenerator.javaType(dataType)}) ~($c)")
  }

  protected override def nullSafeEval(input: Any): Any = not(input)

  override def sql: String = s"~${child.sql}"
}

case class BitwiseCount(child: Expression)
  extends UnaryExpression with ExpectsInputTypes with NullIntolerant {

  override def inputTypes: Seq[AbstractDataType] = Seq(TypeCollection(IntegralType, BooleanType))

  override def dataType: DataType = IntegerType

  override def toString: String = s"bit_count($child)"

  override def prettyName: String = "bit_count"

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = child.dataType match {
    case BooleanType => defineCodeGen(ctx, ev, c => s"if ($c) 1 else 0")
    case _ => defineCodeGen(ctx, ev, c => s"java.lang.Long.bitCount($c)")
  }

  protected override def nullSafeEval(input: Any): Any = child.dataType match {
    case BooleanType => if (input.asInstanceOf[Boolean]) 1 else 0
    case ByteType => java.lang.Long.bitCount(input.asInstanceOf[Byte])
    case ShortType => java.lang.Long.bitCount(input.asInstanceOf[Short])
    case IntegerType => java.lang.Long.bitCount(input.asInstanceOf[Int])
    case LongType => java.lang.Long.bitCount(input.asInstanceOf[Long])
  }
}
