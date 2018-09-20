package com.legopiraat.test.deep

class MutatorsTestClass {

  def testEqual(a: Int, b: Int) = {
    a == b
  }

  def testLessThen(a: Int, b: Int) = {
    a < b
  }
  def testAnd(a: Boolean, b: Boolean) = {
    if(a && b) {
      true
    }
  }
}
