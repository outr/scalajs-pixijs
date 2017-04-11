package com.outr.pixijs.PIXI.interaction

import com.outr.pixijs._
import org.scalajs.dom.raw.{MouseEvent, TouchEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
@JSName("PIXI.interaction.InteractionData")
class InteractionData extends js.Object {
  def global: PIXI.Point = js.native
  def identifier: String = js.native
  def originalEvent: MouseEvent | TouchEvent = js.native
  def target: PIXI.DisplayObject = js.native
  def getLocalPosition(displayObject: PIXI.DisplayObject,
                       point: PIXI.Point = js.native,
                       globalPos: PIXI.Point = js.native): PIXI.Point = js.native
}