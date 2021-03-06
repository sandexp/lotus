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

import com.ledis.catalog.util.CatalogV2Util
import com.ledis.config.{SQLConf, StaticSQLConf}
import com.ledis.exception.{AnalysisException, CatalogNotFoundException}
import com.ledis.utils.{FunctionIdentifier, TableIdentifier}

/**
 * A trait to encapsulate catalog lookup function and helpful extractors.
 */
trait LookupCatalog {

  protected val catalogManager: CatalogManager

  /**
   * Returns the current catalog set.
   */
  def currentCatalog: CatalogPlugin = catalogManager.currentCatalog

  /**
   * Extract catalog plugin and remaining identifier names.
   *
   * This does not substitute the default catalog if no catalog is set in the identifier.
   */
  private object CatalogAndMultipartIdentifier {
    def unapply(parts: Seq[String]): Some[(Option[CatalogPlugin], Seq[String])] = parts match {
      case Seq(_) =>
        Some((None, parts))
      case Seq(catalogName, tail @ _*) =>
        try {
          Some((Some(catalogManager.catalog(catalogName)), tail))
        } catch {
          case _: CatalogNotFoundException =>
            Some((None, parts))
        }
    }
  }

  /**
   * Extract session catalog and identifier from a multi-part identifier.
   */
  object SessionCatalogAndIdentifier {
    import CatalogV2Implicits._

    def unapply(parts: Seq[String]): Option[(CatalogPlugin, Identifier)] = parts match {
      case CatalogAndIdentifier(catalog, ident) if CatalogV2Util.isSessionCatalog(catalog) =>
        if (ident.namespace.length != 1) {
          throw new AnalysisException(
            s"The namespace in session catalog must have exactly one name part: ${parts.quoted}")
        }
        Some(catalog, ident)
      case _ => None
    }
  }

  /**
   * Extract non-session catalog and identifier from a multi-part identifier.
   */
  object NonSessionCatalogAndIdentifier {
    def unapply(parts: Seq[String]): Option[(CatalogPlugin, Identifier)] = parts match {
      case CatalogAndIdentifier(catalog, ident) if !CatalogV2Util.isSessionCatalog(catalog) =>
        Some(catalog, ident)
      case _ => None
    }
  }

  /**
   * Extract catalog and namespace from a multi-part name with the current catalog if needed.
   * Catalog name takes precedence over namespaces.
   */
  object CatalogAndNamespace {
    def unapply(nameParts: Seq[String]): Some[(CatalogPlugin, Seq[String])] = {
      assert(nameParts.nonEmpty)
      try {
        Some((catalogManager.catalog(nameParts.head), nameParts.tail))
      } catch {
        case _: CatalogNotFoundException =>
          Some((currentCatalog, nameParts))
      }
    }
  }

  /**
   * Extract catalog and identifier from a multi-part name with the current catalog if needed.
   * Catalog name takes precedence over identifier, but for a single-part name, identifier takes
   * precedence over catalog name.
   *
   * Note that, this pattern is used to look up permanent catalog objects like table, view,
   * function, etc. If you need to look up temp objects like temp view, please do it separately
   * before calling this pattern, as temp objects don't belong to any catalog.
   */
  object CatalogAndIdentifier {
    import CatalogV2Implicits._
    
    private val globalTempDB = SQLConf.get.getConf(StaticSQLConf.GLOBAL_TEMP_DATABASE).asInstanceOf[String]

    def unapply(nameParts: Seq[String]): Option[(CatalogPlugin, Identifier)] = {
      assert(nameParts.nonEmpty)
      if (nameParts.length == 1) {
        Some((currentCatalog, Identifier.of(catalogManager.currentNamespace, nameParts.head)))
      } else if (nameParts.head.equalsIgnoreCase(globalTempDB)) {
        // Conceptually global temp views are in a special reserved catalog. However, the v2 catalog
        // API does not support view yet, and we have to use v1 commands to deal with global temp
        // views. To simplify the implementation, we put global temp views in a special namespace
        // in the session catalog. The special namespace has higher priority during name resolution.
        // For example, if the name of a custom catalog is the same with `GLOBAL_TEMP_DATABASE`,
        // this custom catalog can't be accessed.
        Some((catalogManager.v2SessionCatalog, nameParts.asIdentifier))
      } else {
        try {
          Some((catalogManager.catalog(nameParts.head), nameParts.tail.asIdentifier))
        } catch {
          case _: CatalogNotFoundException =>
            Some((currentCatalog, nameParts.asIdentifier))
        }
      }
    }
  }

  /**
   * Extract legacy table identifier from a multi-part identifier.
   *
   * For legacy support only. Please use [[CatalogAndIdentifier]] instead on DSv2 code paths.
   */
  object AsTableIdentifier {
    def unapply(parts: Seq[String]): Option[TableIdentifier] = parts match {
      case CatalogAndMultipartIdentifier(None, names)
          if CatalogV2Util.isSessionCatalog(currentCatalog) =>
        names match {
          case Seq(name) =>
            Some(TableIdentifier(name))
          case Seq(database, name) =>
            Some(TableIdentifier(name, Some(database)))
          case _ =>
            None
        }
      case _ =>
        None
    }
  }

  def parseSessionCatalogFunctionIdentifier(nameParts: Seq[String]): FunctionIdentifier = {
    if (nameParts.length == 1 && catalogManager.v1SessionCatalog.isTempFunction(nameParts.head)) {
      return FunctionIdentifier(nameParts.head)
    }

    nameParts match {
      case SessionCatalogAndIdentifier(_, ident) =>
        if (nameParts.length == 1) {
          // If there is only one name part, it means the current catalog is the session catalog.
          // Here we don't fill the default database, to keep the error message unchanged for
          // v1 commands.
          FunctionIdentifier(nameParts.head, None)
        } else {
          ident.namespace match {
            case Array(db) => FunctionIdentifier(ident.name, Some(db))
            case _ =>
              throw new AnalysisException(s"Unsupported function name '$ident'")
          }
        }

      case _ => throw new AnalysisException("function is only supported in v1 catalog")
    }
  }
}
