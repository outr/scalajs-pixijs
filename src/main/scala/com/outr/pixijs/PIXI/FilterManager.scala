package com.outr.pixijs.PIXI

import org.scalajs.dom.raw.WebGLShader

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.FilterManager")
class FilterManager(renderer: WebGLRenderer) extends WebGLManager(renderer) {
  def applyFilter(filter: Filter,
                  input: RenderTarget,
                  output: RenderTarget,
                  clear: Boolean): Unit = js.native

  def calculateNormalizedScreenSpaceMatrix(outputMatrix: Matrix): Matrix = js.native

  def calculateScreenSpaceMatrix(outputMatrix: Matrix): Matrix = js.native

  def calculateSpriteMatrix(outputMatrix: Matrix,
                            sprite: Sprite): Matrix = js.native

  def emptyPool(): Unit = js.native

  def freePotRenderTarget(renderTarget: RenderTarget): Unit = js.native

  def getRenderTarget(clear: Boolean, resolution: Double): RenderTarget = js.native

  def popFilter(): Unit = js.native

  def pushFilter(target: DisplayObject, filters: Array[Filter]): Unit = js.native

  def returnRenderTarget(renderTarget: RenderTarget): Unit = js.native

  def syncUniforms(shader: WebGLShader, filter: Filter): Unit = js.native
}