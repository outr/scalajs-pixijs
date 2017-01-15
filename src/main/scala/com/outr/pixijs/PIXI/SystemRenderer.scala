package com.outr.pixijs.PIXI

import org.scalajs.dom.html

import scala.scalajs.js

@js.native
class SystemRenderer extends js.Object {
  def view: html.Canvas = js.native

  def render(container: Container): Unit = js.native
}
