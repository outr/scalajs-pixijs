package com.outr.pixijs.PIXI

import com.outr.pixijs.PIXI.interaction.InteractiveTarget
import com.outr.pixijs.PIXI.utils.EventEmitter

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.DisplayObject")
class DisplayObject extends EventEmitter with InteractiveTarget {
  var alpha: Double = js.native
  var cacheAsBitmap: Boolean = js.native
  var cursor: String = js.native
  var filterArea: Rectangle = js.native
  var filters: Array[Filter] = js.native
  def localTransform: Matrix = js.native
  var mask: Graphics | Sprite = js.native
  def parent: Container = js.native
  var pivot: Point = js.native
  var position: Point = js.native
  var renderable: Boolean = js.native
  var rotation: Double = js.native
  var scale: Point = js.native
  var skew: ObservablePoint = js.native
  var transform: TransformBase = js.native
  var visible: Boolean = js.native
  def worldAlpha: Double = js.native
  def worldTransform: Matrix = js.native
  def worldVisible: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native

  def _recursivePostUpdateTransform(): Unit = js.native
  def destroy(): Unit = js.native
  def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
  def getLocalBounds(rect: Rectangle): Rectangle = js.native
  def renderCanvas(renderer: CanvasRenderer): Unit = js.native
  def renderWebGL(renderer: WebGLRenderer): Unit = js.native
  def setParent(container: Container): Container = js.native
  def setTransform(x: Double = js.native,
                   y: Double = js.native,
                   scaleX: Double = js.native,
                   scaleY: Double = js.native,
                   rotation: Double = js.native,
                   skewX: Double = js.native,
                   skewY: Double = js.native,
                   pivotX: Double = js.native,
                   pivotY: Double = js.native): DisplayObject = js.native
  def toGlobal(position: Point, point: Point, skipUpdate: Boolean = js.native): Point = js.native
  def toLocal(position: Point, from: DisplayObject, point: Point, skipUpdate: Boolean = js.native): Point = js.native
  def updateTransform(): Unit = js.native
}