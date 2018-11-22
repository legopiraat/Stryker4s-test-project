package test.deep

import org.scalatest.{FunSuite, Matchers}

class MarvelTest extends FunSuite with Matchers {
  test("When getting all the badGuys there should be 2") {
    Marvel.getAllbadGuys().size shouldBe 2
  }
}

