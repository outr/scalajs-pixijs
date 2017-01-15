name := "scalajs-pixijs"
organization := "com.outr"
version := "4.3.2"

scalaVersion := "2.12.1"
sbtVersion := "0.13.13"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

crossTarget in fastOptJS := baseDirectory.value / "src" / "main" / "resources" / "app"
crossTarget in fullOptJS := baseDirectory.value / "src" / "main" / "resources" / "app"