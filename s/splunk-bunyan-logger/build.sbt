organization := "org.scalablytyped"
name := "splunk-bunyan-logger"
version := "0.9-dt-20180705Z-48dfe3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-746b2c",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "form-data" % "3.0.0-78808a",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-22ec1f",
  "org.scalablytyped" %%% "splunk-logging" % "0.9-dt-20180705Z-48fcc5",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-a3036c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
