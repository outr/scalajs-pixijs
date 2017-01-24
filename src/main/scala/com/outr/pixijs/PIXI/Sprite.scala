package com.outr.pixijs.PIXI

import com.outr.pixijs.{PIXI, Texture}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.Sprite")
class Sprite(texture: Texture) extends Container {
  def anchor: Anchor = js.native
}

@js.native
@JSName("PIXI.Sprite")
object Sprite extends js.Object {
  def fromImage(imageId: String,
                crossorigin: Boolean = js.native,
                scaleMode: Double = js.native): Sprite = js.native
}