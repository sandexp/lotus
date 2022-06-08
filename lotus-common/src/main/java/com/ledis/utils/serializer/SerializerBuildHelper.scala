package com.ledis.utils.serializer

import com.ledis.config.SQLConf
import com.ledis.expressions.CreateNamedStruct
import com.ledis.expressions.expression.{CheckOverflow, Expression, If, IsNull}
import com.ledis.expressions.objects._
import com.ledis.expressions.projection.Literal
import com.ledis.types._
import com.ledis.utils.{DateTimeUtils, UTF8String}
import com.ledis.utils.collections.{GenericArrayData, UnsafeArrayData}

object SerializerBuildHelper {

  private def nullOnOverflow: Boolean = !SQLConf.get.ansiEnabled

  def createSerializerForBoolean(inputObject: Expression): Expression = {
    Invoke(inputObject, "booleanValue", BooleanType)
  }

  def createSerializerForByte(inputObject: Expression): Expression = {
    Invoke(inputObject, "byteValue", ByteType)
  }

  def createSerializerForShort(inputObject: Expression): Expression = {
    Invoke(inputObject, "shortValue", ShortType)
  }

  def createSerializerForInteger(inputObject: Expression): Expression = {
    Invoke(inputObject, "intValue", IntegerType)
  }

  def createSerializerForLong(inputObject: Expression): Expression = {
    Invoke(inputObject, "longValue", LongType)
  }

  def createSerializerForFloat(inputObject: Expression): Expression = {
    Invoke(inputObject, "floatValue", FloatType)
  }

  def createSerializerForDouble(inputObject: Expression): Expression = {
    Invoke(inputObject, "doubleValue", DoubleType)
  }

  def createSerializerForString(inputObject: Expression): Expression = {
    StaticInvoke(
      classOf[UTF8String],
      StringType,
      "fromString",
      inputObject :: Nil,
      returnNullable = false)
  }

  def createSerializerForJavaInstant(inputObject: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      TimestampType,
      "instantToMicros",
      inputObject :: Nil,
      returnNullable = false)
  }

  def createSerializerForSqlTimestamp(inputObject: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      TimestampType,
      "fromJavaTimestamp",
      inputObject :: Nil,
      returnNullable = false)
  }

  def createSerializerForJavaLocalDate(inputObject: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      DateType,
      "localDateToDays",
      inputObject :: Nil,
      returnNullable = false)
  }

  def createSerializerForSqlDate(inputObject: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      DateType,
      "fromJavaDate",
      inputObject :: Nil,
      returnNullable = false)
  }

  def createSerializerForJavaBigDecimal(inputObject: Expression): Expression = {
    CheckOverflow(StaticInvoke(
      Decimal.getClass,
      DecimalType.SYSTEM_DEFAULT,
      "apply",
      inputObject :: Nil,
      returnNullable = false), DecimalType.SYSTEM_DEFAULT, nullOnOverflow)
  }

  def createSerializerForScalaBigDecimal(inputObject: Expression): Expression = {
    createSerializerForJavaBigDecimal(inputObject)
  }

  def createSerializerForJavaBigInteger(inputObject: Expression): Expression = {
    CheckOverflow(StaticInvoke(
      Decimal.getClass,
      DecimalType.BigIntDecimal,
      "apply",
      inputObject :: Nil,
      returnNullable = false), DecimalType.BigIntDecimal, nullOnOverflow)
  }

  def createSerializerForScalaBigInt(inputObject: Expression): Expression = {
    createSerializerForJavaBigInteger(inputObject)
  }

  def createSerializerForPrimitiveArray(
      inputObject: Expression,
      dataType: DataType): Expression = {
    StaticInvoke(
      classOf[UnsafeArrayData],
      ArrayType(dataType, false),
      "fromPrimitiveArray",
      inputObject :: Nil,
      returnNullable = false)
  }

  def createSerializerForGenericArray(
      inputObject: Expression,
      dataType: DataType,
      nullable: Boolean): Expression = {
    NewInstance(
      classOf[GenericArrayData],
      inputObject :: Nil,
      dataType = ArrayType(dataType, nullable))
  }

  def createSerializerForMapObjects(
      inputObject: Expression,
      dataType: ObjectType,
      funcForNewExpr: Expression => Expression): Expression = {
    MapObjects(funcForNewExpr, inputObject, dataType)
  }

  case class MapElementInformation(
      dataType: DataType,
      nullable: Boolean,
      funcForNewExpr: Expression => Expression)

  def createSerializerForMap(
      inputObject: Expression,
      keyInformation: MapElementInformation,
      valueInformation: MapElementInformation): Expression = {
    ExternalMapToCatalyst(
      inputObject,
      keyInformation.dataType,
      keyInformation.funcForNewExpr,
      keyNullable = keyInformation.nullable,
      valueInformation.dataType,
      valueInformation.funcForNewExpr,
      valueNullable = valueInformation.nullable
    )
  }

  private def argumentsForFieldSerializer(
      fieldName: String,
      serializerForFieldValue: Expression): Seq[Expression] = {
    Literal(fieldName) :: serializerForFieldValue :: Nil
  }

  def createSerializerForObject(
      inputObject: Expression,
      fields: Seq[(String, Expression)]): Expression = {
    val nonNullOutput = CreateNamedStruct(fields.flatMap { case(fieldName, fieldExpr) =>
      argumentsForFieldSerializer(fieldName, fieldExpr)
    })
    if (inputObject.nullable) {
      val nullOutput = Literal.create(null, nonNullOutput.dataType)
      If(IsNull(inputObject), nullOutput, nonNullOutput)
    } else {
      nonNullOutput
    }
  }
}
