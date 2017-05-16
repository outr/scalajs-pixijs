package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.WebGLManager")
class WebGLManager(val renderer: WebGLRenderer) extends js.Object {
  def destroy(): Unit = js.native
  def onContextChange(): Unit = js.native
}