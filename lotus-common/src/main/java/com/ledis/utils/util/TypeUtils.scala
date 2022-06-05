package com.ledis.utils.util

import com.ledis.analysis.{TypeCheckResult, TypeCoercion}
import com.ledis.exception.AnalysisException
import com.ledis.expressions.order.RowOrdering
import com.ledis.types._

/**
 * Functions to help with checking for valid data types and value comparison of various types.
 */
object TypeUtils {
  def checkForNumericExpr(dt: DataType, caller: String): TypeCheckResult = {
    if (dt.isInstanceOf[NumericType] || dt == NullType) {
      TypeCheckResult.TypeCheckSuccess
    } else {
      TypeCheckResult.TypeCheckFailure(s"$caller requires numeric types, not ${dt.catalogString}")
    }
  }

  def checkForOrderingExpr(dt: DataType, caller: String): TypeCheckResult = {
    if (RowOrdering.isOrderable(dt)) {
      TypeCheckResult.TypeCheckSuccess
    } else {
      TypeCheckResult.TypeCheckFailure(
        s"$caller does not support ordering on type ${dt.catalogString}")
    }
  }

  def checkForSameTypeInputExpr(types: Seq[DataType], caller: String): TypeCheckResult = {
    if (TypeCoercion.haveSameType(types)) {
      TypeCheckResult.TypeCheckSuccess
    } else {
      TypeCheckResult.TypeCheckFailure(
        s"input to $caller should all be the same type, but it's " +
          types.map(_.catalogString).mkString("[", ", ", "]"))
    }
  }

  def checkForMapKeyType(keyType: DataType): TypeCheckResult = {
    if (keyType.existsRecursively(_.isInstanceOf[MapType])) {
      TypeCheckResult.TypeCheckFailure("The key of map cannot be/contain map.")
    } else {
      TypeCheckResult.TypeCheckSuccess
    }
  }

  def getNumeric(t: DataType, exactNumericRequired: Boolean = false): Numeric[Any] = {
    if (exactNumericRequired) {
      t.asInstanceOf[NumericType].exactNumeric.asInstanceOf[Numeric[Any]]
    } else {
      t.asInstanceOf[NumericType].numeric.asInstanceOf[Numeric[Any]]
    }
  }

  def getInterpretedOrdering(t: DataType): Ordering[Any] = {
    t match {
      case i: AtomicType => i.ordering.asInstanceOf[Ordering[Any]]
      case a: ArrayType => a.interpretedOrdering.asInstanceOf[Ordering[Any]]
      case s: StructType => s.interpretedOrdering.asInstanceOf[Ordering[Any]]
    }
  }

  def compareBinary(x: Array[Byte], y: Array[Byte]): Int = {
    val limit = if (x.length <= y.length) x.length else y.length
    var i = 0
    while (i < limit) {
      val res = (x(i) & 0xff) - (y(i) & 0xff)
      if (res != 0) return res
      i += 1
    }
    x.length - y.length
  }

  /**
   * Returns true if the equals method of the elements of the data type is implemented properly.
   * This also means that they can be safely used in collections relying on the equals method,
   * as sets or maps.
   */
  def typeWithProperEquals(dataType: DataType): Boolean = dataType match {
    case BinaryType => false
    case _: AtomicType => true
    case _ => false
  }

  def failWithIntervalType(dataType: DataType): Unit = {
    dataType match {
      case CalendarIntervalType =>
        throw new AnalysisException("Cannot use interval type in the table schema.")
      case ArrayType(et, _) => failWithIntervalType(et)
      case MapType(kt, vt, _) =>
        failWithIntervalType(kt)
        failWithIntervalType(vt)
      case s: StructType => s.foreach(f => failWithIntervalType(f.dataType))
      case _ =>
    }
  }
}
