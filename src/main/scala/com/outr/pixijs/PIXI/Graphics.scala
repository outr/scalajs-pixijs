package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.Graphics")
class Graphics extends Container {
  var blendMode: Double = js.native
  var boundsPadding: Double = js.native
  var fillAlpha: Double = js.native
  def isMask: Boolean = js.native
  var lineColor: String = js.native
  var lineWidth: Double = js.native
  var tint: Double = js.native

  def addHole(): Graphics = js.native
  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean = js.native): Graphics = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginFill(color: Double = js.native, alpha: Double = js.native): Graphics = js.native
  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native
  def clear(): Graphics = js.native
  def closePath(): Graphics = js.native
  def containsPoint(point: Point): Boolean = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawPolygon(path: Array[Double] | Array[Point]): Graphics = js.native
  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def drawShape(shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle): Graphics = js.native
  def endFill(): Graphics = js.native
  def generateCanvasTexture(scaleMode: Double, resolution: Double = js.native): Texture = js.native
  def isFastRect(): Boolean = js.native
  def lineStyle(lineWidth: Double = js.native, color: Double = js.native, alpha: Double = js.native): Graphics = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native
}
