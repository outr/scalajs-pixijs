name := "scalajs-pixijs"
organization := "com.outr"
version := "4.5.3-SNAPSHOT"

scalaVersion := "2.12.2"
crossScalaVersions := List("2.12.2", "2.11.11")

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"

jsDependencies += ProvidedJS / "pixi.js"
skip in packageJSDependencies := false