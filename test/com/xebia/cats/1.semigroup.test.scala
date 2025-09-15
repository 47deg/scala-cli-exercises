//> using files ../../../../src
package com.xebia.cats
class Semigroup extends munit.FunSuite {
  test("combine Ints") {
    assert(combineInts == 3)
    assert(combineInts2 == combineInts)
  }

  test("combine Strings") {
    assert(combineStrings == "Hi there")
    assert(combineStrings2 == combineStrings)

  }

  test("combine Option[Int]") {
    assert(combineOptionInts == Some(3))
    assert(combineOptionInts2 == combineOptionInts)
  }

  test("combine List[Int]") {
    assert(combineListInts == List(1, 2, 3, 4, 5, 6))
    assert(combineListInts2 == combineListInts)
  }

  test("combine List[Option[Int]]") {
    assert(
      combineListOptions == List(
        Some(1),
        Some(2),
        Some(3),
        Some(4),
        Some(5),
        Some(6)
      )
    )
    assert(combineListOptions2 == combineListOptions)
  }

  test("combine functions") {
    assert(combineFunctions(1) == 12)
    assert(combineFunctions2(1) == combineFunctions(1))
  }

  test("combine maps") {
    assert(combinedMap.get("foo") == Some(Map("bar" -> 11)))
  }
}
