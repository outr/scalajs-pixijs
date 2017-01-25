package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.TransformBase")
class TransformBase extends js.Object {
  def localTransform: Matrix = js.native
  def worldTransform: Matrix = js.native
  def updateWorldTransform(): Unit = js.native
  def updateLocalTransform(): Unit = js.native
  def updateTransform(parentTransform: TransformBase): Unit = js.native
}