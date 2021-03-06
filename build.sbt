name := """scala-play-todo"""
organization := "info.diendannhatban"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "info.diendannhatban.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "info.diendannhatban.binders._"

// evolution
libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.4"
libraryDependencies += "com.h2database" % "h2" % "1.4.196"