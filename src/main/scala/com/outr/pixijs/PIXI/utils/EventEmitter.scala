package com.outr.pixijs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("PIXI.utils.EventEmitter")
class EventEmitter extends js.Object {
  def listeners(event: String): js.Array[js.Function] = js.native

  def emit(event: String, args: js.Any*): Boolean = js.native

  def on(event: String, fn: js.Function, context: js.Any = js.native): EventEmitter = js.native

  def once(event: String, fn: js.Function, context: js.Any = js.native): EventEmitter = js.native

  def removeListener(event: String, fn: js.Function, context: js.Any = js.native, once: Boolean = js.native): EventEmitter = js.native

  def removeAllListeners(event: String): EventEmitter = js.native

  def off(event: String, fn: js.Function, context: js.Any = js.native, once: Boolean = js.native): EventEmitter = js.native

  def addListener(event: String, fn: js.Function, context: js.Any = js.native): EventEmitter = js.native
}