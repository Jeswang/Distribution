organization := "org.scalablytyped"
name := "favicons-webpack-plugin"
version := "1.0-dt-20191001Z-e44561"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200226Z-350876",
  "org.scalablytyped" %%% "favicons" % "5.5-dt-20200226Z-5ee59b",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20200226Z-cfabd4",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-51a887",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200227Z-1f7c6a",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20200225Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200320Z-b7aa26",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200225Z-fed209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
