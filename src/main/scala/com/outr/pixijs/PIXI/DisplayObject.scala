package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
@JSName("PIXI.DisplayObject")
class DisplayObject extends js.Object {
  var alpha: Double = js.native
  var cacheAsBitmap: Boolean = js.native
  var filterArea: Rectangle = js.native
  var filters: Array[Filter] = js.native
  def localTransform: Matrix = js.native
  var mask: Graphics | Sprite = js.native
  def position: Point = js.native
  def pivot: Point = js.native
  def scale: Point = js.native
  var rotation: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}
