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

package com.ledis.catalog.extension;

import com.ledis.catalog.CatalogPlugin;
import com.ledis.catalog.support.SupportsNamespaces;
import com.ledis.catalog.table.TableCatalog;
import com.ledis.utils.collections.CaseInsensitiveStringMap;

/**
 * An API to extend the Spark built-in session catalog. Implementation can get the built-in session
 * catalog from {@link #setDelegateCatalog(CatalogPlugin)}, implement catalog functions with
 * some custom logic and call the built-in session catalog at the end. For example, they can
 * implement {@code createTable}, do something else before calling {@code createTable} of the
 * built-in session catalog.
 */
public interface CatalogExtension extends TableCatalog, SupportsNamespaces {

  /**
   * This will be called only once by Spark to pass in the Spark built-in session catalog, after
   * {@link #initialize(String, CaseInsensitiveStringMap)} is called.
   */
  void setDelegateCatalog(CatalogPlugin delegate);
}
