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

import com.ledis.expressions.codegen.{CodeGenerator, CodegenContext, ExprCode, FalseLiteral}
import com.ledis.expressions.codegen.Block._
import com.ledis.expressions.expression.{LeafExpression, Nondeterministic}
import com.ledis.types.{DataType, LongType, StringType}
import com.ledis.utils.{InputFileBlockHolder, UTF8String}
import com.ledis.utils.collections.row.InternalRow

case class InputFileName() extends LeafExpression with Nondeterministic {

  override def nullable: Boolean = false

  override def dataType: DataType = StringType

  override def prettyName: String = "input_file_name"

  override protected def initializeInternal(partitionIndex: Int): Unit = {}

  override protected def evalInternal(input: InternalRow): UTF8String = {
    InputFileBlockHolder.getInputFilePath
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val className = InputFileBlockHolder.getClass.getName.stripSuffix("$")
    val typeDef = s"final ${CodeGenerator.javaType(dataType)}"
    ev.copy(code = code"$typeDef ${ev.value} = $className.getInputFilePath();",
      isNull = FalseLiteral)
  }
}

case class InputFileBlockStart() extends LeafExpression with Nondeterministic {
  override def nullable: Boolean = false

  override def dataType: DataType = LongType

  override def prettyName: String = "input_file_block_start"

  override protected def initializeInternal(partitionIndex: Int): Unit = {}

  override protected def evalInternal(input: InternalRow): Long = {
    InputFileBlockHolder.getStartOffset
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val className = InputFileBlockHolder.getClass.getName.stripSuffix("$")
    val typeDef = s"final ${CodeGenerator.javaType(dataType)}"
    ev.copy(code = code"$typeDef ${ev.value} = $className.getStartOffset();", isNull = FalseLiteral)
  }
}

case class InputFileBlockLength() extends LeafExpression with Nondeterministic {
  override def nullable: Boolean = false

  override def dataType: DataType = LongType

  override def prettyName: String = "input_file_block_length"

  override protected def initializeInternal(partitionIndex: Int): Unit = {}

  override protected def evalInternal(input: InternalRow): Long = {
    InputFileBlockHolder.getLength
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val className = InputFileBlockHolder.getClass.getName.stripSuffix("$")
    val typeDef = s"final ${CodeGenerator.javaType(dataType)}"
    ev.copy(code = code"$typeDef ${ev.value} = $className.getLength();", isNull = FalseLiteral)
  }
}
