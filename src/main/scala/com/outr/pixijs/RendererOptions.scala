package com.outr.pixijs

import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait RendererOptions extends js.Object {
  var width: js.UndefOr[Int] = js.undefined
  var height: js.UndefOr[Int] = js.undefined
  var view: js.UndefOr[html.Canvas] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var antialias: js.UndefOr[Boolean] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var forceCanvas: js.UndefOr[Boolean] = js.undefined

  var autoResize: js.UndefOr[Boolean] = js.undefined
  var forceFXAA: js.UndefOr[Boolean] = js.undefined
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[Int] = js.undefined
  var roundPixels: js.UndefOr[Boolean] = js.undefined
}
