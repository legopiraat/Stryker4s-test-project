package test.deep

class MutatorsClass {

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
