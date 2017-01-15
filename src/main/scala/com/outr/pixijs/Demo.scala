package com.outr.pixijs

import com.outr.pixijs.PIXI.{RendererOptions, Texture}

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom._

object Demo {
  @JSExportTopLevel("demo")
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(800, 600, new RendererOptions {
      backgroundColor = 0x1099bb
    }, noWebGL = true)
    document.body.appendChild(renderer.view)

    val stage = new PIXI.Container()
    val texture = Texture.fromImage("bunny.png")
    val bunny = new PIXI.Sprite(texture)
    bunny.anchor.x = 0.5
    bunny.anchor.y = 0.5
    bunny.position.x = 200
    bunny.position.y = 150
    stage.addChild(bunny)

    def animate(): Unit = {
      window.requestAnimationFrame((_: Double) => animate())

      bunny.rotation += 0.1

      renderer.render(stage)
    }

    animate()
  }
}