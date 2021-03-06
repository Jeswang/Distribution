organization := "org.scalablytyped"
name := "vega-themes"
version := "2.3.2-21fbda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-9486ca",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "vega-lite" % "2.7.0-aeb2de",
  "org.scalablytyped" %%% "vega-typings" % "0.7.1-e88933",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-8e79a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        