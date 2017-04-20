package com.outr.pixijs.PIXI

import com.outr.pixijs.PIXI.interaction.InteractionManager

import scala.scalajs.js

@js.native
trait Plugins extends js.Any {
  def extract: Extract = js.native
  def interaction: InteractionManager = js.native
  def prepare: BasePrepare = js.native
}