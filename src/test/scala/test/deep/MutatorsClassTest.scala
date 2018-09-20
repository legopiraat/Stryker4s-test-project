package test.deep

import org.scalatest.{FunSuite, Matchers}

class MutatorsClassTest extends FunSuite with Matchers {
  val sut = new MutatorsClass

  test("test and") {
    sut.testAnd(true, true) shouldBe true
  }

  test("test equal") {
    sut.testEqual(0, 0) shouldBe true
  }

  test("less then fails") {
    sut.testLessThen(0, 0) shouldBe false
  }

  test("less then success") {
    sut.testLessThen(0, 5) shouldBe true
  }
}
