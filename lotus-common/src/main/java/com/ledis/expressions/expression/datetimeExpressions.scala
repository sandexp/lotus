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

package com.ledis.expressions.expression

import java.text.ParseException
import java.time.{DateTimeException, LocalDate, LocalDateTime, ZoneId}
import java.time.format.DateTimeParseException
import java.util.Locale

import com.ledis.config.SQLConf
import com.ledis.exception.AnalysisException
import com.ledis.expressions.{Add, ExpectsInputTypes, ImplicitCastInputTypes}
import com.ledis.expressions.codegen._
import com.ledis.expressions.codegen.Block._
import com.ledis.expressions.projection.{Cast, Literal}
import com.ledis.types._
import com.ledis.types.CalendarInterval
import com.ledis.utils.UTF8String
import com.ledis.utils.time.DateTimeConstants._
import org.apache.commons.lang3.StringEscapeUtils
import com.ledis.utils.collections.row.InternalRow
import com.ledis.utils.time.LegacyDateFormats.SIMPLE_DATE_FORMAT
import com.ledis.utils.time.{LegacyDateFormats, TimestampFormatter}
import com.ledis.utils.util.DateTimeUtils
import com.ledis.utils.util.DateTimeUtils._

/**
 * Common base class for time zone aware expressions.
 */
trait TimeZoneAwareExpression extends Expression {
  /** The expression is only resolved when the time zone has been set. */
  override lazy val resolved: Boolean =
    childrenResolved && checkInputDataTypes().isSuccess && timeZoneId.isDefined

  /** the timezone ID to be used to evaluate value. */
  def timeZoneId: Option[String]

  /** Returns a copy of this expression with the specified timeZoneId. */
  def withTimeZone(timeZoneId: String): TimeZoneAwareExpression

  @transient lazy val zoneId: ZoneId = DateTimeUtils.getZoneId(timeZoneId.get)
}

trait TimestampFormatterHelper extends TimeZoneAwareExpression {

  protected def formatString: Expression

  protected def isParsing: Boolean

  @transient final protected lazy val formatterOption: Option[TimestampFormatter] =
    if (formatString.foldable) {
      Option(formatString.eval()).map(fmt => getFormatter(fmt.toString))
    } else None

  final protected def getFormatter(fmt: String): TimestampFormatter = {
    TimestampFormatter(
      format = fmt,
      zoneId = zoneId,
      legacyFormat = SIMPLE_DATE_FORMAT,
      isParsing = isParsing)
  }
}

case class CurrentTimeZone() extends LeafExpression with Unevaluable {
  override def nullable: Boolean = false
  override def dataType: DataType = StringType
  override def prettyName: String = "current_timezone"
}

/**
 * Returns the current date at the start of query evaluation.
 * There is no code generation since this expression should get constant folded by the optimizer.
 */
case class CurrentDate(timeZoneId: Option[String] = None)
  extends LeafExpression with TimeZoneAwareExpression with CodegenFallback {

  def this() = this(None)

  override def foldable: Boolean = true
  override def nullable: Boolean = false

  override def dataType: DataType = DateType

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  override def eval(input: InternalRow): Any = currentDate(zoneId)

  override def prettyName: String = "current_date"
}

abstract class CurrentTimestampLike() extends LeafExpression with CodegenFallback {
  override def foldable: Boolean = true
  override def nullable: Boolean = false
  override def dataType: DataType = TimestampType
  override def eval(input: InternalRow): Any = currentTimestamp()
}

/**
 * Returns the current timestamp at the start of query evaluation.
 * There is no code generation since this expression should get constant folded by the optimizer.
 */
case class CurrentTimestamp() extends CurrentTimestampLike {
  override def prettyName: String = "current_timestamp"
}

case class Now() extends CurrentTimestampLike {
  override def prettyName: String = "now"
}

/**
 * Expression representing the current batch time, which is used by StreamExecution to
 * 1. prevent optimizer from pushing this expression below a stateful operator
 * 2. allow IncrementalExecution to substitute this expression with a Literal(timestamp)
 *
 * There is no code generation since this expression should be replaced with a literal.
 */
case class CurrentBatchTimestamp(
    timestampMs: Long,
    dataType: DataType,
    timeZoneId: Option[String] = None)
  extends LeafExpression with TimeZoneAwareExpression with Nondeterministic with CodegenFallback {

  def this(timestampMs: Long, dataType: DataType) = this(timestampMs, dataType, None)

  override def nullable: Boolean = false

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  override def prettyName: String = "current_batch_timestamp"

  override protected def initializeInternal(partitionIndex: Int): Unit = {}

  /**
   * Need to return literal value in order to support compile time expression evaluation
   * e.g., select(current_date())
   */
  override protected def evalInternal(input: InternalRow): Any = toLiteral.value

  def toLiteral: Literal = {
    val timestampUs = millisToMicros(timestampMs)
    dataType match {
      case _: TimestampType => Literal(timestampUs, TimestampType)
      case _: DateType => Literal(microsToDays(timestampUs, zoneId), DateType)
    }
  }
}

/**
 * Adds a number of days to startdate.
 */
case class DateAdd(startDate: Expression, days: Expression)
  extends BinaryExpression with ExpectsInputTypes with NullIntolerant {

  override def left: Expression = startDate
  override def right: Expression = days

  override def inputTypes: Seq[AbstractDataType] =
    Seq(DateType, TypeCollection(IntegerType, ShortType, ByteType))

  override def dataType: DataType = DateType

  override def nullSafeEval(start: Any, d: Any): Any = {
    start.asInstanceOf[Int] + d.asInstanceOf[Number].intValue()
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    nullSafeCodeGen(ctx, ev, (sd, d) => {
      s"""${ev.value} = $sd + $d;"""
    })
  }

  override def prettyName: String = "date_add"
}

/**
 * Subtracts a number of days to startdate.
 */
case class DateSub(startDate: Expression, days: Expression)
  extends BinaryExpression with ExpectsInputTypes with NullIntolerant {
  override def left: Expression = startDate
  override def right: Expression = days

  override def inputTypes: Seq[AbstractDataType] =
    Seq(DateType, TypeCollection(IntegerType, ShortType, ByteType))

  override def dataType: DataType = DateType

  override def nullSafeEval(start: Any, d: Any): Any = {
    start.asInstanceOf[Int] - d.asInstanceOf[Number].intValue()
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    nullSafeCodeGen(ctx, ev, (sd, d) => {
      s"""${ev.value} = $sd - $d;"""
    })
  }

  override def prettyName: String = "date_sub"
}

trait GetTimeField extends UnaryExpression
  with TimeZoneAwareExpression with ImplicitCastInputTypes with NullIntolerant {

  val func: (Long, ZoneId) => Any
  val funcName: String

  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType)

  override def dataType: DataType = IntegerType

  override protected def nullSafeEval(timestamp: Any): Any = {
    func(timestamp.asInstanceOf[Long], zoneId)
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    defineCodeGen(ctx, ev, c => s"$dtu.$funcName($c, $zid)")
  }
}

case class Hour(child: Expression, timeZoneId: Option[String] = None) extends GetTimeField {
  def this(child: Expression) = this(child, None)
  override def withTimeZone(timeZoneId: String): Hour = copy(timeZoneId = Option(timeZoneId))
  override val func = DateTimeUtils.getHours
  override val funcName = "getHours"
}

case class Minute(child: Expression, timeZoneId: Option[String] = None) extends GetTimeField {
  def this(child: Expression) = this(child, None)
  override def withTimeZone(timeZoneId: String): Minute = copy(timeZoneId = Option(timeZoneId))
  override val func = DateTimeUtils.getMinutes
  override val funcName = "getMinutes"
}

case class Second(child: Expression, timeZoneId: Option[String] = None) extends GetTimeField {
  def this(child: Expression) = this(child, None)
  override def withTimeZone(timeZoneId: String): Second = copy(timeZoneId = Option(timeZoneId))
  override val func = DateTimeUtils.getSeconds
  override val funcName = "getSeconds"
}

case class SecondWithFraction(child: Expression, timeZoneId: Option[String] = None)
  extends GetTimeField {
  def this(child: Expression) = this(child, None)
  // 2 digits for seconds, and 6 digits for the fractional part with microsecond precision.
  override def dataType: DataType = DecimalType(8, 6)
  override def withTimeZone(timeZoneId: String): SecondWithFraction =
    copy(timeZoneId = Option(timeZoneId))
  override val func = DateTimeUtils.getSecondsWithFraction
  override val funcName = "getSecondsWithFraction"
}

trait GetDateField extends UnaryExpression with ImplicitCastInputTypes with NullIntolerant {
  val func: Int => Any
  val funcName: String

  override def inputTypes: Seq[AbstractDataType] = Seq(DateType)

  override def dataType: DataType = IntegerType

  override protected def nullSafeEval(date: Any): Any = {
    func(date.asInstanceOf[Int])
  }

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    defineCodeGen(ctx, ev, c => s"$dtu.$funcName($c)")
  }
}

case class DayOfYear(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getDayInYear
  override val funcName = "getDayInYear"
}

case class DateFromUnixDate(child: Expression) extends UnaryExpression
  with ImplicitCastInputTypes with NullIntolerant {
  override def inputTypes: Seq[AbstractDataType] = Seq(IntegerType)

  override def dataType: DataType = DateType

  override def nullSafeEval(input: Any): Any = input.asInstanceOf[Int]

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode =
    defineCodeGen(ctx, ev, c => c)

  override def prettyName: String = "date_from_unix_date"
}

case class UnixDate(child: Expression) extends UnaryExpression
  with ExpectsInputTypes with NullIntolerant {
  override def inputTypes: Seq[AbstractDataType] = Seq(DateType)

  override def dataType: DataType = IntegerType

  override def nullSafeEval(input: Any): Any = input.asInstanceOf[Int]

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode =
    defineCodeGen(ctx, ev, c => c)

  override def prettyName: String = "unix_date"
}

abstract class IntegralToTimestampBase extends UnaryExpression
  with ExpectsInputTypes with NullIntolerant {

  protected def upScaleFactor: Long

  override def inputTypes: Seq[AbstractDataType] = Seq(IntegralType)

  override def dataType: DataType = TimestampType

  override def nullSafeEval(input: Any): Any = {
    Math.multiplyExact(input.asInstanceOf[Number].longValue(), upScaleFactor)
  }

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    if (upScaleFactor == 1) {
      defineCodeGen(ctx, ev, c => c)
    } else {
      defineCodeGen(ctx, ev, c => s"java.lang.Math.multiplyExact($c, ${upScaleFactor}L)")
    }
  }
}

case class SecondsToTimestamp(child: Expression) extends UnaryExpression
  with ExpectsInputTypes with NullIntolerant {

  override def inputTypes: Seq[AbstractDataType] = Seq(NumericType)

  override def dataType: DataType = TimestampType

  override def nullable: Boolean = child.dataType match {
    case _: FloatType | _: DoubleType => true
    case _ => child.nullable
  }

  @transient
  private lazy val evalFunc: Any => Any = child.dataType match {
    case _: IntegralType => input =>
      Math.multiplyExact(input.asInstanceOf[Number].longValue(), MICROS_PER_SECOND)
    case _: DecimalType => input =>
      val operand = new java.math.BigDecimal(MICROS_PER_SECOND)
      input.asInstanceOf[Decimal].toJavaBigDecimal.multiply(operand).longValueExact()
    case _: FloatType => input =>
      val f = input.asInstanceOf[Float]
      if (f.isNaN || f.isInfinite) null else (f.toDouble * MICROS_PER_SECOND).toLong
    case _: DoubleType => input =>
      val d = input.asInstanceOf[Double]
      if (d.isNaN || d.isInfinite) null else (d * MICROS_PER_SECOND).toLong
  }

  override def nullSafeEval(input: Any): Any = evalFunc(input)

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = child.dataType match {
    case _: IntegralType =>
      defineCodeGen(ctx, ev, c => s"java.lang.Math.multiplyExact($c, ${MICROS_PER_SECOND}L)")
    case _: DecimalType =>
      val operand = s"new java.math.BigDecimal($MICROS_PER_SECOND)"
      defineCodeGen(ctx, ev, c => s"$c.toJavaBigDecimal().multiply($operand).longValueExact()")
    case other =>
      val castToDouble = if (other.isInstanceOf[FloatType]) "(double)" else ""
      nullSafeCodeGen(ctx, ev, c => {
        val typeStr = CodeGenerator.boxedType(other)
        s"""
           |if ($typeStr.isNaN($c) || $typeStr.isInfinite($c)) {
           |  ${ev.isNull} = true;
           |} else {
           |  ${ev.value} = (long)($castToDouble$c * $MICROS_PER_SECOND);
           |}
           |""".stripMargin
      })
  }

  override def prettyName: String = "timestamp_seconds"
}

case class MillisToTimestamp(child: Expression)
  extends IntegralToTimestampBase {

  override def upScaleFactor: Long = MICROS_PER_MILLIS

  override def prettyName: String = "timestamp_millis"
}

case class MicrosToTimestamp(child: Expression)
  extends IntegralToTimestampBase {

  override def upScaleFactor: Long = 1L

  override def prettyName: String = "timestamp_micros"
}

abstract class TimestampToLongBase extends UnaryExpression
  with ExpectsInputTypes with NullIntolerant {

  protected def scaleFactor: Long

  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType)

  override def dataType: DataType = LongType

  override def nullSafeEval(input: Any): Any = {
    Math.floorDiv(input.asInstanceOf[Number].longValue(), scaleFactor)
  }

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    if (scaleFactor == 1) {
      defineCodeGen(ctx, ev, c => c)
    } else {
      defineCodeGen(ctx, ev, c => s"java.lang.Math.floorDiv($c, ${scaleFactor}L)")
    }
  }
}

case class UnixSeconds(child: Expression) extends TimestampToLongBase {
  override def scaleFactor: Long = MICROS_PER_SECOND

  override def prettyName: String = "unix_seconds"
}

case class UnixMillis(child: Expression) extends TimestampToLongBase {
  override def scaleFactor: Long = MICROS_PER_MILLIS

  override def prettyName: String = "unix_millis"
}

case class UnixMicros(child: Expression) extends TimestampToLongBase {
  override def scaleFactor: Long = 1L

  override def prettyName: String = "unix_micros"
}

case class Year(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getYear
  override val funcName = "getYear"
}

case class YearOfWeek(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getWeekBasedYear
  override val funcName = "getWeekBasedYear"
}

case class Quarter(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getQuarter
  override val funcName = "getQuarter"
}

case class Month(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getMonth
  override val funcName = "getMonth"
}

case class DayOfMonth(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getDayOfMonth
  override val funcName = "getDayOfMonth"
}

case class DayOfWeek(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getDayOfWeek
  override val funcName = "getDayOfWeek"
}

case class WeekDay(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getWeekDay
  override val funcName = "getWeekDay"
}

case class WeekOfYear(child: Expression) extends GetDateField {
  override val func = DateTimeUtils.getWeekOfYear
  override val funcName = "getWeekOfYear"
}

case class DateFormatClass(left: Expression, right: Expression, timeZoneId: Option[String] = None)
  extends BinaryExpression with TimestampFormatterHelper with ImplicitCastInputTypes
    with NullIntolerant {

  def this(left: Expression, right: Expression) = this(left, right, None)

  override def dataType: DataType = StringType

  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType, StringType)

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  override protected def nullSafeEval(timestamp: Any, format: Any): Any = {
    val formatter = formatterOption.getOrElse(getFormatter(format.toString))
    UTF8String.fromString(formatter.format(timestamp.asInstanceOf[Long]))
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    formatterOption.map { tf =>
      val timestampFormatter = ctx.addReferenceObj("timestampFormatter", tf)
      defineCodeGen(ctx, ev, (timestamp, _) => {
        s"""UTF8String.fromString($timestampFormatter.format($timestamp))"""
      })
    }.getOrElse {
      val tf = TimestampFormatter.getClass.getName.stripSuffix("$")
      val ldf = LegacyDateFormats.getClass.getName.stripSuffix("$")
      val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
      defineCodeGen(ctx, ev, (timestamp, format) => {
        s"""|UTF8String.fromString($tf$$.MODULE$$.apply(
            |  $format.toString(),
            |  $zid,
            |  $ldf$$.MODULE$$.SIMPLE_DATE_FORMAT(),
            |  false)
            |.format($timestamp))""".stripMargin
      })
    }
  }

  override def prettyName: String = "date_format"

  override protected def formatString: Expression = right

  override protected def isParsing: Boolean = false
}

/**
 * Converts time string with given pattern.
 * Deterministic version of [[UnixTimestamp]], must have at least one parameter.
 */
case class ToUnixTimestamp(
    timeExp: Expression,
    format: Expression,
    timeZoneId: Option[String] = None,
    failOnError: Boolean = SQLConf.get.ansiEnabled)
  extends UnixTime {

  def this(timeExp: Expression, format: Expression) =
    this(timeExp, format, None, SQLConf.get.ansiEnabled)

  override def left: Expression = timeExp
  override def right: Expression = format

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  def this(time: Expression) = {
    this(time, Literal(TimestampFormatter.defaultPattern))
  }

  override def prettyName: String = "to_unix_timestamp"
}

/**
 * Converts time string with given pattern to Unix time stamp (in seconds), returns null if fail.
 * See <a href="https://spark.apache.org/docs/latest/sql-ref-datetime-pattern.html">Datetime Patterns</a>.
 * Note that hive Language Manual says it returns 0 if fail, but in fact it returns null.
 * If the second parameter is missing, use "yyyy-MM-dd HH:mm:ss".
 * If no parameters provided, the first parameter will be current_timestamp.
 * If the first parameter is a Date or Timestamp instead of String, we will ignore the
 * second parameter.
 */
case class UnixTimestamp(
    timeExp: Expression,
    format: Expression,
    timeZoneId: Option[String] = None,
    failOnError: Boolean = SQLConf.get.ansiEnabled)
  extends UnixTime {

  def this(timeExp: Expression, format: Expression) =
    this(timeExp, format, None, SQLConf.get.ansiEnabled)

  override def left: Expression = timeExp
  override def right: Expression = format

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  def this(time: Expression) = {
    this(time, Literal(TimestampFormatter.defaultPattern))
  }

  def this() = {
    this(CurrentTimestamp())
  }

  override def prettyName: String = "unix_timestamp"
}

abstract class ToTimestamp
  extends BinaryExpression with TimestampFormatterHelper with ExpectsInputTypes {

  def failOnError: Boolean

  // The result of the conversion to timestamp is microseconds divided by this factor.
  // For example if the factor is 1000000, the result of the expression is in seconds.
  protected def downScaleFactor: Long

  override protected def formatString: Expression = right
  override protected def isParsing = true

  override def inputTypes: Seq[AbstractDataType] =
    Seq(TypeCollection(StringType, DateType, TimestampType), StringType)

  override def dataType: DataType = LongType
  override def nullable: Boolean = if (failOnError) children.exists(_.nullable) else true

  private def isParseError(e: Throwable): Boolean = e match {
    case _: DateTimeParseException |
         _: DateTimeException |
         _: ParseException => true
    case _ => false
  }

  override def eval(input: InternalRow): Any = {
    val t = left.eval(input)
    if (t == null) {
      null
    } else {
      left.dataType match {
        case DateType =>
          daysToMicros(t.asInstanceOf[Int], zoneId) / downScaleFactor
        case TimestampType =>
          t.asInstanceOf[Long] / downScaleFactor
        case StringType =>
          val fmt = right.eval(input)
          if (fmt == null) {
            null
          } else {
            val formatter = formatterOption.getOrElse(getFormatter(fmt.toString))
            try {
              formatter.parse(t.asInstanceOf[UTF8String].toString) / downScaleFactor
            } catch {
              case e if isParseError(e) =>
                if (failOnError) {
                  throw e
                } else {
                  null
                }
            }
          }
      }
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val javaType = CodeGenerator.javaType(dataType)
    val parseErrorBranch = if (failOnError) "throw e;" else s"${ev.isNull} = true;"
    left.dataType match {
      case StringType => formatterOption.map { fmt =>
        val df = classOf[TimestampFormatter].getName
        val formatterName = ctx.addReferenceObj("formatter", fmt, df)
        nullSafeCodeGen(ctx, ev, (datetimeStr, _) =>
          s"""
             |try {
             |  ${ev.value} = $formatterName.parse($datetimeStr.toString()) / $downScaleFactor;
             |} catch (java.time.DateTimeException e) {
             |  $parseErrorBranch
             |} catch (java.time.format.DateTimeParseException e) {
             |  $parseErrorBranch
             |} catch (java.text.ParseException e) {
             |  $parseErrorBranch
             |}
             |""".stripMargin)
      }.getOrElse {
        val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
        val tf = TimestampFormatter.getClass.getName.stripSuffix("$")
        val ldf = LegacyDateFormats.getClass.getName.stripSuffix("$")
        val timestampFormatter = ctx.freshName("timestampFormatter")
        nullSafeCodeGen(ctx, ev, (string, format) =>
          s"""
             |$tf $timestampFormatter = $tf$$.MODULE$$.apply(
             |  $format.toString(),
             |  $zid,
             |  $ldf$$.MODULE$$.SIMPLE_DATE_FORMAT(),
             |  true);
             |try {
             |  ${ev.value} = $timestampFormatter.parse($string.toString()) / $downScaleFactor;
             |} catch (java.time.format.DateTimeParseException e) {
             |    $parseErrorBranch
             |} catch (java.time.DateTimeException e) {
             |    $parseErrorBranch
             |} catch (java.text.ParseException e) {
             |    $parseErrorBranch
             |}
             |""".stripMargin)
      }
      case TimestampType =>
        val eval1 = left.genCode(ctx)
        ev.copy(code = code"""
          ${eval1.code}
          boolean ${ev.isNull} = ${eval1.isNull};
          $javaType ${ev.value} = ${CodeGenerator.defaultValue(dataType)};
          if (!${ev.isNull}) {
            ${ev.value} = ${eval1.value} / $downScaleFactor;
          }""")
      case DateType =>
        val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
        val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
        val eval1 = left.genCode(ctx)
        ev.copy(code = code"""
          ${eval1.code}
          boolean ${ev.isNull} = ${eval1.isNull};
          $javaType ${ev.value} = ${CodeGenerator.defaultValue(dataType)};
          if (!${ev.isNull}) {
            ${ev.value} = $dtu.daysToMicros(${eval1.value}, $zid) / $downScaleFactor;
          }""")
    }
  }
}

abstract class UnixTime extends ToTimestamp {
  override val downScaleFactor: Long = MICROS_PER_SECOND
}

/**
 * Converts the number of seconds from unix epoch (1970-01-01 00:00:00 UTC) to a string
 * representing the timestamp of that moment in the current system time zone in the given
 * format. If the format is missing, using format like "1970-01-01 00:00:00".
 * Note that Hive Language Manual says it returns 0 if fail, but in fact it returns null.
 */
case class FromUnixTime(sec: Expression, format: Expression, timeZoneId: Option[String] = None)
  extends BinaryExpression with TimestampFormatterHelper with ImplicitCastInputTypes
    with NullIntolerant {

  def this(sec: Expression, format: Expression) = this(sec, format, None)

  override def left: Expression = sec
  override def right: Expression = format

  override def prettyName: String = "from_unixtime"

  def this(unix: Expression) = {
    this(unix, Literal(TimestampFormatter.defaultPattern))
  }

  override def dataType: DataType = StringType
  override def nullable: Boolean = true

  override def inputTypes: Seq[AbstractDataType] = Seq(LongType, StringType)

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  override def nullSafeEval(seconds: Any, format: Any): Any = {
    val fmt = formatterOption.getOrElse(getFormatter(format.toString))
    UTF8String.fromString(fmt.format(seconds.asInstanceOf[Long] * MICROS_PER_SECOND))
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    formatterOption.map { f =>
      val formatterName = ctx.addReferenceObj("formatter", f)
      defineCodeGen(ctx, ev, (seconds, _) =>
        s"UTF8String.fromString($formatterName.format($seconds * 1000000L))")
    }.getOrElse {
      val tf = TimestampFormatter.getClass.getName.stripSuffix("$")
      val ldf = LegacyDateFormats.getClass.getName.stripSuffix("$")
      val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
      defineCodeGen(ctx, ev, (seconds, format) =>
        s"""
           |UTF8String.fromString(
           |  $tf$$.MODULE$$.apply($format.toString(),
           |  $zid,
           |  $ldf$$.MODULE$$.SIMPLE_DATE_FORMAT(),
           |  false).format($seconds * 1000000L))
           |""".stripMargin)
    }
  }

  override protected def formatString: Expression = format

  override protected def isParsing: Boolean = false
}

/**
 * Returns the last day of the month which the date belongs to.
 */
case class LastDay(startDate: Expression)
  extends UnaryExpression with ImplicitCastInputTypes with NullIntolerant {
  override def child: Expression = startDate

  override def inputTypes: Seq[AbstractDataType] = Seq(DateType)

  override def dataType: DataType = DateType

  override def nullSafeEval(date: Any): Any = {
    DateTimeUtils.getLastDayOfMonth(date.asInstanceOf[Int])
  }

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    defineCodeGen(ctx, ev, sd => s"$dtu.getLastDayOfMonth($sd)")
  }

  override def prettyName: String = "last_day"
}

/**
 * Returns the first date which is later than startDate and named as dayOfWeek.
 * For example, NextDay(2015-07-27, Sunday) would return 2015-08-02, which is the first
 * Sunday later than 2015-07-27.
 *
 * Allowed "dayOfWeek" is defined in [[DateTimeUtils.getDayOfWeekFromString]].
 */
case class NextDay(startDate: Expression, dayOfWeek: Expression)
  extends BinaryExpression with ImplicitCastInputTypes with NullIntolerant {

  override def left: Expression = startDate
  override def right: Expression = dayOfWeek

  override def inputTypes: Seq[AbstractDataType] = Seq(DateType, StringType)

  override def dataType: DataType = DateType
  override def nullable: Boolean = true

  override def nullSafeEval(start: Any, dayOfW: Any): Any = {
    val dow = DateTimeUtils.getDayOfWeekFromString(dayOfW.asInstanceOf[UTF8String])
    if (dow == -1) {
      null
    } else {
      val sd = start.asInstanceOf[Int]
      DateTimeUtils.getNextDateForDayOfWeek(sd, dow)
    }
  }

  override protected def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    nullSafeCodeGen(ctx, ev, (sd, dowS) => {
      val dateTimeUtilClass = DateTimeUtils.getClass.getName.stripSuffix("$")
      val dayOfWeekTerm = ctx.freshName("dayOfWeek")
      if (dayOfWeek.foldable) {
        val input = dayOfWeek.eval().asInstanceOf[UTF8String]
        if ((input eq null) || DateTimeUtils.getDayOfWeekFromString(input) == -1) {
          s"""
             |${ev.isNull} = true;
           """.stripMargin
        } else {
          val dayOfWeekValue = DateTimeUtils.getDayOfWeekFromString(input)
          s"""
             |${ev.value} = $dateTimeUtilClass.getNextDateForDayOfWeek($sd, $dayOfWeekValue);
           """.stripMargin
        }
      } else {
        s"""
           |int $dayOfWeekTerm = $dateTimeUtilClass.getDayOfWeekFromString($dowS);
           |if ($dayOfWeekTerm == -1) {
           |  ${ev.isNull} = true;
           |} else {
           |  ${ev.value} = $dateTimeUtilClass.getNextDateForDayOfWeek($sd, $dayOfWeekTerm);
           |}
         """.stripMargin
      }
    })
  }

  override def prettyName: String = "next_day"
}

/**
 * Adds an interval to timestamp.
 */
case class TimeAdd(start: Expression, interval: Expression, timeZoneId: Option[String] = None)
  extends BinaryExpression with TimeZoneAwareExpression with ExpectsInputTypes with NullIntolerant {

  def this(start: Expression, interval: Expression) = this(start, interval, None)

  override def left: Expression = start
  override def right: Expression = interval

  override def toString: String = s"$left + $right"
  override def sql: String = s"${left.sql} + ${right.sql}"
  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType, CalendarIntervalType)

  override def dataType: DataType = TimestampType

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  override def nullSafeEval(start: Any, interval: Any): Any = {
    val itvl = interval.asInstanceOf[CalendarInterval]
    DateTimeUtils.timestampAddInterval(
      start.asInstanceOf[Long], itvl.months, itvl.days, itvl.microseconds, zoneId)
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    defineCodeGen(ctx, ev, (sd, i) => {
      s"""$dtu.timestampAddInterval($sd, $i.months, $i.days, $i.microseconds, $zid)"""
    })
  }
}

/**
 * Subtract an interval from timestamp or date, which is only used to give a pretty sql string
 * for `datetime - interval` operations
 */
case class DatetimeSub(
    start: Expression,
    interval: Expression,
    child: Expression) extends RuntimeReplaceable {
  override def exprsReplaced: Seq[Expression] = Seq(start, interval)
  override def toString: String = s"$start - $interval"
  override def mkString(childrenString: Seq[String]): String = childrenString.mkString(" - ")
}

/**
 * Adds date and an interval.
 *
 * When ansi mode is on, the microseconds part of interval needs to be 0, otherwise a runtime
 * [[IllegalArgumentException]] will be raised.
 * When ansi mode is off, if the microseconds part of interval is 0, we perform date + interval
 * for better performance. if the microseconds part is not 0, then the date will be converted to a
 * timestamp to add with the whole interval parts.
 */
case class DateAddInterval(
    start: Expression,
    interval: Expression,
    timeZoneId: Option[String] = None,
    ansiEnabled: Boolean = SQLConf.get.ansiEnabled)
  extends BinaryExpression with ExpectsInputTypes with TimeZoneAwareExpression with NullIntolerant {

  override def left: Expression = start
  override def right: Expression = interval

  override def toString: String = s"$left + $right"
  override def sql: String = s"${left.sql} + ${right.sql}"
  override def inputTypes: Seq[AbstractDataType] = Seq(DateType, CalendarIntervalType)

  override def dataType: DataType = DateType

  override def nullSafeEval(start: Any, interval: Any): Any = {
    val itvl = interval.asInstanceOf[CalendarInterval]
    if (ansiEnabled || itvl.microseconds == 0) {
      DateTimeUtils.dateAddInterval(start.asInstanceOf[Int], itvl)
    } else {
      val startTs = DateTimeUtils.daysToMicros(start.asInstanceOf[Int], zoneId)
      val resultTs = DateTimeUtils.timestampAddInterval(
        startTs, itvl.months, itvl.days, itvl.microseconds, zoneId)
      DateTimeUtils.microsToDays(resultTs, zoneId)
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    nullSafeCodeGen(ctx, ev, (sd, i) => if (ansiEnabled) {
      s"""${ev.value} = $dtu.dateAddInterval($sd, $i);"""
    } else {
      val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
      val startTs = ctx.freshName("startTs")
      val resultTs = ctx.freshName("resultTs")
      s"""
         |if ($i.microseconds == 0) {
         |  ${ev.value} = $dtu.dateAddInterval($sd, $i);
         |} else {
         |  long $startTs = $dtu.daysToMicros($sd, $zid);
         |  long $resultTs =
         |    $dtu.timestampAddInterval($startTs, $i.months, $i.days, $i.microseconds, $zid);
         |  ${ev.value} = $dtu.microsToDays($resultTs, $zid);
         |}
         |""".stripMargin
    })
  }

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))
}

sealed trait UTCTimestamp extends BinaryExpression with ImplicitCastInputTypes with NullIntolerant {
  val func: (Long, String) => Long
  val funcName: String

  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType, StringType)
  override def dataType: DataType = TimestampType

  override def nullSafeEval(time: Any, timezone: Any): Any = {
    func(time.asInstanceOf[Long], timezone.asInstanceOf[UTF8String].toString)
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    if (right.foldable) {
      val tz = right.eval().asInstanceOf[UTF8String]
      if (tz == null) {
        ev.copy(code = code"""
           |boolean ${ev.isNull} = true;
           |long ${ev.value} = 0;
         """.stripMargin)
      } else {
        val tzClass = classOf[ZoneId].getName
        val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
        val escapedTz = StringEscapeUtils.escapeJava(tz.toString)
        val tzTerm = ctx.addMutableState(tzClass, "tz",
          v => s"""$v = $dtu.getZoneId("$escapedTz");""")
        val utcTerm = "java.time.ZoneOffset.UTC"
        val (fromTz, toTz) = this match {
          case _: FromUTCTimestamp => (utcTerm, tzTerm)
          case _: ToUTCTimestamp => (tzTerm, utcTerm)
        }
        val eval = left.genCode(ctx)
        ev.copy(code = code"""
           |${eval.code}
           |boolean ${ev.isNull} = ${eval.isNull};
           |long ${ev.value} = 0;
           |if (!${ev.isNull}) {
           |  ${ev.value} = $dtu.convertTz(${eval.value}, $fromTz, $toTz);
           |}
         """.stripMargin)
      }
    } else {
      defineCodeGen(ctx, ev, (timestamp, format) => {
        s"""$dtu.$funcName($timestamp, $format.toString())"""
      })
    }
  }
}

/**
 * This is a common function for databases supporting TIMESTAMP WITHOUT TIMEZONE. This function
 * takes a timestamp which is timezone-agnostic, and interprets it as a timestamp in UTC, and
 * renders that timestamp as a timestamp in the given time zone.
 *
 * However, timestamp in Spark represents number of microseconds from the Unix epoch, which is not
 * timezone-agnostic. So in Spark this function just shift the timestamp value from UTC timezone to
 * the given timezone.
 *
 * This function may return confusing result if the input is a string with timezone, e.g.
 * '2018-03-13T06:18:23+00:00'. The reason is that, Spark firstly cast the string to timestamp
 * according to the timezone in the string, and finally display the result by converting the
 * timestamp to string according to the session local timezone.
 */
case class FromUTCTimestamp(left: Expression, right: Expression) extends UTCTimestamp {
  override val func = DateTimeUtils.fromUTCTime
  override val funcName: String = "fromUTCTime"
  override val prettyName: String = "from_utc_timestamp"
}

/**
 * This is a common function for databases supporting TIMESTAMP WITHOUT TIMEZONE. This function
 * takes a timestamp which is timezone-agnostic, and interprets it as a timestamp in the given
 * timezone, and renders that timestamp as a timestamp in UTC.
 *
 * However, timestamp in Spark represents number of microseconds from the Unix epoch, which is not
 * timezone-agnostic. So in Spark this function just shift the timestamp value from the given
 * timezone to UTC timezone.
 *
 * This function may return confusing result if the input is a string with timezone, e.g.
 * '2018-03-13T06:18:23+00:00'. The reason is that, Spark firstly cast the string to timestamp
 * according to the timezone in the string, and finally display the result by converting the
 * timestamp to string according to the session local timezone.
 */
case class ToUTCTimestamp(left: Expression, right: Expression) extends UTCTimestamp {
  override val func = DateTimeUtils.toUTCTime
  override val funcName: String = "toUTCTime"
  override val prettyName: String = "to_utc_timestamp"
}

/**
 * Returns the date that is num_months after start_date.
 */
case class AddMonths(startDate: Expression, numMonths: Expression)
  extends BinaryExpression with ImplicitCastInputTypes with NullIntolerant {

  override def left: Expression = startDate
  override def right: Expression = numMonths

  override def inputTypes: Seq[AbstractDataType] = Seq(DateType, IntegerType)

  override def dataType: DataType = DateType

  override def nullSafeEval(start: Any, months: Any): Any = {
    DateTimeUtils.dateAddMonths(start.asInstanceOf[Int], months.asInstanceOf[Int])
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    defineCodeGen(ctx, ev, (sd, m) => {
      s"""$dtu.dateAddMonths($sd, $m)"""
    })
  }

  override def prettyName: String = "add_months"
}

/**
 * Returns number of months between times `timestamp1` and `timestamp2`.
 * If `timestamp1` is later than `timestamp2`, then the result is positive.
 * If `timestamp1` and `timestamp2` are on the same day of month, or both
 * are the last day of month, time of day will be ignored. Otherwise, the
 * difference is calculated based on 31 days per month, and rounded to
 * 8 digits unless roundOff=false.
 */
case class MonthsBetween(
    date1: Expression,
    date2: Expression,
    roundOff: Expression,
    timeZoneId: Option[String] = None)
  extends TernaryExpression with TimeZoneAwareExpression with ImplicitCastInputTypes
    with NullIntolerant {

  def this(date1: Expression, date2: Expression) = this(date1, date2, Literal.TrueLiteral, None)

  def this(date1: Expression, date2: Expression, roundOff: Expression) =
    this(date1, date2, roundOff, None)

  override def children: Seq[Expression] = Seq(date1, date2, roundOff)

  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType, TimestampType, BooleanType)

  override def dataType: DataType = DoubleType

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  override def nullSafeEval(t1: Any, t2: Any, roundOff: Any): Any = {
    DateTimeUtils.monthsBetween(
      t1.asInstanceOf[Long], t2.asInstanceOf[Long], roundOff.asInstanceOf[Boolean], zoneId)
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    defineCodeGen(ctx, ev, (d1, d2, roundOff) => {
      s"""$dtu.monthsBetween($d1, $d2, $roundOff, $zid)"""
    })
  }

  override def prettyName: String = "months_between"
}

/**
 * Parses a column to a date based on the given format.
 */
case class ParseToDate(left: Expression, format: Option[Expression], child: Expression)
  extends RuntimeReplaceable {

  def this(left: Expression, format: Expression) = {
    this(left, Option(format), Cast(GetTimestamp(left, format), DateType))
  }

  def this(left: Expression) = {
    // backwards compatibility
    this(left, None, Cast(left, DateType))
  }

  override def exprsReplaced: Seq[Expression] = left +: format.toSeq
  override def flatArguments: Iterator[Any] = Iterator(left, format)

  override def prettyName: String = "to_date"
}

/**
 * Parses a column to a timestamp based on the supplied format.
 */
case class ParseToTimestamp(left: Expression, format: Option[Expression], child: Expression)
  extends RuntimeReplaceable {

  def this(left: Expression, format: Expression) = {
    this(left, Option(format), GetTimestamp(left, format))
  }

  def this(left: Expression) = this(left, None, Cast(left, TimestampType))

  override def flatArguments: Iterator[Any] = Iterator(left, format)
  override def exprsReplaced: Seq[Expression] = left +: format.toSeq

  override def prettyName: String = "to_timestamp"
  override def dataType: DataType = TimestampType
}

trait TruncInstant extends BinaryExpression with ImplicitCastInputTypes {
  val instant: Expression
  val format: Expression
  override def nullable: Boolean = true

  private lazy val truncLevel: Int =
    DateTimeUtils.parseTruncLevel(format.eval().asInstanceOf[UTF8String])

  /**
   * @param input internalRow (time)
   * @param minLevel Minimum level that can be used for truncation (e.g WEEK for Date input)
   * @param truncFunc function: (time, level) => time
   */
  protected def evalHelper(input: InternalRow, minLevel: Int)(
    truncFunc: (Any, Int) => Any): Any = {
    val level = if (format.foldable) {
      truncLevel
    } else {
      DateTimeUtils.parseTruncLevel(format.eval().asInstanceOf[UTF8String])
    }
    if (level < minLevel) {
      // unknown format or too small level
      null
    } else {
      val t = instant.eval(input)
      if (t == null) {
        null
      } else {
        truncFunc(t, level)
      }
    }
  }

  protected def codeGenHelper(
      ctx: CodegenContext,
      ev: ExprCode,
      minLevel: Int,
      orderReversed: Boolean = false)(
      truncFunc: (String, String) => String)
    : ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")

    val javaType = CodeGenerator.javaType(dataType)
    if (format.foldable) {
      if (truncLevel < minLevel) {
        ev.copy(code = code"""
          boolean ${ev.isNull} = true;
          $javaType ${ev.value} = ${CodeGenerator.defaultValue(dataType)};""")
      } else {
        val t = instant.genCode(ctx)
        val truncFuncStr = truncFunc(t.value, truncLevel.toString)
        ev.copy(code = code"""
          ${t.code}
          boolean ${ev.isNull} = ${t.isNull};
          $javaType ${ev.value} = ${CodeGenerator.defaultValue(dataType)};
          if (!${ev.isNull}) {
            ${ev.value} = $dtu.$truncFuncStr;
          }""")
      }
    } else {
      nullSafeCodeGen(ctx, ev, (left, right) => {
        val form = ctx.freshName("form")
        val (dateVal, fmt) = if (orderReversed) {
          (right, left)
        } else {
          (left, right)
        }
        val truncFuncStr = truncFunc(dateVal, form)
        s"""
          int $form = $dtu.parseTruncLevel($fmt);
          if ($form < $minLevel) {
            ${ev.isNull} = true;
          } else {
            ${ev.value} = $dtu.$truncFuncStr
          }
        """
      })
    }
  }
}

/**
 * Returns date truncated to the unit specified by the format.
 */
case class TruncDate(date: Expression, format: Expression)
  extends TruncInstant {
  override def left: Expression = date
  override def right: Expression = format

  override def inputTypes: Seq[AbstractDataType] = Seq(DateType, StringType)
  override def dataType: DataType = DateType
  override def prettyName: String = "trunc"
  override val instant = date

  override def eval(input: InternalRow): Any = {
    evalHelper(input, minLevel = MIN_LEVEL_OF_DATE_TRUNC) { (d: Any, level: Int) =>
      DateTimeUtils.truncDate(d.asInstanceOf[Int], level)
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    codeGenHelper(ctx, ev, minLevel = MIN_LEVEL_OF_DATE_TRUNC) {
      (date: String, fmt: String) => s"truncDate($date, $fmt);"
    }
  }
}

/**
 * Returns timestamp truncated to the unit specified by the format.
 */
case class TruncTimestamp(
    format: Expression,
    timestamp: Expression,
    timeZoneId: Option[String] = None)
  extends TruncInstant with TimeZoneAwareExpression {
  override def left: Expression = format
  override def right: Expression = timestamp

  override def inputTypes: Seq[AbstractDataType] = Seq(StringType, TimestampType)
  override def dataType: TimestampType = TimestampType
  override def prettyName: String = "date_trunc"
  override val instant = timestamp
  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  def this(format: Expression, timestamp: Expression) = this(format, timestamp, None)

  override def eval(input: InternalRow): Any = {
    evalHelper(input, minLevel = MIN_LEVEL_OF_TIMESTAMP_TRUNC) { (t: Any, level: Int) =>
      DateTimeUtils.truncTimestamp(t.asInstanceOf[Long], level, zoneId)
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
    codeGenHelper(ctx, ev, minLevel = MIN_LEVEL_OF_TIMESTAMP_TRUNC, true) {
      (date: String, fmt: String) =>
        s"truncTimestamp($date, $fmt, $zid);"
    }
  }
}

/**
 * Returns the number of days from startDate to endDate.
 */
case class DateDiff(endDate: Expression, startDate: Expression)
  extends BinaryExpression with ImplicitCastInputTypes with NullIntolerant {

  override def left: Expression = endDate
  override def right: Expression = startDate
  override def inputTypes: Seq[AbstractDataType] = Seq(DateType, DateType)
  override def dataType: DataType = IntegerType

  override def nullSafeEval(end: Any, start: Any): Any = {
    end.asInstanceOf[Int] - start.asInstanceOf[Int]
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, (end, start) => s"$end - $start")
  }
}

/**
 * Gets timestamps from strings using given pattern.
 */
private case class GetTimestamp(
    left: Expression,
    right: Expression,
    timeZoneId: Option[String] = None,
    failOnError: Boolean = SQLConf.get.ansiEnabled)
  extends ToTimestamp {

  override val downScaleFactor = 1
  override def dataType: DataType = TimestampType

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))
}

case class MakeDate(
    year: Expression,
    month: Expression,
    day: Expression,
    failOnError: Boolean = SQLConf.get.ansiEnabled)
  extends TernaryExpression with ImplicitCastInputTypes with NullIntolerant {

  def this(year: Expression, month: Expression, day: Expression) =
    this(year, month, day, SQLConf.get.ansiEnabled)

  override def children: Seq[Expression] = Seq(year, month, day)
  override def inputTypes: Seq[AbstractDataType] = Seq(IntegerType, IntegerType, IntegerType)
  override def dataType: DataType = DateType
  override def nullable: Boolean = if (failOnError) children.exists(_.nullable) else true

  override def nullSafeEval(year: Any, month: Any, day: Any): Any = {
    try {
      val ld = LocalDate.of(year.asInstanceOf[Int], month.asInstanceOf[Int], day.asInstanceOf[Int])
      localDateToDays(ld)
    } catch {
      case _: java.time.DateTimeException if !failOnError => null
    }
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    val failOnErrorBranch = if (failOnError) "throw e;" else s"${ev.isNull} = true;"
    nullSafeCodeGen(ctx, ev, (year, month, day) => {
      s"""
      try {
        ${ev.value} = $dtu.localDateToDays(java.time.LocalDate.of($year, $month, $day));
      } catch (java.time.DateTimeException e) {
        $failOnErrorBranch
      }"""
    })
  }

  override def prettyName: String = "make_date"
}

case class MakeTimestamp(
    year: Expression,
    month: Expression,
    day: Expression,
    hour: Expression,
    min: Expression,
    sec: Expression,
    timezone: Option[Expression] = None,
    timeZoneId: Option[String] = None,
    failOnError: Boolean = SQLConf.get.ansiEnabled)
  extends SeptenaryExpression with TimeZoneAwareExpression with ImplicitCastInputTypes
    with NullIntolerant {

  def this(
      year: Expression,
      month: Expression,
      day: Expression,
      hour: Expression,
      min: Expression,
      sec: Expression) = {
    this(year, month, day, hour, min, sec, None, None, SQLConf.get.ansiEnabled)
  }

  def this(
      year: Expression,
      month: Expression,
      day: Expression,
      hour: Expression,
      min: Expression,
      sec: Expression,
      timezone: Expression) = {
    this(year, month, day, hour, min, sec, Some(timezone), None, SQLConf.get.ansiEnabled)
  }

  override def children: Seq[Expression] = Seq(year, month, day, hour, min, sec) ++ timezone
  // Accept `sec` as DecimalType to avoid loosing precision of microseconds while converting
  // them to the fractional part of `sec`.
  override def inputTypes: Seq[AbstractDataType] =
    Seq(IntegerType, IntegerType, IntegerType, IntegerType, IntegerType, DecimalType(8, 6)) ++
    timezone.map(_ => StringType)
  override def dataType: DataType = TimestampType
  override def nullable: Boolean = if (failOnError) children.exists(_.nullable) else true

  override def withTimeZone(timeZoneId: String): TimeZoneAwareExpression =
    copy(timeZoneId = Option(timeZoneId))

  private def toMicros(
      year: Int,
      month: Int,
      day: Int,
      hour: Int,
      min: Int,
      secAndMicros: Decimal,
      zoneId: ZoneId): Any = {
    try {
      assert(secAndMicros.scale == 6,
        s"Seconds fraction must have 6 digits for microseconds but got ${secAndMicros.scale}")
      val unscaledSecFrac = secAndMicros.toUnscaledLong
      assert(secAndMicros.precision <= 8,
        s"Seconds and fraction cannot have more than 8 digits but got ${secAndMicros.precision}")
      val totalMicros = unscaledSecFrac.toInt // 8 digits cannot overflow Int
      val seconds = Math.floorDiv(totalMicros, MICROS_PER_SECOND.toInt)
      val nanos = Math.floorMod(totalMicros, MICROS_PER_SECOND.toInt) * NANOS_PER_MICROS.toInt
      val ldt = if (seconds == 60) {
        if (nanos == 0) {
          // This case of sec = 60 and nanos = 0 is supported for compatibility with PostgreSQL
          LocalDateTime.of(year, month, day, hour, min, 0, 0).plusMinutes(1)
        } else {
          throw new DateTimeException("The fraction of sec must be zero. Valid range is [0, 60].")
        }
      } else {
        LocalDateTime.of(year, month, day, hour, min, seconds, nanos)
      }
      instantToMicros(ldt.atZone(zoneId).toInstant)
    } catch {
      case _: DateTimeException if !failOnError => null
    }
  }

  override def nullSafeEval(
      year: Any,
      month: Any,
      day: Any,
      hour: Any,
      min: Any,
      sec: Any,
      timezone: Option[Any]): Any = {
    val zid = timezone
      .map(tz => DateTimeUtils.getZoneId(tz.asInstanceOf[UTF8String].toString))
      .getOrElse(zoneId)
    toMicros(
      year.asInstanceOf[Int],
      month.asInstanceOf[Int],
      day.asInstanceOf[Int],
      hour.asInstanceOf[Int],
      min.asInstanceOf[Int],
      sec.asInstanceOf[Decimal],
      zid)
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
    val zid = ctx.addReferenceObj("zoneId", zoneId, classOf[ZoneId].getName)
    val d = Decimal.getClass.getName.stripSuffix("$")
    val failOnErrorBranch = if (failOnError) "throw e;" else s"${ev.isNull} = true;"
    nullSafeCodeGen(ctx, ev, (year, month, day, hour, min, secAndNanos, timezone) => {
      val zoneId = timezone.map(tz => s"$dtu.getZoneId(${tz}.toString())").getOrElse(zid)
      s"""
      try {
        com.ledis.sql.types.Decimal secFloor = $secAndNanos.floor();
        com.ledis.sql.types.Decimal nanosPerSec = $d$$.MODULE$$.apply(1000000000L, 10, 0);
        int nanos = (($secAndNanos.$$minus(secFloor)).$$times(nanosPerSec)).toInt();
        int seconds = secFloor.toInt();
        java.time.LocalDateTime ldt;
        if (seconds == 60) {
          if (nanos == 0) {
            ldt = java.time.LocalDateTime.of(
              $year, $month, $day, $hour, $min, 0, 0).plusMinutes(1);
          } else {
            throw new java.time.DateTimeException(
              "The fraction of sec must be zero. Valid range is [0, 60].");
          }
        } else {
          ldt = java.time.LocalDateTime.of($year, $month, $day, $hour, $min, seconds, nanos);
        }
        java.time.Instant instant = ldt.atZone($zoneId).toInstant();
        ${ev.value} = $dtu.instantToMicros(instant);
      } catch (java.time.DateTimeException e) {
        $failOnErrorBranch
      }"""
    })
  }

  override def prettyName: String = "make_timestamp"
}

object DatePart {

  def parseExtractField(
      extractField: String,
      source: Expression,
      errorHandleFunc: => Nothing): Expression = extractField.toUpperCase(Locale.ROOT) match {
    case "YEAR" | "Y" | "YEARS" | "YR" | "YRS" => Year(source)
    case "YEAROFWEEK" => YearOfWeek(source)
    case "QUARTER" | "QTR" => Quarter(source)
    case "MONTH" | "MON" | "MONS" | "MONTHS" => Month(source)
    case "WEEK" | "W" | "WEEKS" => WeekOfYear(source)
    case "DAY" | "D" | "DAYS" => DayOfMonth(source)
    case "DAYOFWEEK" | "DOW" => DayOfWeek(source)
    case "DAYOFWEEK_ISO" | "DOW_ISO" => Add(WeekDay(source), Literal(1))
    case "DOY" => DayOfYear(source)
    case "HOUR" | "H" | "HOURS" | "HR" | "HRS" => Hour(source)
    case "MINUTE" | "M" | "MIN" | "MINS" | "MINUTES" => Minute(source)
    case "SECOND" | "S" | "SEC" | "SECONDS" | "SECS" => SecondWithFraction(source)
    case _ => errorHandleFunc
  }

  def toEquivalentExpr(field: Expression, source: Expression): Expression = {
    if (!field.foldable) {
      throw new AnalysisException("The field parameter needs to be a foldable string value.")
    }
    val fieldEval = field.eval()
    if (fieldEval == null) {
      Literal(null, DoubleType)
    } else {
      val fieldStr = fieldEval.asInstanceOf[UTF8String].toString
      val errMsg = s"Literals of type '$fieldStr' are currently not supported " +
        s"for the ${source.dataType.catalogString} type."
      if (source.dataType == CalendarIntervalType) {
        ExtractIntervalPart.parseExtractField(
          fieldStr,
          source,
          throw new AnalysisException(errMsg))
      } else {
        DatePart.parseExtractField(fieldStr, source, throw new AnalysisException(errMsg))
      }
    }
  }
}

case class DatePart(field: Expression, source: Expression, child: Expression)
  extends RuntimeReplaceable {

  def this(field: Expression, source: Expression) = {
    this(field, source, DatePart.toEquivalentExpr(field, source))
  }

  override def flatArguments: Iterator[Any] = Iterator(field, source)
  override def exprsReplaced: Seq[Expression] = Seq(field, source)

  override def prettyName: String = "date_part"
}

case class Extract(field: Expression, source: Expression, child: Expression)
  extends RuntimeReplaceable {

  def this(field: Expression, source: Expression) = {
    this(field, source, DatePart.toEquivalentExpr(field, source))
  }

  override def flatArguments: Iterator[Any] = Iterator(field, source)

  override def exprsReplaced: Seq[Expression] = Seq(field, source)

  override def mkString(childrenString: Seq[String]): String = {
    prettyName + childrenString.mkString("(", " FROM ", ")")
  }
}

/**
 * Returns the interval from startTimestamp to endTimestamp in which the `months` and `day` field
 * is set to 0 and the `microseconds` field is initialized to the microsecond difference
 * between the given timestamps.
 */
case class SubtractTimestamps(endTimestamp: Expression, startTimestamp: Expression)
  extends BinaryExpression with ExpectsInputTypes with NullIntolerant {

  override def left: Expression = endTimestamp
  override def right: Expression = startTimestamp
  override def inputTypes: Seq[AbstractDataType] = Seq(TimestampType, TimestampType)
  override def dataType: DataType = CalendarIntervalType

  override def nullSafeEval(end: Any, start: Any): Any = {
    new CalendarInterval(0, 0, end.asInstanceOf[Long] - start.asInstanceOf[Long])
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, (end, start) =>
      s"new com.ledis.unsafe.types.CalendarInterval(0, 0, $end - $start)")
  }
}

/**
 * Returns the interval from the `left` date (inclusive) to the `right` date (exclusive).
 */
case class SubtractDates(left: Expression, right: Expression)
  extends BinaryExpression with ImplicitCastInputTypes with NullIntolerant {

  override def inputTypes: Seq[AbstractDataType] = Seq(DateType, DateType)
  override def dataType: DataType = CalendarIntervalType

  override def nullSafeEval(leftDays: Any, rightDays: Any): Any = {
    DateTimeUtils.subtractDates(leftDays.asInstanceOf[Int], rightDays.asInstanceOf[Int])
  }

  override def doGenCode(ctx: CodegenContext, ev: ExprCode): ExprCode = {
    defineCodeGen(ctx, ev, (leftDays, rightDays) => {
      val dtu = DateTimeUtils.getClass.getName.stripSuffix("$")
      s"$dtu.subtractDates($leftDays, $rightDays)"
    })
  }
}
