package one.microstream.scala

import scala.collection.mutable.ArrayBuffer

class School {

  val teachers = ArrayBuffer[Person]()


  def generateTeachers(): Unit = {
    teachers.addOne(new Person("Karel", "May"))
    teachers.addOne(new Person("John", "Smith"))
    teachers.addOne(new Person("Lukas", "King"))
  }
}
