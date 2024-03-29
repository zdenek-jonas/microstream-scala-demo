enablePlugins(NativeImagePlugin)

name := "microstream-scala-example"

version := "0.1"

scalaVersion := "2.13.5"

mainClass in (Compile, run) := Some("one.microstream.scala.Product")

resolvers += "microstream-repo" at "https://repo.microstream.one/repository/maven-releases/"

libraryDependencies += "one.microstream" % "storage.embedded" % "04.01.00-MS-GA"

