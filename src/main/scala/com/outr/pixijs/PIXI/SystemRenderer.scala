package com.outr.pixijs.PIXI

import com.outr.pixijs.PIXI.utils.EventEmitter
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
class SystemRenderer extends EventEmitter {
  var autoResize: Boolean = js.native
  var backgroundColor: Long = js.native
  var clearBeforeRender: Boolean = js.native
  def extract: Extract = js.native
  def plugins: Plugins = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var resolution: Double = js.native
  var roundPixels: Boolean = js.native
  var screen: Rectangle = js.native
  var transparent: Boolean = js.native
  var `type`: Double = js.native
  var view: html.Canvas = js.native

  def width: Int = js.native
  def height: Int = js.native

  def generateTexture(displayObject: DisplayObject, scaleMode: Double, resolution: Double): Texture = js.native

  def resize(screenWidth: Int, screenHeight: Int): Unit = js.native

  def render(container: Container): Unit = js.native

  def destroy(removeView: Boolean): Unit = js.native
}
