name := "example01"

version := "0.1"

scalaVersion := "2.13.5"

idePackagePrefix := Some("one.microstream.scala")

resolvers += "microstream-repo" at "https://repo.microstream.one/repository/maven-releases/"

libraryDependencies += "one.microstream" % "storage.embedded" % "04.01.00-MS-GA"