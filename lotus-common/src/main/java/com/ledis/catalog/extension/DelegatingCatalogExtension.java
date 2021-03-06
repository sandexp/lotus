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

import java.util.Map;

import com.ledis.catalog.CatalogPlugin;
import com.ledis.catalog.Identifier;
import com.ledis.catalog.NamespaceChange;
import com.ledis.catalog.support.SupportsNamespaces;
import com.ledis.catalog.table.Table;
import com.ledis.catalog.table.TableCatalog;
import com.ledis.catalog.table.TableChange;
import com.ledis.exception.NamespaceAlreadyExistsException;
import com.ledis.exception.NoSuchNamespaceException;
import com.ledis.exception.NoSuchTableException;
import com.ledis.exception.TableAlreadyExistsException;
import com.ledis.types.StructType;
import com.ledis.utils.collections.CaseInsensitiveStringMap;
import com.ledis.utils.expressions.Transform;

/**
 * A simple implementation of {@link CatalogExtension}, which implements all the catalog functions
 * by calling the built-in session catalog directly. This is created for convenience, so that users
 * only need to override some methods where they want to apply custom logic. For example, they can
 * override {@code createTable}, do something else before calling {@code super.createTable}.
 */
public abstract class DelegatingCatalogExtension implements CatalogExtension {

  private CatalogPlugin delegate;

  public final void setDelegateCatalog(CatalogPlugin delegate) {
    this.delegate = delegate;
  }

  @Override
  public String name() {
    return delegate.name();
  }

  @Override
  public final void initialize(String name, CaseInsensitiveStringMap options) {}

  @Override
  public String[] defaultNamespace() {
    return delegate.defaultNamespace();
  }

  @Override
  public Identifier[] listTables(String[] namespace) throws NoSuchNamespaceException {
    return asTableCatalog().listTables(namespace);
  }

  @Override
  public Table loadTable(Identifier ident) throws NoSuchTableException {
    return asTableCatalog().loadTable(ident);
  }

  @Override
  public void invalidateTable(Identifier ident) {
    asTableCatalog().invalidateTable(ident);
  }

  @Override
  public boolean tableExists(Identifier ident) {
    return asTableCatalog().tableExists(ident);
  }

  @Override
  public Table createTable(
      Identifier ident,
      StructType schema,
      Transform[] partitions,
      Map<String, String> properties) throws TableAlreadyExistsException, NoSuchNamespaceException {
    return asTableCatalog().createTable(ident, schema, partitions, properties);
  }

  @Override
  public Table alterTable(
      Identifier ident,
      TableChange... changes) throws NoSuchTableException {
    return asTableCatalog().alterTable(ident, changes);
  }

  @Override
  public boolean dropTable(Identifier ident) {
    return asTableCatalog().dropTable(ident);
  }

  @Override
  public boolean purgeTable(Identifier ident) {
    return asTableCatalog().purgeTable(ident);
  }

  @Override
  public void renameTable(
      Identifier oldIdent,
      Identifier newIdent) throws NoSuchTableException, TableAlreadyExistsException {
    asTableCatalog().renameTable(oldIdent, newIdent);
  }

  @Override
  public String[][] listNamespaces() throws NoSuchNamespaceException {
    return asNamespaceCatalog().listNamespaces();
  }

  @Override
  public String[][] listNamespaces(String[] namespace) throws NoSuchNamespaceException {
    return asNamespaceCatalog().listNamespaces(namespace);
  }

  @Override
  public boolean namespaceExists(String[] namespace) {
    return asNamespaceCatalog().namespaceExists(namespace);
  }

  @Override
  public Map<String, String> loadNamespaceMetadata(
      String[] namespace) throws NoSuchNamespaceException {
    return asNamespaceCatalog().loadNamespaceMetadata(namespace);
  }

  @Override
  public void createNamespace(
      String[] namespace,
      Map<String, String> metadata) throws NamespaceAlreadyExistsException {
    asNamespaceCatalog().createNamespace(namespace, metadata);
  }

  @Override
  public void alterNamespace(
      String[] namespace,
      NamespaceChange... changes) throws NoSuchNamespaceException {
    asNamespaceCatalog().alterNamespace(namespace, changes);
  }

  @Override
  public boolean dropNamespace(String[] namespace) throws NoSuchNamespaceException {
    return asNamespaceCatalog().dropNamespace(namespace);
  }

  private TableCatalog asTableCatalog() {
    return (TableCatalog)delegate;
  }

  private SupportsNamespaces asNamespaceCatalog() {
    return (SupportsNamespaces)delegate;
  }
}
