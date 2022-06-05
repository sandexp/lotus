package com.ledis.expressions.projection

import com.ledis.expressions._
import com.ledis.expressions.expression._
import com.ledis.expressions.predicate._

/**
 * Rewrites an expression using rules that are guaranteed preserve the result while attempting
 * to remove cosmetic variations. Deterministic expressions that are `equal` after canonicalization
 * will always return the same answer given the same input (i.e. false positives should not be
 * possible). However, it is possible that two canonical expressions that are not equal will in fact
 * return the same answer given any input (i.e. false negatives are possible).
 *
 * The following rules are applied:
 *  - Names and nullability hints for [[com.ledis.types.DataType]]s are stripped.
 *  - Names for [[GetStructField]] are stripped.
 *  - TimeZoneId for [[com.ledis.expressions.projection.Cast]] and [[AnsiCast]] are stripped if `needsTimeZone` is false.
 *  - Commutative and associative operations ([[Add]] and [[Multiply]]) have their children ordered
 *    by `hashCode`.
 *  - [[com.ledis.expressions.predicate.EqualTo]] and [[com.ledis.expressions.predicate.EqualNullSafe]] are reordered by `hashCode`.
 *  - Other comparisons ([[com.ledis.expressions.predicate.GreaterThan]], [[com.ledis.expressions.predicate.LessThan]]) are reversed by `hashCode`.
 *  - Elements in [[com.ledis.expressions.predicate.In]] are reordered by `hashCode`.
 */
object Canonicalize {
  def execute(e: Expression): Expression = {
    expressionReorder(ignoreTimeZone(ignoreNamesTypes(e)))
  }

  /** Remove names and nullability from types, and names from `GetStructField`. */
  private[expressions] def ignoreNamesTypes(e: Expression): Expression = e match {
    case a: AttributeReference =>
      AttributeReference("none", a.dataType.asNullable)(exprId = a.exprId)
    case GetStructField(child, ordinal, Some(_)) => GetStructField(child, ordinal, None)
    case _ => e
  }

  /** Remove TimeZoneId for Cast if needsTimeZone return false. */
  private[expressions] def ignoreTimeZone(e: Expression): Expression = e match {
    case c: CastBase if c.timeZoneId.nonEmpty && !c.needsTimeZone =>
      c.withTimeZone(null)
    case _ => e
  }

  /** Collects adjacent commutative operations. */
  private def gatherCommutative(
      e: Expression,
      f: PartialFunction[Expression, Seq[Expression]]): Seq[Expression] = e match {
    case c if f.isDefinedAt(c) => f(c).flatMap(gatherCommutative(_, f))
    case other => other :: Nil
  }

  /** Orders a set of commutative operations by their hash code. */
  private def orderCommutative(
      e: Expression,
      f: PartialFunction[Expression, Seq[Expression]]): Seq[Expression] =
    gatherCommutative(e, f).sortBy(_.hashCode())

  /** Rearrange expressions that are commutative or associative. */
  private def expressionReorder(e: Expression): Expression = e match {
    case a @ Add(_, _, f) =>
      orderCommutative(a, { case Add(l, r, _) => Seq(l, r) }).reduce(Add(_, _, f))
    case m @ Multiply(_, _, f) =>
      orderCommutative(m, { case Multiply(l, r, _) => Seq(l, r) }).reduce(Multiply(_, _, f))

    case o: Or =>
      orderCommutative(o, { case Or(l, r) if l.deterministic && r.deterministic => Seq(l, r) })
        .reduce(Or)
    case a: And =>
      orderCommutative(a, { case And(l, r) if l.deterministic && r.deterministic => Seq(l, r)})
        .reduce(And)

    case o: BitwiseOr =>
      orderCommutative(o, { case BitwiseOr(l, r) => Seq(l, r) }).reduce(BitwiseOr)
    case a: BitwiseAnd =>
      orderCommutative(a, { case BitwiseAnd(l, r) => Seq(l, r) }).reduce(BitwiseAnd)
    case x: BitwiseXor =>
      orderCommutative(x, { case BitwiseXor(l, r) => Seq(l, r) }).reduce(BitwiseXor)

    case EqualTo(l, r) if l.hashCode() > r.hashCode() => EqualTo(r, l)
    case EqualNullSafe(l, r) if l.hashCode() > r.hashCode() => EqualNullSafe(r, l)

    case GreaterThan(l, r) if l.hashCode() > r.hashCode() => LessThan(r, l)
    case LessThan(l, r) if l.hashCode() > r.hashCode() => GreaterThan(r, l)

    case GreaterThanOrEqual(l, r) if l.hashCode() > r.hashCode() => LessThanOrEqual(r, l)
    case LessThanOrEqual(l, r) if l.hashCode() > r.hashCode() => GreaterThanOrEqual(r, l)

    // Note in the following `NOT` cases, `l.hashCode() <= r.hashCode()` holds. The reason is that
    // canonicalization is conducted bottom-up -- see [[Expression.canonicalized]].
    case Not(GreaterThan(l, r)) => LessThanOrEqual(l, r)
    case Not(LessThan(l, r)) => GreaterThanOrEqual(l, r)
    case Not(GreaterThanOrEqual(l, r)) => LessThan(l, r)
    case Not(LessThanOrEqual(l, r)) => GreaterThan(l, r)

    // order the list in the In operator
    case In(value, list) if list.length > 1 => In(value, list.sortBy(_.hashCode()))

    case g: Greatest =>
      val newChildren = orderCommutative(g, { case Greatest(children) => children })
      Greatest(newChildren)
    case l: Least =>
      val newChildren = orderCommutative(l, { case Least(children) => children })
      Least(newChildren)

    case _ => e
  }
}
