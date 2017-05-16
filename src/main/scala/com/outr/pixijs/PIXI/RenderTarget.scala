package com.outr.pixijs.PIXI

import org.scalajs.dom.raw.{WebGLBuffer, WebGLFramebuffer, WebGLRenderingContext, WebGLTexture}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.RenderTarget")
class RenderTarget(var gl: WebGLRenderingContext,
                   var width: Double = js.native,
                   var height: Double = js.native,
                   var scaleMode: Double = js.native,
                   var resolution: Double = js.native,
                   var root: Boolean = js.native) extends js.Object {
  var clearColor: Array[Double] = js.native
  var defaultFrame: WebGLBuffer = js.native
  var filterData: Array[js.Object] = js.native
  var frame: Rectangle = js.native
  var frameBuffer: WebGLFramebuffer = js.native
  var projectionMatrix: Matrix = js.native
  var size: Rectangle = js.native
  var stencilBuffer: WebGLBuffer = js.native
  var stencilMaskStack: Array[Graphics] = js.native
  var texture: WebGLTexture = js.native
  var transform: Matrix = js.native

  def activate(): Unit = js.native
  def attachStencilBuffer(): Unit = js.native
  def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle): Unit = js.native
  def clear(clearColor: Array[Double] = js.native): Unit = js.native
  def destroy(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setFrame(destinationFrame: Rectangle, sourceFrame: Rectangle): Unit = js.native
}
