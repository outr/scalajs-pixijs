package com.outr.pixijs.examples

import com.outr.pixijs._
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object ContainerPivot {
  @JSExportTopLevel("containerPivot")
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(new RendererOptions {
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

    // move container to the (200, 150)
    container.position.x = 200
    container.position.y = 150
    // (93, 98.5) is center of center bunny sprite in local container coordinates
    // we want it to be in (200, 150) of global coords
    container.pivot.x = 80 + 26 * 0.5
    container.pivot.y = 80 + 37 * 0.5

    def animate(): Unit = {
      window.requestAnimationFrame((_: Double) => animate())

      container.rotation -= 0.01

      renderer.render(stage)
    }

    animate()
  }
}
/*
var renderer = PIXI.autoDetectRenderer(800, 600,{backgroundColor : 0x1099bb});
document.body.appendChild(renderer.view);

// create the root of the scene graph
var stage = new PIXI.Container();

var container = new PIXI.Container();

stage.addChild(container);

for (var j = 0; j < 5; j++) {

    for (var i = 0; i < 5; i++) {
        var bunny = PIXI.Sprite.fromImage('required/assets/basics/bunny.png');
        bunny.x = 40 * i;
        bunny.y = 40 * j;
        container.addChild(bunny);
    };
};

// move container to the (200, 150)
container.position.x = 200;
container.position.y = 150;
// (93, 98.5) is center of center bunny sprite in local container coordinates
// we want it to be in (200, 150) of global coords
container.pivot.x = 80 + 26 * 0.5;
container.pivot.y = 80 + 37 * 0.5;
 */