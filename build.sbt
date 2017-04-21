name := "scalajs-pixijs"
organization := "com.outr"
version := "4.5.0"

scalaVersion := "2.12.1"
crossScalaVersions := List("2.12.1", "2.11.8")

enablePlugins(ScalaJSPlugin)
enablePlugins(BuildInfoPlugin)

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)
buildInfoPackage := "com.outr.pixijs"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

crossTarget in fastOptJS := baseDirectory.value / "src" / "main" / "resources" / "app"
crossTarget in fullOptJS := baseDirectory.value / "src" / "main" / "resources" / "app"