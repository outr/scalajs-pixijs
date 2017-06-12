package com.outr.pixijs.PIXI.interaction

import com.outr.pixijs._
import org.scalajs.dom.raw.{MouseEvent, TouchEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("PIXI.interaction.InteractionData")
class InteractionData extends js.Object {
  def global: PIXI.Point = js.native
  def identifier: String | Int = js.native
  def originalEvent: MouseEvent | TouchEvent = js.native
  def target: PIXI.DisplayObject = js.native
  def getLocalPosition(displayObject: PIXI.DisplayObject,
                       point: PIXI.Point = js.native,
                       globalPos: PIXI.Point = js.native): PIXI.Point = js.native
}