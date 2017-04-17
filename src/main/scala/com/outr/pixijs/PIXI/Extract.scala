package com.outr.pixijs.PIXI

import org.scalajs.dom.html

import scala.scalajs._
import scala.scalajs.js.typedarray.Uint8ClampedArray
import scala.scalajs.js.|

@js.native
trait Extract extends js.Any {
  def base64(target: DisplayObject | RenderTexture): String = js.native
  def canvas(target: DisplayObject | RenderTexture): html.Canvas = js.native
  def destroy(): Unit = js.native
  def image(target: DisplayObject | RenderTexture): html.Image = js.native
  def pixels(target: DisplayObject | RenderTexture): Uint8ClampedArray = js.native
}