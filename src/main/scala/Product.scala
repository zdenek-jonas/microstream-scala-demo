package one.microstream.scala

import one.microstream.storage.types.{EmbeddedStorage, EmbeddedStorageManager}

object Product extends App {

  var school = new School();
  school.generateTeachers();

  val storage = EmbeddedStorage.start(school);
  storage.shutdown();

  var school2 = new School();
  val storage2 = EmbeddedStorage.start(school2);

  println(school2.teachers.size);
  storage2.shutdown();
}

