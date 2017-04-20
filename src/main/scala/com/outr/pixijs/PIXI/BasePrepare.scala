package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait BasePrepare extends js.Any {
  def add(item: DisplayObject | Container | BaseTexture | Texture | Graphics | Text): BasePrepare = js.native
  def destroy(): Unit = js.native
  def registerFindHook(addHook: js.Function2[Any, js.Array[Any], Boolean]): BasePrepare = js.native
  def registerUploadHook(uploadHook: js.Function2[BasePrepare, Any, Boolean]): BasePrepare = js.native
  def upload(item: js.Function | DisplayObject | Container | BaseTexture | Texture | Graphics | Text,
             done: js.Function = js.native): Unit = js.native
}