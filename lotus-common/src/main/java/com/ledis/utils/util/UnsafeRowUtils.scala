package com.ledis.utils.util

import com.ledis.types._
import com.ledis.utils.collections.row.UnsafeRow

object UnsafeRowUtils {

  /**
   * Use the following rules to check the integrity of the UnsafeRow:
   * - schema.fields.length == row.numFields should always be true
   * - UnsafeRow.calculateBitSetWidthInBytes(row.numFields) < row.getSizeInBytes should always be
   *   true if the expectedSchema contains at least one field.
   * - For variable-length fields: if null bit says it's null then don't do anything, else extract
   *   offset and size:
   *   1) 0 <= size < row.getSizeInBytes should always be true. We can be even more precise than
   *      this, where the upper bound of size can only be as big as the variable length part of
   *      the row.
   *   2) offset should be >= fixed sized part of the row.
   *   3) offset + size should be within the row bounds.
   * - For fixed-length fields that are narrower than 8 bytes (boolean/byte/short/int/float), if
   *   null bit says it's null then don't do anything, else:
   *     check if the unused bits in the field are all zeros. The UnsafeRowWriter's write() methods
   *     make this guarantee.
   * - Check the total length of the row.
   */
  def validateStructuralIntegrity(row: UnsafeRow, expectedSchema: StructType): Boolean = {
    if (expectedSchema.fields.length != row.numFields) {
      return false
    }
    val bitSetWidthInBytes = UnsafeRow.calculateBitSetWidthInBytes(row.numFields)
    val rowSizeInBytes = row.getSizeInBytes
    if (expectedSchema.fields.length > 0 && bitSetWidthInBytes >= rowSizeInBytes) {
      return false
    }
    var varLenFieldsSizeInBytes = 0
    expectedSchema.fields.zipWithIndex.foreach {
      case (field, index) if !UnsafeRow.isFixedLength(field.dataType) && !row.isNullAt(index) =>
        val offsetAndSize = row.getLong(index)
        val offset = (offsetAndSize >> 32).toInt
        val size = offsetAndSize.toInt
        if (size < 0 ||
            offset < bitSetWidthInBytes + 8 * row.numFields || offset + size > rowSizeInBytes) {
          return false
        }
        varLenFieldsSizeInBytes += size
      case (field, index) if UnsafeRow.isFixedLength(field.dataType) && !row.isNullAt(index) =>
        field.dataType match {
          case BooleanType =>
            if ((row.getLong(index) >> 1) != 0L) return false
          case ByteType =>
            if ((row.getLong(index) >> 8) != 0L) return false
          case ShortType =>
            if ((row.getLong(index) >> 16) != 0L) return false
          case IntegerType =>
            if ((row.getLong(index) >> 32) != 0L) return false
          case FloatType =>
            if ((row.getLong(index) >> 32) != 0L) return false
          case _ =>
        }
      case (_, index) if row.isNullAt(index) =>
        if (row.getLong(index) != 0L) return false
      case _ =>
    }
    if (bitSetWidthInBytes + 8 * row.numFields + varLenFieldsSizeInBytes > rowSizeInBytes) {
      return false
    }
    true
  }
}
