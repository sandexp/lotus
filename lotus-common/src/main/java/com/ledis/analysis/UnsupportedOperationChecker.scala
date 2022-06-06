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

import com.ledis.exception.AnalysisException
import com.ledis.plans.logical._

/**
 * Analyzes the presence of unsupported operations in a logical plan.
 */
object UnsupportedOperationChecker {

  def checkForBatch(plan: LogicalPlan): Unit = {
    plan.foreachUp {
      case p if p.isStreaming =>
        throwError("Queries with streaming sources must be executed with writeStream.start()")(p)

      case _ =>
    }
  }
  
  private def throwErrorIf(
      condition: Boolean,
      msg: String)(implicit operator: LogicalPlan): Unit = {
    if (condition) {
      throwError(msg)
    }
  }

  private def throwError(msg: String)(implicit operator: LogicalPlan): Nothing = {
    throw new AnalysisException(
      msg, operator.origin.line, operator.origin.startPosition, Some(operator))
  }
}
