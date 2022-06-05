package com.ledis.utils

/**
 * This class records the paths the serializer and deserializer walk through to reach current path.
 * Note that this class adds new path in prior to recorded paths so it maintains
 * the paths as reverse order.
 */
case class WalkedTypePath(private val walkedPaths: Seq[String] = Nil) {
  def recordRoot(className: String): WalkedTypePath =
    newInstance(s"""- root class: "$className"""")

  def recordOption(className: String): WalkedTypePath =
    newInstance(s"""- option value class: "$className"""")

  def recordArray(elementClassName: String): WalkedTypePath =
    newInstance(s"""- array element class: "$elementClassName"""")

  def recordMap(keyClassName: String, valueClassName: String): WalkedTypePath = {
    newInstance(s"""- map key class: "$keyClassName"""" +
        s""", value class: "$valueClassName"""")
  }

  def recordKeyForMap(keyClassName: String): WalkedTypePath =
    newInstance(s"""- map key class: "$keyClassName"""")

  def recordValueForMap(valueClassName: String): WalkedTypePath =
    newInstance(s"""- map value class: "$valueClassName"""")

  def recordField(className: String, fieldName: String): WalkedTypePath =
    newInstance(s"""- field (class: "$className", name: "$fieldName")""")

  override def toString: String = {
    walkedPaths.mkString("\n")
  }

  def getPaths: Seq[String] = walkedPaths

  private def newInstance(newRecord: String): WalkedTypePath =
    WalkedTypePath(newRecord +: walkedPaths)
}
