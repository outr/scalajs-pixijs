package com.outr.pixijs.examples

import com.outr.pixijs.PIXI.interaction.InteractionEvent
import com.outr.pixijs._
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object Click {
  @JSExportTopLevel("click")
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(800, 600, new RendererOptions {
      backgroundColor = 0x1099bb
    })
    document.body.appendChild(renderer.view)

    val stage = new PIXI.Container()

    val sprite = PIXI.Sprite.fromImage("bunny.png")

    val onDown = (evt: InteractionEvent) => {
      sprite.scale.x += 0.3
      sprite.scale.y += 0.3
    }

    sprite.position.set(230, 264)
    sprite.interactive = true
    sprite.on("mousedown", onDown)
    sprite.on("touchstart", onDown)

    stage.addChild(sprite)

    def animate(): Unit = {
      window.requestAnimationFrame((_: Double) => animate())

      renderer.render(stage)
    }

    animate()
  }
}