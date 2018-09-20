package com.legopiraat.test

import org.scalatest.{FunSuite, Matchers}

class TestClassTest extends FunSuite with Matchers {
  private val sut = TestClass

  test("find person") {
    sut.find("person1") shouldBe Some("person1")
  }

  test("find person that starts with per") {
    sut.nameStartWith("per") shouldBe List("person1", "person2", "person3")
  }

  test("isEmpty") {
    sut.empty shouldBe false
  }

  test("min") {
    sut.min shouldBe 1
  }

  test("calculate") {
    sut.calculate(0, 0) shouldBe 0
  }
}