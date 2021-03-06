// Artifact fetching
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14-7")

// Assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

// Maven deploy
addSbtPlugin("no.arktekk.sbt" % "aether-deploy" % "0.17")

// Hot reloading
addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")

// Native packer
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")
