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

package com.ledis.catalog

import java.lang.reflect.InvocationTargetException
import java.util.NoSuchElementException
import java.util.regex.Pattern

import com.ledis.config.SQLConf
import com.ledis.exception.CatalogNotFoundException
import com.ledis.utils.Utils
import com.ledis.utils.collections.CaseInsensitiveStringMap

object Catalogs {
  /**
   * Load and configure a catalog by name.
   * This loads, instantiates, and initializes the catalog plugin for each call; it does not cache
   * or reuse instances.
   *
   * @param name a String catalog name
   * @param conf a SQLConf
   * @return an initialized CatalogPlugin
   * @throws CatalogNotFoundException if the plugin class cannot be found
   */
  @throws[CatalogNotFoundException]
  def load(name: String, conf: SQLConf): CatalogPlugin = {
    
    val pluginClassName = try {
      conf.getConfString("spark.sql.catalog." + name)
    } catch {
      case _: NoSuchElementException =>
        throw new CatalogNotFoundException(
          s"Catalog '$name' plugin class not found: spark.sql.catalog.$name is not defined")
    }
    val loader = Utils.getContextOrClassLoader
    try {
      val pluginClass = loader.loadClass(pluginClassName)
      if (!classOf[CatalogPlugin].isAssignableFrom(pluginClass)) {
        throw new Exception(
          s"Plugin class for catalog '$name' does not implement CatalogPlugin: $pluginClassName")
      }
      val plugin = pluginClass.getDeclaredConstructor().newInstance().asInstanceOf[CatalogPlugin]
      plugin.initialize(name, catalogOptions(name, conf))
      plugin
    } catch {
      case _: ClassNotFoundException =>
        throw new Exception(
          s"Cannot find catalog plugin class for catalog '$name': $pluginClassName")
      case e: NoSuchMethodException =>
        throw new Exception(
          s"Failed to find public no-arg constructor for catalog '$name': $pluginClassName)", e)
      case e: IllegalAccessException =>
        throw new Exception(
          s"Failed to call public no-arg constructor for catalog '$name': $pluginClassName)", e)
      case e: InstantiationException =>
        throw new Exception("Cannot instantiate abstract catalog plugin class for " +
          s"catalog '$name': $pluginClassName", e.getCause)
      case e: InvocationTargetException =>
        throw new Exception("Failed during instantiating constructor for catalog " +
          s"'$name': $pluginClassName", e.getCause)
    }
  }

  /**
   * Extracts a named catalog's configuration from a SQLConf.
   *
   * @param name a catalog name
   * @param conf a SQLConf
   * @return a case insensitive string map of options starting with spark.sql.catalog.(name).
   */
  private def catalogOptions(name: String, conf: SQLConf) = {
    val prefix = Pattern.compile("^spark\\.sql\\.catalog\\." + name + "\\.(.+)")
    val options = new java.util.HashMap[String, String]
    conf.getAllConfs.foreach {
      case (key, value) =>
        val matcher = prefix.matcher(key)
        if (matcher.matches && matcher.groupCount > 0) options.put(matcher.group(1), value)
    }
    new CaseInsensitiveStringMap(options)
  }
}
