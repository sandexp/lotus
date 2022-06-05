package com.ledis.expressions.projection

import com.ledis.expressions._
import com.ledis.expressions.expression.{AttributeReference, Expression}
import com.ledis.types.{ArrayType, StructField, StructType}

/**
 * A Scala extractor that projects an expression over a given schema. Data types,
 * field indexes and field counts of complex type extractors and attributes
 * are adjusted to fit the schema. All other expressions are left as-is. This
 * class is motivated by columnar nested schema pruning.
 */
case class ProjectionOverSchema(schema: StructType) {
  private val fieldNames = schema.fieldNames.toSet

  def unapply(expr: Expression): Option[Expression] = getProjection(expr)

  private def getProjection(expr: Expression): Option[Expression] =
    expr match {
      case a: AttributeReference if fieldNames.contains(a.name) =>
        Some(a.copy(dataType = schema(a.name).dataType)(a.exprId, a.qualifier))
      case GetArrayItem(child, arrayItemOrdinal, failOnError) =>
        getProjection(child).map {
          projection => GetArrayItem(projection, arrayItemOrdinal, failOnError)
        }
      case a: GetArrayStructFields =>
        getProjection(a.child).map(p => (p, p.dataType)).map {
          case (projection, ArrayType(projSchema @ StructType(_), _)) =>
            // For case-sensitivity aware field resolution, we should take `ordinal` which
            // points to correct struct field.
            val selectedField = a.child.dataType.asInstanceOf[ArrayType]
              .elementType.asInstanceOf[StructType](a.ordinal)
            val prunedField = projSchema(selectedField.name)
            GetArrayStructFields(projection,
              prunedField.copy(name = a.field.name),
              projSchema.fieldIndex(selectedField.name),
              projSchema.size,
              a.containsNull)
          case (_, projSchema) =>
            throw new IllegalStateException(
              s"unmatched child schema for GetArrayStructFields: ${projSchema.toString}"
            )
        }
      case MapKeys(child) =>
        getProjection(child).map { projection => MapKeys(projection) }
      case MapValues(child) =>
        getProjection(child).map { projection => MapValues(projection) }
      case GetMapValue(child, key, failOnError) =>
        getProjection(child).map { projection => GetMapValue(projection, key, failOnError) }
      case GetStructFieldObject(child, field: StructField) =>
        getProjection(child).map(p => (p, p.dataType)).map {
          case (projection, projSchema: StructType) =>
            GetStructField(projection, projSchema.fieldIndex(field.name))
          case (_, projSchema) =>
            throw new IllegalStateException(
              s"unmatched child schema for GetStructField: ${projSchema.toString}"
            )
        }
      case _ =>
        None
    }
}
