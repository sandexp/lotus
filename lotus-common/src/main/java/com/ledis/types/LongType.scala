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
 * The data type representing `Long` values. Please use the singleton `DataTypes.LongType`.
 */
class LongType extends IntegralType {
  type InternalType = Long
  @transient lazy val tag = typeTag[InternalType]
  val numeric = implicitly[Numeric[Long]]
  val integral = implicitly[Integral[Long]]
  val ordering = implicitly[Ordering[InternalType]]
  override val exactNumeric = LongExactNumeric

  /**
   * The default size of a value of the LongType is 8 bytes.
   */
  override def defaultSize: Int = 8

  override def simpleString: String = "bigint"

  override def asNullable: LongType = this
}

case object LongType extends LongType
