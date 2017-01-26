package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
@JSName("PIXI.Polygon")
class Polygon(var points: Array[Point] | Array[Double]) extends js.Object {
  def `type`: Double = js.native

  def close(): Unit = js.native
  def contains(x: Double, y: Double): Boolean = js.native
}