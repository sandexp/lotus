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

package com.ledis.sql.types

import scala.math.Ordering
import scala.reflect.runtime.universe.typeTag


/**
 * The data type representing `Boolean` values. Please use the singleton `DataTypes.BooleanType`.
 *
 * @since 1.3.0
 */
class BooleanType private() extends AtomicType {
  // The companion object and this class is separated so the companion object also subclasses
  // this type. Otherwise, the companion object would be of type "BooleanType$" in byte code.
  // Defined with a private constructor so the companion object is the only possible instantiation.
  type InternalType = Boolean
  @transient lazy val tag = typeTag[InternalType]
  val ordering = implicitly[Ordering[InternalType]]

  /**
   * The default size of a value of the BooleanType is 1 byte.
   */
  override def defaultSize: Int = 1

  override def asNullable: BooleanType = this
}

/**
 * @since 1.3.0
 */
// @Stable
case object BooleanType extends BooleanType
