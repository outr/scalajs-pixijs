package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.ObservablePoint")
class ObservablePoint(var cb: js.Function0[Unit],
                      var scope: js.Object,
                      var x: Double = js.native,
                      var y: Double = js.native) extends js.Object {
  def copy(point: Point | ObservablePoint): Unit = js.native
  def set(x: Double, y: Double): Unit = js.native
}
