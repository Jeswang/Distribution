organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-285806"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "pino" % "5.17-dt-20200309Z-2bdc5c",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-c78590",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-8aed30",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
