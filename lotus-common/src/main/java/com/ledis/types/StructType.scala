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

package com.ledis.types

import com.ledis.analysis.Resolver
import com.ledis.config.SQLConf
import com.ledis.exception.AnalysisException
import com.ledis.expressions.expression.{Attribute, AttributeReference}
import com.ledis.expressions.order.InterpretedOrdering
import org.json4s.JsonDSL._

import scala.collection.{Map, mutable}
import scala.util.Try
import scala.util.control.NonFatal
import com.ledis.parser.{CatalystSqlParser, LegacyTypeStringParser}
import com.ledis.utils.util.StringUtils.StringConcat
import com.ledis.utils._
import com.ledis.utils.collections.row.Row
import com.ledis.utils.util.StringUtils

/**
 * A [[StructType]] object can be constructed by
 * {{{
 * StructType(fields: Seq[StructField])
 * }}}
 * For a [[StructType]] object, one or multiple [[StructField]]s can be extracted by names.
 * If multiple [[StructField]]s are extracted, a [[StructType]] object will be returned.
 * If a provided name does not have a matching field, it will be ignored. For the case
 * of extracting a single [[StructField]], a `null` will be returned.
 *
 * Scala Example:
 * {{{
 * import com.ledis.sql._
 * import com.ledis.sql.types._
 *
 * val struct =
 *   StructType(
 *     StructField("a", IntegerType, true) ::
 *     StructField("b", LongType, false) ::
 *     StructField("c", BooleanType, false) :: Nil)
 *
 * // Extract a single StructField.
 * val singleField = struct("b")
 * // singleField: StructField = StructField(b,LongType,false)
 *
 * // If this struct does not have a field called "d", it throws an exception.
 * struct("d")
 * // java.lang.IllegalArgumentException: d does not exist.
 * //   ...
 *
 * // Extract multiple StructFields. Field names are provided in a set.
 * // A StructType object will be returned.
 * val twoFields = struct(Set("b", "c"))
 * // twoFields: StructType =
 * //   StructType(StructField(b,LongType,false), StructField(c,BooleanType,false))
 *
 * // Any names without matching fields will throw an exception.
 * // For the case shown below, an exception is thrown due to "d".
 * struct(Set("b", "c", "d"))
 * // java.lang.IllegalArgumentException: d does not exist.
 * //    ...
 * }}}
 *
 * A [[Row]] object is used as a value of the [[StructType]].
 *
 * Scala Example:
 * {{{
 * import com.ledis.sql._
 * import com.ledis.sql.types._
 *
 * val innerStruct =
 *   StructType(
 *     StructField("f1", IntegerType, true) ::
 *     StructField("f2", LongType, false) ::
 *     StructField("f3", BooleanType, false) :: Nil)
 *
 * val struct = StructType(
 *   StructField("a", innerStruct, true) :: Nil)
 *
 * // Create a Row with the schema defined by struct
 * val row = Row(Row(1, 2, true))
 * }}}
 */
case class StructType(fields: Array[StructField]) extends DataType with Seq[StructField] {

  /** No-arg constructor for kryo. */
  def this() = this(Array.empty[StructField])

  /** Returns all field names in an array. */
  def fieldNames: Array[String] = fields.map(_.name)

  /**
   * Returns all field names in an array. This is an alias of `fieldNames`.
   *
   * @since 2.4.0
   */
  def names: Array[String] = fieldNames

  private lazy val fieldNamesSet: Set[String] = fieldNames.toSet
  private lazy val nameToField: Map[String, StructField] = fields.map(f => f.name -> f).toMap
  private lazy val nameToIndex: Map[String, Int] = fieldNames.zipWithIndex.toMap

  override def equals(that: Any): Boolean = {
    that match {
      case StructType(otherFields) =>
        java.util.Arrays.equals(
          fields.asInstanceOf[Array[AnyRef]], otherFields.asInstanceOf[Array[AnyRef]])
      case _ => false
    }
  }

  private lazy val _hashCode: Int = java.util.Arrays.hashCode(fields.asInstanceOf[Array[AnyRef]])
  override def hashCode(): Int = _hashCode

  /**
   * Creates a new [[StructType]] by adding a new field.
   * {{{
   * val struct = (new StructType)
   *   .add(StructField("a", IntegerType, true))
   *   .add(StructField("b", LongType, false))
   *   .add(StructField("c", StringType, true))
   *}}}
   */
  def add(field: StructField): StructType = {
    StructType(fields :+ field)
  }

  /**
   * Creates a new [[StructType]] by adding a new nullable field with no metadata.
   *
   * val struct = (new StructType)
   *   .add("a", IntegerType)
   *   .add("b", LongType)
   *   .add("c", StringType)
   */
  def add(name: String, dataType: DataType): StructType = {
    StructType(fields :+ StructField(name, dataType, nullable = true, Metadata.empty))
  }

  /**
   * Creates a new [[StructType]] by adding a new field with no metadata.
   *
   * val struct = (new StructType)
   *   .add("a", IntegerType, true)
   *   .add("b", LongType, false)
   *   .add("c", StringType, true)
   */
  def add(name: String, dataType: DataType, nullable: Boolean): StructType = {
    StructType(fields :+ StructField(name, dataType, nullable, Metadata.empty))
  }

  /**
   * Creates a new [[StructType]] by adding a new field and specifying metadata.
   * {{{
   * val struct = (new StructType)
   *   .add("a", IntegerType, true, Metadata.empty)
   *   .add("b", LongType, false, Metadata.empty)
   *   .add("c", StringType, true, Metadata.empty)
   * }}}
   */
  def add(
      name: String,
      dataType: DataType,
      nullable: Boolean,
      metadata: Metadata): StructType = {
    StructType(fields :+ StructField(name, dataType, nullable, metadata))
  }

  /**
   * Creates a new [[StructType]] by adding a new field and specifying metadata.
   * {{{
   * val struct = (new StructType)
   *   .add("a", IntegerType, true, "comment1")
   *   .add("b", LongType, false, "comment2")
   *   .add("c", StringType, true, "comment3")
   * }}}
   */
  def add(
      name: String,
      dataType: DataType,
      nullable: Boolean,
      comment: String): StructType = {
    StructType(fields :+ StructField(name, dataType, nullable).withComment(comment))
  }

  /**
   * Creates a new [[StructType]] by adding a new nullable field with no metadata where the
   * dataType is specified as a String.
   *
   * {{{
   * val struct = (new StructType)
   *   .add("a", "int")
   *   .add("b", "long")
   *   .add("c", "string")
   * }}}
   */
  def add(name: String, dataType: String): StructType = {
    add(name, CatalystSqlParser.parseDataType(dataType), nullable = true, Metadata.empty)
  }

  /**
   * Creates a new [[StructType]] by adding a new field with no metadata where the
   * dataType is specified as a String.
   *
   * {{{
   * val struct = (new StructType)
   *   .add("a", "int", true)
   *   .add("b", "long", false)
   *   .add("c", "string", true)
   * }}}
   */
  def add(name: String, dataType: String, nullable: Boolean): StructType = {
    add(name, CatalystSqlParser.parseDataType(dataType), nullable, Metadata.empty)
  }

  /**
   * Creates a new [[StructType]] by adding a new field and specifying metadata where the
   * dataType is specified as a String.
   * {{{
   * val struct = (new StructType)
   *   .add("a", "int", true, Metadata.empty)
   *   .add("b", "long", false, Metadata.empty)
   *   .add("c", "string", true, Metadata.empty)
   * }}}
   */
  def add(
      name: String,
      dataType: String,
      nullable: Boolean,
      metadata: Metadata): StructType = {
    add(name, CatalystSqlParser.parseDataType(dataType), nullable, metadata)
  }

  /**
   * Creates a new [[StructType]] by adding a new field and specifying metadata where the
   * dataType is specified as a String.
   * {{{
   * val struct = (new StructType)
   *   .add("a", "int", true, "comment1")
   *   .add("b", "long", false, "comment2")
   *   .add("c", "string", true, "comment3")
   * }}}
   */
  def add(
      name: String,
      dataType: String,
      nullable: Boolean,
      comment: String): StructType = {
    add(name, CatalystSqlParser.parseDataType(dataType), nullable, comment)
  }

  /**
   * Extracts the [[StructField]] with the given name.
   *
   * @throws IllegalArgumentException if a field with the given name does not exist
   */
  def apply(name: String): StructField = {
    nameToField.getOrElse(name,
      throw new IllegalArgumentException(
        s"$name does not exist. Available: ${fieldNames.mkString(", ")}"))
  }

  /**
   * Returns a [[StructType]] containing [[StructField]]s of the given names, preserving the
   * original order of fields.
   *
   * @throws IllegalArgumentException if at least one given field name does not exist
   */
  def apply(names: Set[String]): StructType = {
    val nonExistFields = names -- fieldNamesSet
    if (nonExistFields.nonEmpty) {
      throw new IllegalArgumentException(
        s"${nonExistFields.mkString(", ")} do(es) not exist. " +
          s"Available: ${fieldNames.mkString(", ")}")
    }
    // Preserve the original order of fields.
    StructType(fields.filter(f => names.contains(f.name)))
  }

  /**
   * Returns the index of a given field.
   *
   * @throws IllegalArgumentException if a field with the given name does not exist
   */
  def fieldIndex(name: String): Int = {
    nameToIndex.getOrElse(name,
      throw new IllegalArgumentException(
        s"$name does not exist. Available: ${fieldNames.mkString(", ")}"))
  }

  def getFieldIndex(name: String): Option[Int] = {
    nameToIndex.get(name)
  }

  /**
   * Returns the normalized path to a field and the field in this struct and its child structs.
   *
   * If includeCollections is true, this will return fields that are nested in maps and arrays.
   */
  def findNestedField(
      fieldNames: Seq[String],
      includeCollections: Boolean = false,
      resolver: Resolver = _ == _): Option[(Seq[String], StructField)] = {
    def prettyFieldName(nameParts: Seq[String]): String = {
      import com.ledis.catalog.CatalogV2Implicits._
      nameParts.quoted
    }

    def findField(
        struct: StructType,
        searchPath: Seq[String],
        normalizedPath: Seq[String]): Option[(Seq[String], StructField)] = {
      searchPath.headOption.flatMap { searchName =>
        val found = struct.fields.filter(f => resolver(searchName, f.name))
        if (found.length > 1) {
          val names = found.map(f => prettyFieldName(normalizedPath :+ f.name))
            .mkString("[", ", ", " ]")
          throw new AnalysisException(
            s"Ambiguous field name: ${prettyFieldName(normalizedPath :+ searchName)}. Found " +
              s"multiple columns that can match: $names")
        } else if (found.isEmpty) {
          None
        } else {
          val field = found.head
          (searchPath.tail, field.dataType, includeCollections) match {
            case (Seq(), _, _) =>
              Some(normalizedPath -> field)

            case (names, struct: StructType, _) =>
              findField(struct, names, normalizedPath :+ field.name)

            case (_, _, false) =>
              None // types nested in maps and arrays are not used

            case (Seq("key"), MapType(keyType, _, _), true) =>
              // return the key type as a struct field to include nullability
              Some((normalizedPath :+ field.name) -> StructField("key", keyType, nullable = false))

            case (Seq("key", names @ _*), MapType(struct: StructType, _, _), true) =>
              findField(struct, names, normalizedPath ++ Seq(field.name, "key"))

            case (Seq("value"), MapType(_, valueType, isNullable), true) =>
              // return the value type as a struct field to include nullability
              Some((normalizedPath :+ field.name) ->
                StructField("value", valueType, nullable = isNullable))

            case (Seq("value", names @ _*), MapType(_, struct: StructType, _), true) =>
              findField(struct, names, normalizedPath ++ Seq(field.name, "value"))

            case (Seq("element"), ArrayType(elementType, isNullable), true) =>
              // return the element type as a struct field to include nullability
              Some((normalizedPath :+ field.name) ->
                StructField("element", elementType, nullable = isNullable))

            case (Seq("element", names @ _*), ArrayType(struct: StructType, _), true) =>
              findField(struct, names, normalizedPath ++ Seq(field.name, "element"))

            case _ =>
              None
          }
        }
      }
    }
    findField(this, fieldNames, Nil)
  }

  def toAttributes: Seq[AttributeReference] =
    map(f => AttributeReference(f.name, f.dataType, f.nullable, f.metadata)())

  def treeString: String = treeString(Int.MaxValue)

  def treeString(maxDepth: Int): String = {
    val stringConcat = new StringUtils.StringConcat()
    stringConcat.append("root\n")
    val prefix = " |"
    val depth = if (maxDepth > 0) maxDepth else Int.MaxValue
    fields.foreach(field => field.buildFormattedString(prefix, stringConcat, depth))
    stringConcat.toString()
  }

  // scalastyle:off println
  def printTreeString(): Unit = println(treeString)
  // scalastyle:on println

  def buildFormattedString(
      prefix: String,
      stringConcat: StringConcat,
      maxDepth: Int): Unit = {
    fields.foreach(field => field.buildFormattedString(prefix, stringConcat, maxDepth))
  }

  override def jsonValue =
    ("type" -> typeName) ~
      ("fields" -> map(_.jsonValue))

  override def apply(fieldIndex: Int): StructField = fields(fieldIndex)

  override def length: Int = fields.length

  override def iterator: Iterator[StructField] = fields.iterator

  /**
   * The default size of a value of the StructType is the total default sizes of all field types.
   */
  override def defaultSize: Int = fields.map(_.dataType.defaultSize).sum

  override def simpleString: String = {
    val fieldTypes = fields.view.map(field => s"${field.name}:${field.dataType.simpleString}").toSeq
    truncatedString(
      fieldTypes,
      "struct<", ",", ">",
      SQLConf.get.maxToStringFields)
  }

  override def catalogString: String = {
    // in catalogString, we should not truncate
    val stringConcat = new StringUtils.StringConcat()
    val len = fields.length
    stringConcat.append("struct<")
    var i = 0
    while (i < len) {
      stringConcat.append(s"${fields(i).name}:${fields(i).dataType.catalogString}")
      i += 1
      if (i < len) stringConcat.append(",")
    }
    stringConcat.append(">")
    stringConcat.toString
  }

  override def sql: String = s"STRUCT<${fields.map(_.sql).mkString(", ")}>"

  /**
   * Returns a string containing a schema in DDL format. For example, the following value:
   * `StructType(Seq(StructField("eventId", IntegerType), StructField("s", StringType)))`
   * will be converted to `eventId` INT, `s` STRING.
   * The returned DDL schema can be used in a table creation.
   *
   * @since 2.4.0
   */
  def toDDL: String = fields.map(_.toDDL).mkString(",")

  override def simpleString(maxNumberFields: Int): String = {
    val builder = new StringBuilder
    val fieldTypes = fields.take(maxNumberFields).map {
      f => s"${f.name}: ${f.dataType.simpleString(maxNumberFields)}"
    }
    builder.append("struct<")
    builder.append(fieldTypes.mkString(", "))
    if (fields.length > 2) {
      if (fields.length - fieldTypes.length == 1) {
        builder.append(" ... 1 more field")
      } else {
        builder.append(" ... " + (fields.length - 2) + " more fields")
      }
    }
    builder.append(">").toString()
  }

  /**
   * Merges with another schema (`StructType`).  For a struct field A from `this` and a struct field
   * B from `that`,
   *
   * 1. If A and B have the same name and data type, they are merged to a field C with the same name
   *    and data type.  C is nullable if and only if either A or B is nullable.
   * 2. If A doesn't exist in `that`, it's included in the result schema.
   * 3. If B doesn't exist in `this`, it's also included in the result schema.
   * 4. Otherwise, `this` and `that` are considered as conflicting schemas and an exception would be
   *    thrown.
   */
  def merge(that: StructType): StructType =
    StructType.merge(this, that).asInstanceOf[StructType]

  override def asNullable: StructType = {
    val newFields = fields.map {
      case StructField(name, dataType, nullable, metadata) =>
        StructField(name, dataType.asNullable, nullable = true, metadata)
    }

    StructType(newFields)
  }

  override def existsRecursively(f: (DataType) => Boolean): Boolean = {
    f(this) || fields.exists(field => field.dataType.existsRecursively(f))
  }

  @transient
  lazy val interpretedOrdering =
    InterpretedOrdering.forSchema(this.fields.map(_.dataType))
}

object StructType extends AbstractDataType {

  override def defaultConcreteType: DataType = new StructType

  override def acceptsType(other: DataType): Boolean = {
    other.isInstanceOf[StructType]
  }

  override def simpleString: String = "struct"

  def fromString(raw: String): StructType = {
    Try(DataType.fromJson(raw)).getOrElse(LegacyTypeStringParser.parseString(raw)) match {
      case t: StructType => t
      case _ => throw new RuntimeException(s"Failed parsing ${StructType.simpleString}: $raw")
    }
  }

  /**
   * Creates StructType for a given DDL-formatted string, which is a comma separated list of field
   * definitions, e.g., a INT, b STRING.
   *
   * @since 2.2.0
   */
  def fromDDL(ddl: String): StructType = CatalystSqlParser.parseTableSchema(ddl)

  def apply(fields: Seq[StructField]): StructType = StructType(fields.toArray)

  def apply(fields: java.util.List[StructField]): StructType = {
    import scala.collection.JavaConverters._
    StructType(fields.asScala.toSeq)
  }

  def fromAttributes(attributes: Seq[Attribute]): StructType =
    StructType(attributes.map(a => StructField(a.name, a.dataType, a.nullable, a.metadata)))

  def removeMetadata(key: String, dt: DataType): DataType =
    dt match {
      case StructType(fields) =>
        val newFields = fields.map { f =>
          val mb = new MetadataBuilder()
          f.copy(dataType = removeMetadata(key, f.dataType),
            metadata = mb.withMetadata(f.metadata).remove(key).build())
        }
        StructType(newFields)
      case _ => dt
    }

  def merge(left: DataType, right: DataType): DataType =
    (left, right) match {
      case (ArrayType(leftElementType, leftContainsNull),
      ArrayType(rightElementType, rightContainsNull)) =>
        ArrayType(
          merge(leftElementType, rightElementType),
          leftContainsNull || rightContainsNull)

      case (MapType(leftKeyType, leftValueType, leftContainsNull),
      MapType(rightKeyType, rightValueType, rightContainsNull)) =>
        MapType(
          merge(leftKeyType, rightKeyType),
          merge(leftValueType, rightValueType),
          leftContainsNull || rightContainsNull)

      case (StructType(leftFields), StructType(rightFields)) =>
        val newFields = mutable.ArrayBuffer.empty[StructField]

        val rightMapped = fieldsMap(rightFields)
        leftFields.foreach {
          case leftField @ StructField(leftName, leftType, leftNullable, _) =>
            rightMapped.get(leftName)
              .map { case rightField @ StructField(rightName, rightType, rightNullable, _) =>
                try {
                  leftField.copy(
                    dataType = merge(leftType, rightType),
                    nullable = leftNullable || rightNullable)
                } catch {
                  case NonFatal(e) =>
                    throw new Exception(s"Failed to merge fields '$leftName' and " +
                      s"'$rightName'. " + e.getMessage)
                }
              }
              .orElse {
                Some(leftField)
              }
              .foreach(newFields += _)
        }

        val leftMapped = fieldsMap(leftFields)
        rightFields
          .filterNot(f => leftMapped.get(f.name).nonEmpty)
          .foreach { f =>
            newFields += f
          }

        StructType(newFields.toSeq)

      case (DecimalType.Fixed(leftPrecision, leftScale),
        DecimalType.Fixed(rightPrecision, rightScale)) =>
        if ((leftPrecision == rightPrecision) && (leftScale == rightScale)) {
          DecimalType(leftPrecision, leftScale)
        } else if ((leftPrecision != rightPrecision) && (leftScale != rightScale)) {
          throw new Exception("Failed to merge decimal types with incompatible " +
            s"precision $leftPrecision and $rightPrecision & scale $leftScale and $rightScale")
        } else if (leftPrecision != rightPrecision) {
          throw new Exception("Failed to merge decimal types with incompatible " +
            s"precision $leftPrecision and $rightPrecision")
        } else {
          throw new Exception("Failed to merge decimal types with incompatible " +
            s"scala $leftScale and $rightScale")
        }

      case (leftType, rightType) if leftType == rightType =>
        leftType

      case _ =>
        throw new Exception(s"Failed to merge incompatible data types ${left.catalogString}" +
          s" and ${right.catalogString}")
    }

  def fieldsMap(fields: Array[StructField]): Map[String, StructField] = {
    // Mimics the optimization of breakOut, not present in Scala 2.13, while working in 2.12
    val map = mutable.Map[String, StructField]()
    map.sizeHint(fields.length)
    fields.foreach(s => map.put(s.name, s))
    map
  }

  /**
   * Returns a `StructType` that contains missing fields recursively from `source` to `target`.
   * Note that this doesn't support looking into array type and map type recursively.
   */
  def findMissingFields(
      source: StructType,
      target: StructType,
      resolver: Resolver): Option[StructType] = {
    def bothStructType(dt1: DataType, dt2: DataType): Boolean =
      dt1.isInstanceOf[StructType] && dt2.isInstanceOf[StructType]

    val newFields = mutable.ArrayBuffer.empty[StructField]

    target.fields.foreach { field =>
      val found = source.fields.find(f => resolver(field.name, f.name))
      if (found.isEmpty) {
        // Found a missing field in `source`.
        newFields += field
      } else if (bothStructType(found.get.dataType, field.dataType) &&
          !found.get.dataType.sameType(field.dataType)) {
        // Found a field with same name, but different data type.
        findMissingFields(found.get.dataType.asInstanceOf[StructType],
          field.dataType.asInstanceOf[StructType], resolver).map { missingType =>
          newFields += found.get.copy(dataType = missingType)
        }
      }
    }

    if (newFields.isEmpty) {
      None
    } else {
      Some(StructType(newFields.toSeq))
    }
  }
}
