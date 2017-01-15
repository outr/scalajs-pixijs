package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI")
object autoDetectRenderer extends js.Object {
  @JSName("autoDetectRenderer")
  def apply(width: Int,
            height: Int,
            options: RendererOptions = js.native,
            noWebGL: Boolean = js.native): SystemRenderer = js.native
}
