package com.outr.pixijs.examples

import com.outr.pixijs._
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object Basics {
  @JSExportTopLevel("basics")
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(new RendererOptions {
      backgroundColor = 0x1099bb
    })
    document.body.appendChild(renderer.view)

    val stage = new PIXI.Container()
    val texture = PIXI.Texture.fromImage("bunny.png")
    val bunny = new PIXI.Sprite(texture) {
      anchor.x = 0.5
      anchor.y = 0.5
      position.x = 200
      position.y = 150
    }
    stage.addChild(bunny)

    def animate(): Unit = {
      window.requestAnimationFrame((_: Double) => animate())

      bunny.rotation += 0.1

      renderer.render(stage)
    }

    animate()
  }
}