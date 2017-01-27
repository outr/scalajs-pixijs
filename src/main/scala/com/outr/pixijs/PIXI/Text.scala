package com.outr.pixijs.PIXI

import org.scalajs.dom.raw.HTMLCanvasElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
@JSName("PIXI.Text")
class Text(text: String,
           style: js.Object | TextStyle = js.native,
           canvas: HTMLCanvasElement = js.native) extends Sprite(js.native) {
  var context: HTMLCanvasElement = js.native
}

@js.native
@JSName("PIXI.Text")
object Text extends js.Object {
  def calculateFontProperties(fontStyle: String): StyleOptions = js.native
  def getFontStyle(style: StyleOptions | TextStyle): String = js.native
}