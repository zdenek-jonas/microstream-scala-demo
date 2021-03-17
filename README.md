# Microstream Scala Sample Integration 

The aim of this mini project is to show the simple integration of Microstream technology in the scala programming 
language and show how to easy build an Native GraalVM image with sbt.

This project is built by sbt: https://www.scala-sbt.org/

### SBT and Microstream Repo integration

Into build.sbt file we have to add two lines of code:

As first microstream repo:

`resolvers += "microstream-repo" at "https://repo.microstream.one/repository/maven-releases/`

and second one microstream dependency:

`libraryDependencies += "one.microstream" % "storage.embedded" % "04.01.00-MS-GA"`

### SBT, Microstream and GraalVM Native Image
first add plugin into `project/plugins.sbt`

```addSbtPlugin("org.scalameta" % "sbt-native-image" % "0.2.2")```

and than allow plugin in `build.sbt` file:

```enablePlugins(NativeImagePlugin)```

## Launch Project
`sbt run`

## Create native Image
`sbt nativeImage`