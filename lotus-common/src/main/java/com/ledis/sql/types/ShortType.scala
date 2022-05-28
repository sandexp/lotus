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

import scala.math.{Integral, Numeric, Ordering}
import scala.reflect.runtime.universe.typeTag

/**
 * The data type representing `Short` values. Please use the singleton `DataTypes.ShortType`.
 */
class ShortType private() extends IntegralType {
  // The companion object and this class is separated so the companion object also subclasses
  // this type. Otherwise, the companion object would be of type "ShortType$" in byte code.
  // Defined with a private constructor so the companion object is the only possible instantiation.
  type InternalType = Short
  @transient lazy val tag = typeTag[InternalType]
  val numeric = implicitly[Numeric[Short]]
  val integral = implicitly[Integral[Short]]
  val ordering = implicitly[Ordering[InternalType]]
  override val exactNumeric = ShortExactNumeric

  /**
   * The default size of a value of the ShortType is 2 bytes.
   */
  override def defaultSize: Int = 2

  override def simpleString: String = "smallint"

  override def asNullable: ShortType = this
}

case object ShortType extends ShortType
