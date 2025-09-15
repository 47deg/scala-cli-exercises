package com.xebia.stdlib

class Objects extends munit.FunSuite {
  test("Object def") {
    assert(greetingEnglish == "Hi")
    assert(greetingEspanol == "Hola")
  }
  test("Object eq") {
    assert(greetingEq1 == true)
    assert(greetingEq2 == true)
  }
  test("companion object") {
    assert(movieName == "Grand Hotel")
  }
  test("companion object private value") {
    assert(clarkName == "Superman")
    assert(peterName == "Spider-Man")
  }
}
