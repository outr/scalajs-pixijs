package com.outr.pixijs.PIXI

import scala.scalajs._
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.Container")
class Container extends DisplayObject {
  var width: Double = js.native
  var height: Double = js.native
  def children: Array[DisplayObject] = js.native

  def _calculateBounds(): Unit = js.native
  def addChild(child: DisplayObject): Unit = js.native
  def addChildAt(child: DisplayObject, index: Int): DisplayObject = js.native
  def calculateBounds(): Unit = js.native
  def destroy(options: js.Object | Boolean): Unit = js.native
  def getChildAt(index: Int): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): Int = js.native
  def removeChild(child: DisplayObject): DisplayObject = js.native
  def removeChildAt(index: Int): DisplayObject = js.native
  def removeChildren(beginIndex: Int = js.native, endIndex: Int = js.native): Array[DisplayObject] = js.native
  def setChildIndex(child: DisplayObject, index: Int): Unit = js.native
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}

