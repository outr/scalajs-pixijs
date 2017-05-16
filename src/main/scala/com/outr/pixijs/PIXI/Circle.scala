package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Circle")
class Circle(var x: Double = js.native,
             var y: Double = js.native,
             var radius: Double = js.native) extends js.Object {
  def `type`: Double = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}
