organization := "org.scalablytyped"
name := "web3"
version := "1.2.6-1df8cd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20200225Z-19e165",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "web3-bzz" % "1.2.6-41f7ca",
  "org.scalablytyped" %%% "web3-core" % "1.2.6-36e76b",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.6-112028",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.6-3b9221",
  "org.scalablytyped" %%% "web3-core-subscriptions" % "1.2.6-adb452",
  "org.scalablytyped" %%% "web3-eth" % "1.2.6-4b4fc6",
  "org.scalablytyped" %%% "web3-eth-abi" % "1.2.6-d621bc",
  "org.scalablytyped" %%% "web3-eth-accounts" % "1.2.6-985023",
  "org.scalablytyped" %%% "web3-eth-contract" % "1.2.6-7cba28",
  "org.scalablytyped" %%% "web3-eth-ens" % "1.2.6-832305",
  "org.scalablytyped" %%% "web3-eth-iban" % "1.2.6-c211a5",
  "org.scalablytyped" %%% "web3-eth-personal" % "1.2.6-435368",
  "org.scalablytyped" %%% "web3-net" % "1.2.6-21cbe0",
  "org.scalablytyped" %%% "web3-shh" % "1.2.6-95f347",
  "org.scalablytyped" %%% "web3-utils" % "1.2.6-d63160")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
