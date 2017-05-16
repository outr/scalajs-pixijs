package com.outr.pixijs.PIXI

import org.scalajs.dom.raw.HTMLCanvasElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Text")
class Text(var text: String,
           var style: TextStyle = js.native,
           canvas: HTMLCanvasElement = js.native) extends Sprite(js.native) {
  var context: HTMLCanvasElement = js.native
  var dirty: Boolean = js.native
  def resolution: Double = js.native
}

@js.native
@JSGlobal("PIXI.Text")
object Text extends js.Object {
  def calculateFontProperties(fontStyle: String): StyleOptions = js.native
}