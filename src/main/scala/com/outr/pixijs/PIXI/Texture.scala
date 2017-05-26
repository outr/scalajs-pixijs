package com.outr.pixijs.PIXI

import com.outr.pixijs.PIXI.utils.EventEmitter
import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js._

@js.native
@JSGlobal("PIXI.Texture")
object Texture extends js.Object {
  def EMPTY: Texture = js.native
  def WHITE: Texture = js.native

  def from(source: Double | String | html.Element | html.Canvas | html.Video | BaseTexture): Texture = js.native
  def fromCanvas(canvas: html.Canvas, scaleMode: Double = js.native, origin: String = js.native): Texture = js.native
  def fromFrame(frameId: String): Texture = js.native
  def fromImage(url: String,
                crossorigin: Boolean = js.native,
                scaleMode: Double = js.native,
                sourceScale: Double = js.native): Texture = js.native
  def fromLoader(source: html.Image | html.Canvas, imageUrl: String, name: String = js.native): Texture = js.native
  def fromVideo(video: html.Video | String, scaleMode: Double = js.native): Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double = js.native): Texture = js.native
  def addToCache(texture: Texture, id: String): Unit = js.native
  def removeFromCache(id: String): Texture = js.native
}

@js.native
@JSGlobal("PIXI.Texture")
class Texture(var baseTexture: BaseTexture,
              var frame: Rectangle = js.native,
              var orig: Rectangle = js.native,
              var trim: Rectangle = js.native,
              var rotate: Double = js.native) extends EventEmitter {
  var _frame: Rectangle = js.native
  var height: Double = js.native
  var noFrame: Boolean = js.native
  var requiresUpdate: Boolean = js.native
  var valid: Boolean = js.native
  var width: Double = js.native

  def update(): Unit = js.native
  def destroy(destroyBase: Boolean = js.native): Unit = js.native
}