organization := "org.scalablytyped"
name := "react-apollo"
version := "3.1.3-64ab61"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-fa0799",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-ceed8b",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-824d3c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-22daf5",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-f227fc",
  "org.scalablytyped" %%% "apollo__react-components" % "3.1.3-bffb98",
  "org.scalablytyped" %%% "apollo__react-hoc" % "3.1.3-a81293",
  "org.scalablytyped" %%% "apollo__react-hooks" % "3.1.3-3d9bba",
  "org.scalablytyped" %%% "apollo__react-ssr" % "3.1.3-553f38",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200225Z-6417d3",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-09c27c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
