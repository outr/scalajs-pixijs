package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.typedarray.Float32Array
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.Matrix")
class Matrix extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  def append(matrix: Matrix): Matrix = js.native
  def apply(pos: Point, newPos: Point): Point = js.native
  def applyInverse(pos: Point, newPos: Point): Point = js.native
  def copy(matrix: Matrix): Matrix = js.native
  def decompose(transform: Transform | TransformStatic): Transform | TransformStatic = js.native
  def fromArray(array: Array[Double]): Matrix = js.native
  def identity(): Matrix = js.native
  def invert(): Matrix = js.native
  def prepend(matrix: Matrix): Matrix = js.native
  def rotate(angle: Double): Matrix = js.native
  def scale(x: Double, y: Double): Matrix = js.native
  def set(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix = js.native
  def setTransform(x: Double, y: Double, pivotX: Double, pivotY: Double, scaleX: Double, scaleY: Double, rotation: Double, skewX: Double, skewY: Double): Matrix = js.native
  def toArray(transpose: Boolean, out: Float32Array): Array[Double] = js.native
  def translate(x: Double, y: Double): Matrix = js.native
}

@js.native
@JSGlobal("PIXI.Matrix")
object Matrix extends js.Object {
  def IDENTITY: Matrix = js.native
  def TEMP_MATRIX: Matrix = js.native
}