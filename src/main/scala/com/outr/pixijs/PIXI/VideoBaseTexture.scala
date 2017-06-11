package com.outr.pixijs.PIXI

import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.VideoBaseTexture")
class VideoBaseTexture(source: html.Video = js.native,
                       scaleMode: Double = js.native) extends BaseTexture {
  var autoPlay: Boolean = js.native
  var autoUpdate: Boolean = js.native
}

@js.native
@JSGlobal("PIXI.VideoBaseTexture")
object VideoBaseTexture extends js.Object {
  def fromUrl(videoSrc: String | js.Object | js.Array[String] | js.Array[js.Object], scaleMode: Double = js.native): VideoBaseTexture = js.native
  def fromVideo(video: html.Video, scaleMode: Double = js.native): VideoBaseTexture = js.native
}