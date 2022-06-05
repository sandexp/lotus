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

import com.ledis.utils.util.TypeUtils

import scala.reflect.runtime.universe.typeTag

// import com.ledis.annotation.Stable

/**
 * The data type representing `Array[Byte]` values.
 * Please use the singleton `DataTypes.BinaryType`.
 */
class BinaryType extends AtomicType {
  
  type InternalType = Array[Byte]

  @transient lazy val tag = typeTag[InternalType]

  val ordering =
    (x: Array[Byte], y: Array[Byte]) => TypeUtils.compareBinary(x, y)

  /**
   * The default size of a value of the BinaryType is 100 bytes.
   */
  override def defaultSize: Int = 100

  override def asNullable: BinaryType = this
}

case object BinaryType extends BinaryType
