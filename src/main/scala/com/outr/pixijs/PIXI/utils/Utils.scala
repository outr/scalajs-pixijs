package com.outr.pixijs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("PIXI.utils")
@js.native
object Utils extends js.Object {
  def uuid(): Double = js.native

  def hex2rgb(hex: Double, out: js.Array[Double] = js.native): js.Array[Double] = js.native

  def hex2string(hex: Double): String = js.native

  def rgb2hex(rgb: js.Array[Number]): Double = js.native

  def canUseNewCanvasBlendModes(): Boolean = js.native

  def getNextPowerOfTwo(number: Double): Double = js.native

  def isPowerOfTwo(width: Double, height: Double): Boolean = js.native

  def getResolutionOfUrl(url: String): Double = js.native

  def sayHello(`type`: String): Unit = js.native

  def isWebGLSupported(): Boolean = js.native

  def sign(n: Double): Double = js.native

  def removeItems[T](arr: js.Array[T], startIdx: Double, removeCount: Double): Unit = js.native

  var TextureCache: js.Any = js.native
  var BaseTextureCache: js.Any = js.native
}
