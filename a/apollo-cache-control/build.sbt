organization := "org.scalablytyped"
name := "apollo-cache-control"
version := "0.9.0-0cd192"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-70c1d0",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-8cb469",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-8c5447",
  "org.scalablytyped" %%% "apollo-server-types" % "0.3.0-fbba4b",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-42037c",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "graphql-extensions" % "0.11.0-bc5172",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200226Z-abc547",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
