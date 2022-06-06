package com.ledis.analysis

import com.ledis.plans.logical.LogicalPlan

trait NamedRelation extends LogicalPlan {
  def name: String

  // When false, the schema of input data must match the schema of this relation, during write.
  def skipSchemaResolution: Boolean = false
}
