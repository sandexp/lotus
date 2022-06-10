package com.ledis.utils.serializer

import com.ledis.analysis.UnresolvedExtractValue
import com.ledis.expressions.GetStructField
import com.ledis.expressions.expression.Expression
import com.ledis.expressions.objects.{AssertNotNull, Invoke, StaticInvoke}
import com.ledis.expressions.projection.{Literal, UpCast}
import com.ledis.types._
import com.ledis.utils.WalkedTypePath
import com.ledis.utils.util.DateTimeUtils

object DeserializerBuildHelper {
  /** Returns the current path with a sub-field extracted. */
  def addToPath(
      path: Expression,
      part: String,
      dataType: DataType,
      walkedTypePath: WalkedTypePath): Expression = {
    val newPath = UnresolvedExtractValue(path, Literal(part))
    upCastToExpectedType(newPath, dataType, walkedTypePath)
  }

  /** Returns the current path with a field at ordinal extracted. */
  def addToPathOrdinal(
      path: Expression,
      ordinal: Int,
      dataType: DataType,
      walkedTypePath: WalkedTypePath): Expression = {
    val newPath = GetStructField(path, ordinal)
    upCastToExpectedType(newPath, dataType, walkedTypePath)
  }

  def deserializerForWithNullSafetyAndUpcast(
      expr: Expression,
      dataType: DataType,
      nullable: Boolean,
      walkedTypePath: WalkedTypePath,
      funcForCreatingDeserializer: (Expression, WalkedTypePath) => Expression): Expression = {
    val casted = upCastToExpectedType(expr, dataType, walkedTypePath)
    expressionWithNullSafety(funcForCreatingDeserializer(casted, walkedTypePath),
      nullable, walkedTypePath)
  }

  def expressionWithNullSafety(
      expr: Expression,
      nullable: Boolean,
      walkedTypePath: WalkedTypePath): Expression = {
    if (nullable) {
      expr
    } else {
      AssertNotNull(expr, walkedTypePath.getPaths)
    }
  }

  def createDeserializerForTypesSupportValueOf(
      path: Expression,
      clazz: Class[_]): Expression = {
    StaticInvoke(
      clazz,
      ObjectType(clazz),
      "valueOf",
      path :: Nil,
      returnNullable = false)
  }

  def createDeserializerForString(path: Expression, returnNullable: Boolean): Expression = {
    Invoke(path, "toString", ObjectType(classOf[java.lang.String]),
      returnNullable = returnNullable)
  }

  def createDeserializerForSqlDate(path: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      ObjectType(classOf[java.sql.Date]),
      "toJavaDate",
      path :: Nil,
      returnNullable = false)
  }

  def createDeserializerForLocalDate(path: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      ObjectType(classOf[java.time.LocalDate]),
      "daysToLocalDate",
      path :: Nil,
      returnNullable = false)
  }

  def createDeserializerForInstant(path: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      ObjectType(classOf[java.time.Instant]),
      "microsToInstant",
      path :: Nil,
      returnNullable = false)
  }

  def createDeserializerForSqlTimestamp(path: Expression): Expression = {
    StaticInvoke(
      DateTimeUtils.getClass,
      ObjectType(classOf[java.sql.Timestamp]),
      "toJavaTimestamp",
      path :: Nil,
      returnNullable = false)
  }

  def createDeserializerForJavaBigDecimal(
      path: Expression,
      returnNullable: Boolean): Expression = {
    Invoke(path, "toJavaBigDecimal", ObjectType(classOf[java.math.BigDecimal]),
      returnNullable = returnNullable)
  }

  def createDeserializerForScalaBigDecimal(
      path: Expression,
      returnNullable: Boolean): Expression = {
    Invoke(path, "toBigDecimal", ObjectType(classOf[BigDecimal]), returnNullable = returnNullable)
  }

  def createDeserializerForJavaBigInteger(
      path: Expression,
      returnNullable: Boolean): Expression = {
    Invoke(path, "toJavaBigInteger", ObjectType(classOf[java.math.BigInteger]),
      returnNullable = returnNullable)
  }

  def createDeserializerForScalaBigInt(path: Expression): Expression = {
    Invoke(path, "toScalaBigInt", ObjectType(classOf[scala.math.BigInt]),
      returnNullable = false)
  }

  /**
   * When we build the `deserializer` for an encoder, we set up a lot of "unresolved" stuff
   * and lost the required data type, which may lead to runtime error if the real type doesn't
   * match the encoder's schema.
   * For example, we build an encoder for `case class Data(a: Int, b: String)` and the real type
   * is [a: int, b: long], then we will hit runtime error and say that we can't construct class
   * `Data` with int and long, because we lost the information that `b` should be a string.
   *
   * This method help us "remember" the required data type by adding a `UpCast`. Note that we
   * only need to do this for leaf nodes.
   */
  private def upCastToExpectedType(
      expr: Expression,
      expected: DataType,
      walkedTypePath: WalkedTypePath): Expression = expected match {
    case _: StructType => expr
    case _: ArrayType => expr
    case _: MapType => expr
    case _: DecimalType =>
      // For Scala/Java `BigDecimal`, we accept decimal types of any valid precision/scale.
      // Here we use the `DecimalType` object to indicate it.
      UpCast(expr, DecimalType, walkedTypePath.getPaths)
    case _ => UpCast(expr, expected, walkedTypePath.getPaths)
  }
}
