package com.ledis.utils.util

import com.ledis.analysis.Resolver
import com.ledis.catalog.CatalogTypes.TablePartitionSpec
import com.ledis.catalog.util.ExternalCatalogUtils.DEFAULT_PARTITION_NAME
import com.ledis.config.SQLConf
import com.ledis.exception.AnalysisException
import com.ledis.types.{CharType, StructType, VarcharType}
import com.ledis.utils.UTF8String

object PartitioningUtils {
  /**
   * Normalize the column names in partition specification, w.r.t. the real partition column names
   * and case sensitivity. e.g., if the partition spec has a column named `monTh`, and there is a
   * partition column named `month`, and it's case insensitive, we will normalize `monTh` to
   * `month`.
   */
  def normalizePartitionSpec[T](
      partitionSpec: Map[String, T],
      partCols: StructType,
      tblName: String,
      resolver: Resolver): Map[String, T] = {
    val rawSchema = CharVarcharUtils.getRawSchema(partCols)
    val normalizedPartSpec = partitionSpec.toSeq.map { case (key, value) =>
      val normalizedFiled = rawSchema.find(f => resolver(f.name, key)).getOrElse {
        throw new AnalysisException(s"$key is not a valid partition column in table $tblName.")
      }
      
      val normalizedVal =
        if (SQLConf.get.charVarcharAsString) value else normalizedFiled.dataType match {
          case CharType(len) if value != null && value != DEFAULT_PARTITION_NAME =>
            val v = value match {
              case Some(str: String) => Some(charTypeWriteSideCheck(str, len))
              case str: String => charTypeWriteSideCheck(str, len)
              case other => other
            }
            v.asInstanceOf[T]
          case VarcharType(len) if value != null && value != DEFAULT_PARTITION_NAME =>
            val v = value match {
              case Some(str: String) => Some(varcharTypeWriteSideCheck(str, len))
              case str: String => varcharTypeWriteSideCheck(str, len)
              case other => other
            }
            v.asInstanceOf[T]
          case _ => value
        }
      normalizedFiled.name -> normalizedVal
    }

    SchemaUtils.checkColumnNameDuplication(
      normalizedPartSpec.map(_._1), "in the partition schema", resolver)

    normalizedPartSpec.toMap
  }

  private def charTypeWriteSideCheck(inputStr: String, limit: Int): String = {
    val toUtf8 = UTF8String.fromString(inputStr)
    CharVarcharCodegenUtils.charTypeWriteSideCheck(toUtf8, limit).toString
  }

  private def varcharTypeWriteSideCheck(inputStr: String, limit: Int): String = {
    val toUtf8 = UTF8String.fromString(inputStr)
    CharVarcharCodegenUtils.varcharTypeWriteSideCheck(toUtf8, limit).toString
  }

  /**
   * Verify if the input partition spec exactly matches the existing defined partition spec
   * The columns must be the same but the orders could be different.
   */
  def requireExactMatchedPartitionSpec(
      tableName: String,
      spec: TablePartitionSpec,
      partitionColumnNames: Seq[String]): Unit = {
    val defined = partitionColumnNames.sorted
    if (spec.keys.toSeq.sorted != defined) {
      throw new AnalysisException(
        s"Partition spec is invalid. The spec (${spec.keys.mkString(", ")}) must match " +
        s"the partition spec (${partitionColumnNames.mkString(", ")}) defined in " +
        s"table '$tableName'")
    }
  }
}
