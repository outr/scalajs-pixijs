package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.RenderTexture")
class RenderTexture(baseRenderTexture: BaseRenderTexture, frame: Rectangle) extends Texture

@js.native
@JSName("PIXI.RenderTexture")
object RenderTexture extends js.Object {
  def create(width: Double = js.native,
             height: Double = js.native,
             scaleMode: Double = js.native,
             resolution: Double = js.native): RenderTexture = js.native
}