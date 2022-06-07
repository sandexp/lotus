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

import com.ledis.catalog.CatalogTypes.TablePartitionSpec
import com.ledis.catalog.support.SupportsPartitionManagement
import com.ledis.expressions.projection.{Cast, Literal}
import com.ledis.plans.logical.{AlterTableAddPartition, AlterTableDropPartition, LogicalPlan, ShowPartitions}
import com.ledis.rules.Rule
import com.ledis.types._
import com.ledis.utils.collections.row.InternalRow
import com.ledis.utils.util.CharVarcharUtils
import com.ledis.utils.PartitioningUtils._

/**
 * Resolve [[UnresolvedPartitionSpec]] to [[ResolvedPartitionSpec]] in partition related commands.
 */
object ResolvePartitionSpec extends Rule[LogicalPlan] {

  def apply(plan: LogicalPlan): LogicalPlan = plan resolveOperators {
    case r @ AlterTableAddPartition(
        ResolvedTable(_, _, table: SupportsPartitionManagement), partSpecs, _) =>
      val partitionSchema = table.partitionSchema()
      r.copy(parts = resolvePartitionSpecs(
        table.name,
        partSpecs,
        partitionSchema,
        requireExactMatchedPartitionSpec(table.name, _, partitionSchema.fieldNames)))

    case r @ AlterTableDropPartition(
        ResolvedTable(_, _, table: SupportsPartitionManagement), partSpecs, _, _, _) =>
      val partitionSchema = table.partitionSchema()
      r.copy(parts = resolvePartitionSpecs(
        table.name,
        partSpecs,
        partitionSchema,
        requireExactMatchedPartitionSpec(table.name, _, partitionSchema.fieldNames)))

    case r @ ShowPartitions(ResolvedTable(_, _, table: SupportsPartitionManagement), partSpecs) =>
      r.copy(pattern = resolvePartitionSpecs(
        table.name,
        partSpecs.toSeq,
        table.partitionSchema()).headOption)
  }

  private def resolvePartitionSpecs(
      tableName: String,
      partSpecs: Seq[PartitionSpec],
      partSchema: StructType,
      checkSpec: TablePartitionSpec => Unit = _ => ()): Seq[ResolvedPartitionSpec] =
    partSpecs.map {
      case unresolvedPartSpec: UnresolvedPartitionSpec =>
        val normalizedSpec = normalizePartitionSpec(
          unresolvedPartSpec.spec,
          partSchema,
          tableName,
          conf.resolver)
        checkSpec(normalizedSpec)
        val partitionNames = normalizedSpec.keySet
        val requestedFields = partSchema.filter(field => partitionNames.contains(field.name))
        ResolvedPartitionSpec(
          requestedFields.map(_.name),
          convertToPartIdent(normalizedSpec, requestedFields),
          unresolvedPartSpec.location)
      case resolvedPartitionSpec: ResolvedPartitionSpec =>
        resolvedPartitionSpec
    }

  private def convertToPartIdent(
      partitionSpec: TablePartitionSpec,
      schema: Seq[StructField]): InternalRow = {
    val partValues = schema.map { part =>
      val raw = partitionSpec.get(part.name).orNull
      val dt = CharVarcharUtils.replaceCharVarcharWithString(part.dataType)
      Cast(Literal.create(raw, StringType), dt, Some(conf.sessionLocalTimeZone)).eval()
    }
    InternalRow.fromSeq(partValues)
  }
}
