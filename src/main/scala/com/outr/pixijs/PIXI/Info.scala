package com.outr.pixijs.PIXI

import com.outr.pixijs.BuildInfo

object Info {
  def version: String = BuildInfo.version.takeWhile(_ != '-')
  def cdn: String = s"https://cdnjs.cloudflare.com/ajax/libs/pixi.js/$version/pixi.min.js"
}