package com.outr.pixijs.PIXI

import org.scalajs.dom.html

import scala.scalajs.js

@js.native
class SystemRenderer extends js.Object {
  def view: html.Canvas = js.native
  def width: Int = js.native
  def height: Int = js.native
  def transparent: Boolean = js.native
  def autoResize: Boolean = js.native

  def generateTexture(displayObject: DisplayObject, scaleMode: Double, resolution: Double): Texture = js.native

  def resize(screenWidth: Int, screenHeight: Int): Unit = js.native

  def render(container: Container): Unit = js.native

  def destroy(removeView: Boolean): Unit = js.native
}
