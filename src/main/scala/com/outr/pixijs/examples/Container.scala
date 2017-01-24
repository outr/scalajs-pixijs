package com.outr.pixijs.examples

import com.outr.pixijs._
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object Container {
  @JSExportTopLevel("container")
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(800, 600, new RendererOptions {
      backgroundColor = 0x1099bb
    })
    document.body.appendChild(renderer.view)

    // create the root of the scene graph
    val stage = new PIXI.Container()

    val container = new PIXI.Container()

    stage.addChild(container)

    (0 until 5).foreach { x =>
      (0 until 5).foreach { y =>
        val bunny = PIXI.Sprite.fromImage("bunny.png")
        bunny.x = 40 * x
        bunny.y = 40 * y
        container.addChild(bunny)
      }
    }

    /*
     * All the bunnies are added to the container with the addChild method
     * when you do this, all the bunnies become children of the container, and when a container moves,
     * so do all its children.
     * This gives you a lot of flexibility and makes it easier to position elements on the screen
     */
    container.x = 100
    container.y = 60


    def animate(): Unit = {
      window.requestAnimationFrame((_: Double) => animate())

      renderer.render(stage)
    }

    animate()
  }
}