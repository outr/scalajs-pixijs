package com.outr.pixijs.PIXI

import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.TextMetrics")
class TextMetrics(var text: String,
                  var style: TextStyle,
                  var width: Double,
                  var height: Double,
                  var lines: Array[String],
                  var lineWidths: Array[Double],
                  var lineHeight: Double,
                  var maxLineWidth: Double,
                  var fontProperties: js.Object) extends js.Object

@js.native
@JSName("PIXI.TextMetrics")
object TextMetrics extends js.Object {
  def measureFont(font: String): FontMetrics = js.native
  def measureText(text: String,
                  style: TextStyle,
                  wordWrap: Boolean = js.native,
                  canvas: html.Canvas = js.native): TextMetrics = js.native
}