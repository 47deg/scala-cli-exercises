package com.xebia.stdlib

class Options extends munit.FunSuite {
  test("Some[String] value") {
    assert(someValue == Some("I am wrapped in something"))
    assert(emptyValue == None)
  }
  test("Option getOrElse") {
    assert(value1Get == "Found value")
    assert(value2Get == "No value")
    assert(value2GetFunction == "default function")
  }
  test("Option isEmpty") {
    assert(value1IsEmpty == false)
    assert(value2IsEmpty == true)
  }
  test("Option match") {
    assert(someValueMatch == 20.0)
    assert(noValueMatch == 0.0)
  }
  test("Option map") {
    assert(numberMap == Some(4.5))
    assert(noNumberMap == None)
  }
  test("Option fold") {
    assert(numberFold == 9)
    assert(noNumberFold == 1)
  }
}
