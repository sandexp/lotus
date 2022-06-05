package com.ledis.utils

import java.text.{DecimalFormat, DecimalFormatSymbols, ParsePosition}
import java.util.Locale

import com.ledis.exception.AnalysisException
import com.ledis.expressions.CreateMap
import com.ledis.expressions.expression.Expression
import com.ledis.types.{DataType, MapType, StringType, StructType}
import com.ledis.utils.collections.ArrayBasedMapData
import com.ledis.utils.util.CharVarcharUtils

object ExprUtils {

  def evalTypeExpr(exp: Expression): DataType = {
    if (exp.foldable) {
      exp.eval() match {
        case s: UTF8String if s != null =>
          val dataType = DataType.fromDDL(s.toString)
          CharVarcharUtils.failIfHasCharVarchar(dataType)
        case _ => throw new AnalysisException(
          s"The expression '${exp.sql}' is not a valid schema string.")
      }
    } else {
      throw new AnalysisException(
        "Schema should be specified in DDL format as a string literal or output of " +
          s"the schema_of_json/schema_of_csv functions instead of ${exp.sql}")
    }
  }

  def evalSchemaExpr(exp: Expression): StructType = {
    val dataType = evalTypeExpr(exp)
    if (!dataType.isInstanceOf[StructType]) {
      throw new AnalysisException(
        s"Schema should be struct type but got ${dataType.sql}.")
    }
    dataType.asInstanceOf[StructType]
  }

  def convertToMapData(exp: Expression): Map[String, String] = exp match {
    case m: CreateMap
      if m.dataType.acceptsType(MapType(StringType, StringType, valueContainsNull = false)) =>
      val arrayMap = m.eval().asInstanceOf[ArrayBasedMapData]
      ArrayBasedMapData.toScalaMap(arrayMap).map { case (key, value) =>
        key.toString -> value.toString
      }
    case m: CreateMap =>
      throw new AnalysisException(
        s"A type of keys and values in map() must be string, but got ${m.dataType.catalogString}")
    case _ =>
      throw new AnalysisException("Must use a map() function for options")
  }

  /**
   * A convenient function for schema validation in datasources supporting
   * `columnNameOfCorruptRecord` as an option.
   */
  def verifyColumnNameOfCorruptRecord(
      schema: StructType,
      columnNameOfCorruptRecord: String): Unit = {
    schema.getFieldIndex(columnNameOfCorruptRecord).foreach { corruptFieldIndex =>
      val f = schema(corruptFieldIndex)
      if (f.dataType != StringType || !f.nullable) {
        throw new AnalysisException(
          "The field for corrupt records must be string type and nullable")
      }
    }
  }

  def getDecimalParser(locale: Locale): String => java.math.BigDecimal = {
    if (locale == Locale.US) { // Special handling the default locale for backward compatibility
      (s: String) => new java.math.BigDecimal(s.replaceAll(",", ""))
    } else {
      val decimalFormat = new DecimalFormat("", new DecimalFormatSymbols(locale))
      decimalFormat.setParseBigDecimal(true)
      (s: String) => {
        val pos = new ParsePosition(0)
        val result = decimalFormat.parse(s, pos).asInstanceOf[java.math.BigDecimal]
        if (pos.getIndex() != s.length() || pos.getErrorIndex() != -1) {
          throw new IllegalArgumentException("Cannot parse any decimal");
        } else {
          result
        }
      }
    }
  }
}
