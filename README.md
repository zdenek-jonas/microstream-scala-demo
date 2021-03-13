# Microstream Scala Sample Integration 

The aim of this mini project is to show the simple integration of Microstream technology in the scala programming language.

This project is built by sbt: https://www.scala-sbt.org/

### SBT and Microstream Repo integration

Into build.sbt file we have to add two lines of code:

As first microstream repo:

`resolvers += "microstream-repo" at "https://repo.microstream.one/repository/maven-releases/`

and second one microstream dependency:

`libraryDependencies += "one.microstream" % "storage.embedded" % "04.01.00-MS-GA"`

## Launch Project
`sbt run`
