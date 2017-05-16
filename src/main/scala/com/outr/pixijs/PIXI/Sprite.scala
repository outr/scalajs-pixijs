package com.outr.pixijs.PIXI

import org.scalajs.dom.raw.{HTMLCanvasElement, HTMLVideoElement}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.Sprite")
class Sprite(_texture: Texture) extends Container {
  var anchor: Anchor = js.native
  var blendMode: Double = js.native
  var pluginName: String = js.native
  var shader: Filter = js.native
  var tint: Double = js.native
  var texture: Texture = js.native
}

@js.native
@JSGlobal("PIXI.Sprite")
object Sprite extends js.Object {
  def from(source: Double | String | BaseTexture | HTMLCanvasElement | HTMLVideoElement): Texture = js.native
  def fromFrame(frameId: String): Sprite = js.native
  def fromImage(imageId: String,
                crossorigin: Boolean = js.native,
                scaleMode: Double = js.native): Sprite = js.native
}