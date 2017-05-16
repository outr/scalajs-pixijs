package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.Rectangle")
class Rectangle(var x: Double = js.native,
                var y: Double = js.native,
                var width: Double = js.native,
                var height: Double = js.native) extends js.Object {
  def bottom: Double = js.native
  def left: Double = js.native
  def right: Double = js.native
  def top: Double = js.native
  def `type`: Double = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def copy(rectangle: Rectangle): Rectangle = js.native
  def enlarge(rectangle: Rectangle): Unit = js.native
  def fit(rectangle: Rectangle): Unit = js.native
  def pad(paddingX: Double, paddingY: Double): Unit = js.native
}

@js.native
@JSGlobal("PIXI.Rectangle")
object Rectangle extends js.Object {
  def EMPTY: Rectangle = js.native
}