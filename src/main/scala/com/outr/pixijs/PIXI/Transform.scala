package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Transform")
class Transform extends TransformBase {
  var pivot: Point = js.native
  var position: Point = js.native
  var rotation: Double = js.native
  var scale: Point = js.native
  var skew: ObservablePoint = js.native
  def setFromMatrix(matrix: Matrix): Unit = js.native
}