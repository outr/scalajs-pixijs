package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Ellipse")
class Ellipse(var x: Double = js.native,
              var y: Double = js.native,
              var width: Double = js.native,
              var height: Double = js.native) extends js.Object {
  def `type`: Double = js.native

  def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}