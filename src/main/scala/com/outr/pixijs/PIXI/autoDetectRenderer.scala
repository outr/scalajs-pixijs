package com.outr.pixijs.PIXI

import com.outr.pixijs.RendererOptions

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
@JSGlobal("PIXI")
object autoDetectRenderer extends js.Object {
  @JSName("autoDetectRenderer")
  def apply(width: Int,
            height: Int,
            options: RendererOptions = js.native,
            noWebGL: Boolean = js.native): SystemRenderer = js.native
}
