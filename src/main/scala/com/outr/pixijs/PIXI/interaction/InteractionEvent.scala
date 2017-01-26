package com.outr.pixijs.PIXI.interaction

import com.outr.pixijs.PIXI.DisplayObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.interaction.InteractionEvent")
class InteractionEvent extends js.Object {
  def currentTarget: DisplayObject = js.native
  def stopped: Boolean = js.native
  def target: DisplayObject = js.native
  def stopPropagation(): Unit = js.native
}