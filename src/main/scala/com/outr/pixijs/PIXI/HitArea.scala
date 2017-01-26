package com.outr.pixijs.PIXI

import scala.scalajs.js

@js.native
trait HitArea extends js.Object {
  def contains(x: Double, y: Double): Boolean = js.native
}