package com.xebia.stdlib

import org.scalatest.matchers.should.Matchers._

class Asserts extends munit.FunSuite {
  test("assert True") {
    assert(assertTrue == succeed)
  }

  test("assert Equal") {
    assert(v4 == 4)
    assert(assertEqual == succeed)

  }

  test("assert 1 + 1") {
    assert(v2 == 2)
    assert(assertEquation == succeed)
  }
}
