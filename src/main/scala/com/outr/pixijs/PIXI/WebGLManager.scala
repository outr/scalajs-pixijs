package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.WebGLManager")
class WebGLManager(val renderer: WebGLRenderer) extends js.Object {
  def destroy(): Unit = js.native
  def onContextChange(): Unit = js.native
}