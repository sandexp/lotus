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

package com.ledis.codec

import java.util.concurrent.ConcurrentMap

import com.google.common.collect.MapMaker
import com.ledis.utils.Utils


object OuterScopes {
  @transient
  lazy val outerScopes: ConcurrentMap[String, AnyRef] =
    new MapMaker().weakValues().makeMap()

  /**
   * Adds a new outer scope to this context that can be used when instantiating an `inner class`
   * during deserialization. Inner classes are created when a case class is defined in the
   * Spark REPL and registering the outer scope that this class was defined in allows us to create
   * new instances on the spark executors.  In normal use, users should not need to call this
   * function.
   *
   * Warning: this function operates on the assumption that there is only ever one instance of any
   * given wrapper class.
   */
  def addOuterScope(outer: AnyRef): Unit = {
    outerScopes.putIfAbsent(outer.getClass.getName, outer)
  }

  /**
   * Returns a function which can get the outer scope for the given inner class.  By using function
   * as return type, we can delay the process of getting outer pointer to execution time, which is
   * useful for inner class defined in REPL.
   */
  def getOuterScope(innerCls: Class[_]): () => AnyRef = {
    assert(Utils.isMemberClass(innerCls))
    val outerClassName = innerCls.getDeclaringClass.getName
    val outer = outerScopes.get(outerClassName)
    if (outer == null) {
      outerClassName match {
        case AmmoniteREPLClass(cellClassName) =>
          () => {
            val objClass = Utils.classForName(cellClassName)
            val objInstance = objClass.getField("MODULE$").get(null)
            objClass.getMethod("instance").invoke(objInstance)
          }
        // If the outer class is generated by REPL, users don't need to register it as it has
        // only one instance and there is a way to retrieve it: get the `$read` object, call the
        // `INSTANCE()` method to get the single instance of class `$read`. Then call `$iw()`
        // method multiply times to get the single instance of the inner most `$iw` class.
        case REPLClass(baseClassName) =>
          () => {
            val objClass = Utils.classForName(baseClassName + "$")
            val objInstance = objClass.getField("MODULE$").get(null)
            val baseInstance = objClass.getMethod("INSTANCE").invoke(objInstance)
            val baseClass = Utils.classForName(baseClassName)

            var getter = iwGetter(baseClass)
            var obj = baseInstance
            while (getter != null) {
              obj = getter.invoke(obj)
              getter = iwGetter(getter.getReturnType)
            }

            if (obj == null) {
              throw new RuntimeException(s"Failed to get outer pointer for ${innerCls.getName}")
            }

            outerScopes.putIfAbsent(outerClassName, obj)
            obj
          }
        case _ => null
      }
    } else {
      () => outer
    }
  }

  private def iwGetter(cls: Class[_]) = {
    try {
      cls.getMethod("$iw")
    } catch {
      case _: NoSuchMethodException => null
    }
  }

  // The format of REPL generated wrapper class's name, e.g. `$line12.$read$$iw$$iw`
  private[this] val REPLClass = """^(\$line(?:\d+)\.\$read)(?:\$\$iw)+$""".r

  // The format of ammonite REPL generated wrapper class's name,
  // e.g. `ammonite.$sess.cmd8$Helper$Foo` -> `ammonite.$sess.cmd8.instance.Foo`
  private[this] val AmmoniteREPLClass = """^(ammonite\.\$sess\.cmd(?:\d+)\$).*""".r
}
