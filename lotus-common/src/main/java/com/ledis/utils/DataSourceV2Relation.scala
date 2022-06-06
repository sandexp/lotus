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

package com.ledis.utils

import com.ledis.analysis.{MultiInstanceRelation, NamedRelation}
import com.ledis.catalog.support.SupportsMetadataColumns
import com.ledis.catalog.table.{Table, TableCapability}
import com.ledis.catalog.{CatalogPlugin, Identifier, MetadataColumn}
import com.ledis.config.SQLConf
import com.ledis.expressions.expression.{Attribute, AttributeReference}
import com.ledis.plans.logical.{LeafNode, LogicalPlan, Statistics}
import com.ledis.utils.collections.CaseInsensitiveStringMap
import com.ledis.utils.reader.{Scan, SupportsReportStatistics}
import com.ledis.utils.util.CharVarcharUtils
import com.sun.scenario.effect.Offset

/**
 * A logical plan representing a data source v2 table.
 *
 * @param table      The table that this relation represents.
 * @param output     the output attributes of this relation.
 * @param catalog    catalogPlugin for the table. None if no catalog is specified.
 * @param identifier the identifier for the table. None if no identifier is defined.
 * @param options    The options for this table operation. It's used to create fresh
 *                   [[com.ledis.utils.reader.ScanBuilder]] and
 *                   [[com.ledis.utils.writer.WriteBuilder]].
 */
case class DataSourceV2Relation(
    table: Table,
    output: Seq[AttributeReference],
    catalog: Option[CatalogPlugin],
    identifier: Option[Identifier],
    options: CaseInsensitiveStringMap)
  extends LeafNode with MultiInstanceRelation with NamedRelation {

  import DataSourceV2Implicits._

  override lazy val metadataOutput: Seq[AttributeReference] = table match {
    case hasMeta: SupportsMetadataColumns =>
      val resolve = SQLConf.get.resolver
      val outputNames = outputSet.map(_.name)
      def isOutputColumn(col: MetadataColumn): Boolean = {
        outputNames.exists(name => resolve(col.name, name))
      }
      // filter out metadata columns that have names conflicting with output columns. if the table
      // has a column "line" and the table can produce a metadata column called "line", then the
      // data column should be returned, not the metadata column.
      hasMeta.metadataColumns.filterNot(isOutputColumn).toAttributes
    case _ =>
      Nil
  }

  override def name: String = table.name()

  override def skipSchemaResolution: Boolean = table.supports(TableCapability.ACCEPT_ANY_SCHEMA)

  override def simpleString(maxFields: Int): String = {
    s"RelationV2${truncatedString(output, "[", ", ", "]", maxFields)} $name"
  }

  override def computeStats(): Statistics = {
    
    // when not testing, return stats because bad stats are better than failing a query
    table.asReadable.newScanBuilder(options) match {
      case r: SupportsReportStatistics =>
        val statistics = r.estimateStatistics()
        DataSourceV2Relation.transformV2Stats(statistics, None, conf.defaultSizeInBytes)
      case _ =>
        Statistics(sizeInBytes = conf.defaultSizeInBytes)
    }
  }

  override def newInstance(): DataSourceV2Relation = {
    copy(output = output.map(_.newInstance()))
  }

  def withMetadataColumns(): DataSourceV2Relation = {
    if (metadataOutput.nonEmpty) {
      DataSourceV2Relation(table, output ++ metadataOutput, catalog, identifier, options)
    } else {
      this
    }
  }
}

/**
 * A logical plan for a DSv2 table with a scan already created.
 *
 * This is used in the optimizer to push filters and projection down before conversion to physical
 * plan. This ensures that the stats that are used by the optimizer account for the filters and
 * projection that will be pushed down.
 *
 * @param relation a [[DataSourceV2Relation]]
 * @param scan a DSv2 [[Scan]]
 * @param output the output attributes of this relation
 */
case class DataSourceV2ScanRelation(
    relation: DataSourceV2Relation,
    scan: Scan,
    output: Seq[AttributeReference]) extends LeafNode with NamedRelation {

  override def name: String = relation.table.name()

  override def simpleString(maxFields: Int): String = {
    s"RelationV2${truncatedString(output, "[", ", ", "]", maxFields)} $name"
  }

  override def computeStats(): Statistics = {
    scan match {
      case r: SupportsReportStatistics =>
        val statistics = r.estimateStatistics()
        DataSourceV2Relation.transformV2Stats(statistics, None, conf.defaultSizeInBytes)
      case _ =>
        Statistics(sizeInBytes = conf.defaultSizeInBytes)
    }
  }
}

/**
 * A specialization of [[DataSourceV2Relation]] with the streaming bit set to true.
 *
 * Note that, this plan has a mutable reader, so Spark won't apply operator push-down for this plan,
 * to avoid making the plan mutable. We should consolidate this plan and [[DataSourceV2Relation]]
 * after we figure out how to apply operator push-down for streaming data sources.
 */
case class StreamingDataSourceV2Relation(
    output: Seq[Attribute],
    scan: Scan,
//    stream: SparkDataStream,
    startOffset: Option[Offset] = None,
    endOffset: Option[Offset] = None)
  extends LeafNode with MultiInstanceRelation {

  override def isStreaming: Boolean = true

  override def newInstance(): LogicalPlan = copy(output = output.map(_.newInstance()))

  override def computeStats(): Statistics = scan match {
    case r: SupportsReportStatistics =>
      val statistics = r.estimateStatistics()
      DataSourceV2Relation.transformV2Stats(statistics, None, conf.defaultSizeInBytes)
    case _ =>
      Statistics(sizeInBytes = conf.defaultSizeInBytes)
  }
}

object DataSourceV2Relation {
  def create(
      table: Table,
      catalog: Option[CatalogPlugin],
      identifier: Option[Identifier],
      options: CaseInsensitiveStringMap): DataSourceV2Relation = {
    // The v2 source may return schema containing char/varchar type. We replace char/varchar
    // with "annotated" string type here as the query engine doesn't support char/varchar yet.
    val schema = CharVarcharUtils.replaceCharVarcharWithStringInSchema(table.schema)
    DataSourceV2Relation(table, schema.toAttributes, catalog, identifier, options)
  }

  def create(
      table: Table,
      catalog: Option[CatalogPlugin],
      identifier: Option[Identifier]): DataSourceV2Relation =
    create(table, catalog, identifier, CaseInsensitiveStringMap.empty)

  /**
   * This is used to transform data source v2 statistics to logical.Statistics.
   */
  def transformV2Stats(
      v2Statistics: V2Statistics,
      defaultRowCount: Option[BigInt],
      defaultSizeInBytes: Long): Statistics = {
    val numRows: Option[BigInt] = if (v2Statistics.numRows().isPresent) {
      Some(v2Statistics.numRows().getAsLong)
    } else {
      defaultRowCount
    }
    Statistics(
      sizeInBytes = v2Statistics.sizeInBytes().orElse(defaultSizeInBytes),
      rowCount = numRows)
  }
}
