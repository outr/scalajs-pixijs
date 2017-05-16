package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.TransformStatic")
class TransformStatic extends js.Object {
  var localTransform: Matrix = js.native
  var pivot: ObservablePoint = js.native
  var position: ObservablePoint = js.native
  var rotation: Double = js.native
  var scale: ObservablePoint = js.native
  var skew: ObservablePoint = js.native
  var worldTransform: Matrix = js.native

  def updateWorldTransform(): Unit = js.native
  def setFromMatrix(matrix: Matrix): Unit = js.native
  def updateLocalTransform(): Unit = js.native
  def updateTransform(parentTransform: Transform): Unit = js.native
}