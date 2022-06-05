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

package com.ledis.analysis

import com.ledis.catalog.{CatalogPlugin, Identifier}
import com.ledis.catalog.CatalogTypes.TablePartitionSpec
import com.ledis.catalog.table.{Table, TableCatalog}
import com.ledis.expressions.expression.Attribute
import com.ledis.plans.logical.LeafNode
import com.ledis.utils.collections.row.InternalRow

/**
 * Holds the name of a namespace that has yet to be looked up in a catalog. It will be resolved to
 * [[ResolvedNamespace]] during analysis.
 */
case class UnresolvedNamespace(multipartIdentifier: Seq[String]) extends LeafNode {
  override lazy val resolved: Boolean = false

  override def output: Seq[Attribute] = Nil
}

/**
 * Holds the name of a table that has yet to be looked up in a catalog. It will be resolved to
 * [[ResolvedTable]] during analysis.
 */
case class UnresolvedTable(
    multipartIdentifier: Seq[String],
    commandName: String) extends LeafNode {
  override lazy val resolved: Boolean = false

  override def output: Seq[Attribute] = Nil
}

/**
 * Holds the name of a table or view that has yet to be looked up in a catalog. It will
 * be resolved to [[ResolvedTable]] or [[ResolvedView]] during analysis.
 */
case class UnresolvedTableOrView(
    multipartIdentifier: Seq[String],
    commandName: String,
    allowTempView: Boolean = true) extends LeafNode {
  override lazy val resolved: Boolean = false
  override def output: Seq[Attribute] = Nil
}

sealed trait PartitionSpec

case class UnresolvedPartitionSpec(
    spec: TablePartitionSpec,
    location: Option[String] = None) extends PartitionSpec

/**
 * Holds the name of a function that has yet to be looked up in a catalog. It will be resolved to
 * [[ResolvedFunc]] during analysis.
 */
case class UnresolvedFunc(multipartIdentifier: Seq[String]) extends LeafNode {
  override lazy val resolved: Boolean = false
  override def output: Seq[Attribute] = Nil
}

/**
 * A plan containing resolved namespace.
 */
case class ResolvedNamespace(catalog: CatalogPlugin, namespace: Seq[String])
  extends LeafNode {
  override def output: Seq[Attribute] = Nil
}

/**
 * A plan containing resolved table.
 */
case class ResolvedTable(catalog: TableCatalog, identifier: Identifier, table: Table)
  extends LeafNode {
  override def output: Seq[Attribute] = Nil
}

case class ResolvedPartitionSpec(
    names: Seq[String],
    ident: InternalRow,
    location: Option[String] = None) extends PartitionSpec

/**
 * A plan containing resolved (temp) views.
 */
case class ResolvedView(identifier: Identifier, isTemp: Boolean) extends LeafNode {
  override def output: Seq[Attribute] = Nil
}

/**
 * A plan containing resolved function.
 */
case class ResolvedFunc(identifier: Identifier)
  extends LeafNode {
  override def output: Seq[Attribute] = Nil
}
