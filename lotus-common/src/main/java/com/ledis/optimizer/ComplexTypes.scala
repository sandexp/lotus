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

package com.ledis.optimizer

import com.ledis.expressions._
import com.ledis.expressions.expression.{CaseKeyWhen, If, IsNull}
import com.ledis.expressions.projection.{IntegerLiteral, Literal}
import com.ledis.plans.logical.{Aggregate, LogicalPlan}
import com.ledis.rules.Rule

/**
 * Simplify redundant [[CreateNamedStruct]], [[CreateArray]] and [[CreateMap]] expressions.
 */
object SimplifyExtractValueOps extends Rule[LogicalPlan] {
  override def apply(plan: LogicalPlan): LogicalPlan = plan transform {
    // One place where this optimization is invalid is an aggregation where the select
    // list expression is a function of a grouping expression:
    //
    // SELECT struct(a,b).a FROM tbl GROUP BY struct(a,b)
    //
    // cannot be simplified to SELECT a FROM tbl GROUP BY struct(a,b). So just skip this
    // optimization for Aggregates (although this misses some cases where the optimization
    // can be made).
    case a: Aggregate => a
    case p => p.transformExpressionsUp {
      // Remove redundant field extraction.
      case GetStructField(createNamedStruct: CreateNamedStruct, ordinal, _) =>
        createNamedStruct.valExprs(ordinal)
      case GetStructField(u: UpdateFields, ordinal, _)if !u.structExpr.isInstanceOf[UpdateFields] =>
        val structExpr = u.structExpr
        u.newExprs(ordinal) match {
          // if the struct itself is null, then any value extracted from it (expr) will be null
          // so we don't need to wrap expr in If(IsNull(struct), Literal(null, expr.dataType), expr)
          case expr: GetStructField if expr.child.semanticEquals(structExpr) => expr
          case expr =>
            if (structExpr.nullable) {
              If(IsNull(structExpr), Literal(null, expr.dataType), expr)
            } else {
              expr
            }
        }
      // Remove redundant array indexing.
      case GetArrayStructFields(CreateArray(elems, useStringTypeWhenEmpty), field, ordinal, _, _) =>
        // Instead of selecting the field on the entire array, select it from each member
        // of the array. Pushing down the operation this way may open other optimizations
        // opportunities (i.e. struct(...,x,...).x)
        CreateArray(elems.map(GetStructField(_, ordinal, Some(field.name))), useStringTypeWhenEmpty)

      // Remove redundant map lookup.
      case ga @ GetArrayItem(CreateArray(elems, _), IntegerLiteral(idx), _) =>
        // Instead of creating the array and then selecting one row, remove array creation
        // altogether.
        if (idx >= 0 && idx < elems.size) {
          // valid index
          elems(idx)
        } else {
          // out of bounds, mimic the runtime behavior and return null
          Literal(null, ga.dataType)
        }
      case GetMapValue(CreateMap(elems, _), key, _) => CaseKeyWhen(key, elems)
    }
  }
}
