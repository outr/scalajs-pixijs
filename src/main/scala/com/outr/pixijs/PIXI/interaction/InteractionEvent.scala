package com.outr.pixijs.PIXI.interaction

import com.outr.pixijs.PIXI.DisplayObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.interaction.InteractionEvent")
class InteractionEvent extends js.Object {
  def currentTarget: DisplayObject = js.native
  def stopped: Boolean = js.native
  def target: DisplayObject = js.native
  def `type`: String = js.native
  def data: InteractionData = js.native
  def stopPropagation(): Unit = js.native
}