package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.Filter")
class Filter(vertexSrc: String = js.native,
             fragmentSrc: String = js.native,
             uniforms: js.Object = js.native) extends js.Object {
  def apply(filterManager: FilterManager,
            input: RenderTarget,
            output: RenderTarget,
            clear: Boolean): Unit = js.native
}

@js.native
@JSName("PIXI.Filter")
object Filter extends js.Object {
  def defaultFragmentSrc: String = js.native
  def defaultVertexSrc: String = js.native
}