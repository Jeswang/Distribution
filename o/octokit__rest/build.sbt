organization := "org.scalablytyped"
name := "octokit__rest"
version := "17.1.1-ad91b0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-969f34",
  "org.scalablytyped" %%% "octokit__core" % "2.4.2-2c8d59",
  "org.scalablytyped" %%% "octokit__graphql" % "4.3.1-bdb43c",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "2.0.2-1057ba",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "3.3.1-491e9c",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
