package test.deep

object Marvel {
    case class Character(name: String, badGuy: Boolean)

    private val marvelCharaters: List[Character] = List(
        Character("Iron man", false),
        Character("Spiderman", false),
        Character("Thanos", true),
        Character("Ultron", true))

    def getAllbadGuys(): List[Character] = {
        marvelCharaters.filter(_.badGuy)
    }
}