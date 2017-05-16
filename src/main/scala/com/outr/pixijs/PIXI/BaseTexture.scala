package com.outr.pixijs.PIXI

import org.scalajs.dom.raw.{HTMLCanvasElement, HTMLImageElement}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.BaseTexture")
class BaseTexture(val source: HTMLImageElement | HTMLCanvasElement = js.native,
                  var scaleMode: Double = js.native,
                  var resolution: Double = js.native) extends js.Object {
  def hasLoaded: Boolean = js.native
  def height: Double = js.native
  def imageType: String = js.native
  var imageUrl: String = js.native
  def isLoading: Boolean = js.native
  var mipmap: Boolean = js.native
  def origSource: HTMLImageElement = js.native
  var premultipliedAlpha: Double = js.native
  def realHeight: Double = js.native
  def realWidth: Double = js.native
  def sourceScale: Double = js.native
  def width: Double = js.native
  var wrapMode: Double = js.native

  def _loadSvgSource(): Unit = js.native
  def _loadSvgSourceUsingDataUri(dataUri: String): Unit = js.native
  def _loadSvgSourceUsingString(svgString: String): Unit = js.native
  def _loadSvgSourceUsingXhr(): Unit = js.native
  def _updateImageType(): Unit = js.native
  def destroy(): Unit = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
  def updateSourceImage(newSrc: String): Unit = js.native
}

@js.native
@JSGlobal("PIXI.BaseTexture")
object BaseTexture extends js.Object {
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double): BaseTexture = js.native
  def fromImage(imageUrl: String,
                crossOrigin: Boolean = js.native,
                scaleMode: Double = js.native,
                sourceScale: Double = js.native): BaseTexture = js.native
}