package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.DisplayObject")
class DisplayObject extends js.Object {
  def position: Point = js.native
  def pivot: Point = js.native
  def scale: Point = js.native
  var rotation: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}
