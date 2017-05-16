package com.outr.pixijs.PIXI.interaction

import com.outr.pixijs.PIXI._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.interaction.InteractionManager")
class InteractionManager(val renderer: CanvasRenderer | WebGLRenderer,
                         options: js.Object) extends js.Object {
  var autoPreventDefault: Boolean = js.native
  var currentCursorMode: String = js.native
  var cursorStyles: js.Object = js.native
  var eventData: js.Object = js.native
  var interactionFrequency: Double = js.native
  def mouse: InteractionData = js.native
  var moveWhenInside: Boolean = js.native
  var resolution: Double = js.native
  def supportsPointerEvents: Boolean = js.native
  def supportsTouchEvents: Boolean = js.native
  def destroy(): Unit = js.native
  def hitTest(globalPoint: Point, root: Container = js.native): DisplayObject = js.native
  def mapPositionToPoint(point: Point, x: Double, y: Double): Unit = js.native
  def setCursorMode(mode: String): Unit = js.native
  def update(deltaTime: Double): Unit = js.native
}