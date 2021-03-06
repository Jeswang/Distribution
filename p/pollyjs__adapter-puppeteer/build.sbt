organization := "org.scalablytyped"
name := "pollyjs__adapter-puppeteer"
version := "4.0-dt-20200128Z-936664"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "3.0-dt-20200225Z-6aaaab",
  "org.scalablytyped" %%% "pollyjs__core" % "4.0-dt-20200125Z-177346",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20200225Z-d40be4",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
