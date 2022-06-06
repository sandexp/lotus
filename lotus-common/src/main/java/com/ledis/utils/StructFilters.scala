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

import com.ledis.expressions.expression.{Contains, EndsWith, Expression, StartsWith}
import com.ledis.expressions.predicate._
import com.ledis.expressions.projection.Literal
import com.ledis.expressions.util.BoundReference
import com.ledis.sources.Filter
import com.ledis.types.{BooleanType, StructType}
import com.ledis.utils.StructFilters._
import com.ledis.utils.collections.row.InternalRow

import scala.util.Try

/**
 * The class provides API for applying pushed down filters to partially or
 * fully set internal rows that have the struct schema.
 *
 * `StructFilters` assumes that:
 *   - `reset()` is called before any `skipRow()` calls for new row.
 *
 * @param pushedFilters The pushed down source filters. The filters should refer to
 *                      the fields of the provided schema.
 * @param schema The required schema of records from datasource files.
 */
abstract class StructFilters(pushedFilters: Seq[Filter], schema: StructType) {

  protected val filters = StructFilters.pushedFilters(pushedFilters.toArray, schema)

  /**
   * Applies pushed down source filters to the given row assuming that
   * value at `index` has been already set.
   *
   * @param row The row with fully or partially set values.
   * @param index The index of already set value.
   * @return `true` if currently processed row can be skipped otherwise false.
   */
  def skipRow(row: InternalRow, index: Int): Boolean

  /**
   * Resets states of pushed down filters. The method must be called before
   * precessing any new row otherwise `skipRow()` may return wrong result.
   */
  def reset(): Unit

  /**
   * Compiles source filters to a predicate.
   */
  def toPredicate(filters: Seq[Filter]): BasePredicate = {
    val reducedExpr = filters
      .sortBy(_.references.length)
      .flatMap(filterToExpression(_, toRef))
      .reduce(com.ledis.expressions.predicate.And)
    Predicate.create(reducedExpr)
  }

  // Finds a filter attribute in the schema and converts it to a `BoundReference`
  private def toRef(attr: String): Option[BoundReference] = {
    // The names have been normalized and case sensitivity is not a concern here.
    schema.getFieldIndex(attr).map { index =>
      val field = schema(index)
      BoundReference(index, field.dataType, field.nullable)
    }
  }
}

object StructFilters {
  private def checkFilterRefs(filter: Filter, fieldNames: Set[String]): Boolean = {
    // The names have been normalized and case sensitivity is not a concern here.
    filter.references.forall(fieldNames.contains)
  }

  /**
   * Returns the filters currently supported by the datasource.
   * @param filters The filters pushed down to the datasource.
   * @param schema data schema of datasource files.
   * @return a sub-set of `filters` that can be handled by the datasource.
   */
  def pushedFilters(filters: Array[Filter], schema: StructType): Array[Filter] = {
    val fieldNames = schema.fieldNames.toSet
    filters.filter(checkFilterRefs(_, fieldNames))
  }

  private def zip[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = {
    a.zip(b).headOption
  }

  private def toLiteral(value: Any): Option[Literal] = {
    Try(Literal(value)).toOption
  }

  /**
   * Converts a filter to an expression and binds it to row positions.
   *
   * @param filter The filter to convert.
   * @param toRef The function converts a filter attribute to a bound reference.
   * @return some expression with resolved attributes or `None` if the conversion
   *         of the given filter to an expression is impossible.
   */
  def filterToExpression(
      filter: Filter,
      toRef: String => Option[BoundReference]): Option[Expression] = {
    def zipAttributeAndValue(name: String, value: Any): Option[(BoundReference, Literal)] = {
      zip(toRef(name), toLiteral(value))
    }
    def translate(filter: Filter): Option[Expression] = filter match {
      case com.ledis.sources.And(left, right) =>
        zip(translate(left), translate(right)).map(com.ledis.expressions.predicate.And.tupled)
      case com.ledis.sources.Or(left, right) =>
        zip(translate(left), translate(right)).map(com.ledis.expressions.predicate.Or.tupled)
      case com.ledis.sources.Not(child) =>
        translate(child).map(com.ledis.expressions.predicate.Not)
      case com.ledis.sources.EqualTo(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(com.ledis.expressions.predicate.EqualTo.tupled)
      case com.ledis.sources.EqualNullSafe(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(com.ledis.expressions.predicate.EqualNullSafe.tupled)
      case com.ledis.sources.IsNull(attribute) =>
        toRef(attribute).map(com.ledis.expressions.expression.IsNull)
      case com.ledis.sources.IsNotNull(attribute) =>
        toRef(attribute).map(com.ledis.expressions.expression.IsNotNull)
      case com.ledis.sources.In(attribute, values) =>
        val literals = values.toSeq.flatMap(toLiteral)
        if (literals.length == values.length) {
          toRef(attribute).map(In(_, literals))
        } else {
          None
        }
      case com.ledis.sources.GreaterThan(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(com.ledis.expressions.predicate.GreaterThan.tupled)
      case com.ledis.sources.GreaterThanOrEqual(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(com.ledis.expressions.predicate.GreaterThanOrEqual.tupled)
      case com.ledis.sources.LessThan(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(com.ledis.expressions.predicate.LessThan.tupled)
      case com.ledis.sources.LessThanOrEqual(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(com.ledis.expressions.predicate.LessThanOrEqual.tupled)
      case com.ledis.sources.StringContains(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(Contains.tupled)
      case com.ledis.sources.StringStartsWith(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(StartsWith.tupled)
      case com.ledis.sources.StringEndsWith(attribute, value) =>
        zipAttributeAndValue(attribute, value).map(EndsWith.tupled)
      case com.ledis.sources.AlwaysTrue() =>
        Some(Literal(true, BooleanType))
      case com.ledis.sources.AlwaysFalse() =>
        Some(Literal(false, BooleanType))
    }
    translate(filter)
  }
}

class NoopFilters extends StructFilters(Seq.empty, new StructType()) {
  override def skipRow(row: InternalRow, index: Int): Boolean = false
  override def reset(): Unit = {}
}
