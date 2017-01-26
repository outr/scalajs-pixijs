package com.outr.pixijs.PIXI.interaction

import com.outr.pixijs.PIXI.HitArea

import scala.scalajs.js

@js.native
trait InteractiveTarget extends js.Object {
  var interactive: Boolean = js.native
  var buttonMode: Boolean = js.native
  var interactiveChildren: Boolean = js.native
  var defaultCursor: String = js.native
  var hitArea: HitArea = js.native
}