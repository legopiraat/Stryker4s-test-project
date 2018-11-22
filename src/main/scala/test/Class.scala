package test

object Class {

 // val data = List("person1", "person2", "person3", "Henk", "Frank")
  val data = List("person1")
  val numbers = List(1, 2, 3, 4)

  def find(name: String): Option[String] = {
    data.find(_.equals(name))
  }

  def nameStartWith(prefix: String): List[String] = {
    data.filter(_.startsWith(prefix))
  }

  def empty: Boolean = {
    data.isEmpty
  }

  def min: Int = {
    numbers.min
  }

  def primitivePatternMatch(): String = {
    val primitive = "a"

    "a" match {
      case "b" => "c"
      case "a" => "d"
    }
  }

  def calculate(a: Int, b: Int): Int = {
    a + b
  }
}
