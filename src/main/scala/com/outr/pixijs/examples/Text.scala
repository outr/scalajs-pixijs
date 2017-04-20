package com.outr.pixijs.examples

import com.outr.pixijs.PIXI.StyleOptions
import com.outr.pixijs._
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object Text {
  @JSExportTopLevel("text")
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(800, 600, new RendererOptions {
      backgroundColor = 0x1099bb
    })
    document.body.appendChild(renderer.view)

    val stage = new PIXI.Container()

    val basicText = new PIXI.Text("Basic text in pixi")
    basicText.x = 30
    basicText.y = 90

    stage.addChild(basicText)

    val style = new StyleOptions {
      fontFamily = "Arial"
      fontSize = "36px"
      fontStyle = "italic"
      fontWeight = "bold"
      fill = "#F7EDCA"
      stroke = "#4A1850"
      strokeThickness = 5.0
      dropShadow = true
      dropShadowColor = "#000000"
      dropShadowAngle = math.Pi / 6.0
      dropShadowDistance = 6.0
      wordWrap = true
      wordWrapWidth = 440.0
    }

    val richText = new PIXI.Text("Rich text with a lot of options and across multiple lines", new PIXI.TextStyle(style))
    richText.x = 30
    richText.y = 180

    stage.addChild(richText)

    def animate(): Unit = {
      window.requestAnimationFrame((_: Double) => animate())

      renderer.render(stage)
    }

    animate()
  }
}