package com.outr.pixijs.PIXI

import com.outr.pixijs.RendererOptions

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
@JSGlobal("PIXI")
object autoDetectRenderer extends js.Object {
  @JSName("autoDetectRenderer")
  def apply(options: RendererOptions): SystemRenderer = js.native
}
