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

package com.ledis.types

import scala.math.{Integral, Numeric, Ordering}
import scala.reflect.runtime.universe.typeTag


/**
 * The data type representing `Byte` values. Please use the singleton `DataTypes.ByteType`.
 */
class ByteType extends IntegralType {
  
  type InternalType = Byte
  @transient lazy val tag = typeTag[InternalType]
  val numeric = implicitly[Numeric[Byte]]
  val integral = implicitly[Integral[Byte]]
  val ordering = implicitly[Ordering[InternalType]]
  override val exactNumeric = ByteExactNumeric

  /**
   * The default size of a value of the ByteType is 1 byte.
   */
  override def defaultSize: Int = 1

  override def simpleString: String = "tinyint"

  override def asNullable: ByteType = this
}

case object ByteType extends ByteType
