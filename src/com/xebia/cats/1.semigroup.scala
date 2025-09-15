//> using toolkit com.xebia.SE:0.1.1-SNAPSHOT
package com.xebia.cats
// A semigroup for some given type A has a single operation (which we will call combine),
// which takes two values of type A, and returns a value of type A.
// This operation must be guaranteed to be associative. That is to say that:

// ((a combine b) combine c)
// must be the same as

// (a combine (b combine c))
// for all possible values of a,b,c.

// There are instances of Semigroup defined for many types found in the scala common library. For example, Int values are combined using addition by default but multiplication is also associative and forms another Semigroup.

import cats.Semigroup
import cats.implicits.*

val combineInts = Semigroup[Int].combine(1, 2)
// test: Int = 3

val combineStrings = Semigroup[String].combine("Hi ", "there")
// test: String = Hi there

val combineOptionInts = Semigroup[Option[Int]].combine(Option(1), Option(2))
// test: Option[Int] = Some(3)

val combineListInts = Semigroup[List[Int]].combine(List(1, 2, 3), List(4, 5, 6))
// test: List[Int] = List(1, 2, 3, 4, 5, 6)

val combineListOptions = Semigroup[List[Option[Int]]].combine(
  List(Option(1), Option(2), Option(3)),
  List(Option(4), Option(5), Option(6))
)
// test: List[Option[Int]] = List(Some(1), Some(2), Some(3), Some(4), Some(5), Some(6))

// Cats come with syntax for the |+| operator which is an alias for the combine method.

val combineInts2 = 1 |+| 2
// test: Int = 3

val combineStrings2 = "Hi " |+| "there"

val combineOptionInts2 = Option(1) |+| Option(2)
// test: Option[Int] = Some(3)

val combineListInts2 = List(1, 2, 3) |+| List(4, 5, 6)
// test: List[Int] = List(1, 2, 3, 4, 5, 6)

val combineListOptions2 = List(Option(1), Option(2), Option(3)) |+| List(
  Option(4),
  Option(5),
  Option(6)
)
// test: List[Option[Int]] = List(Some(1), Some(2), Some(3), Some(4), Some(5), Some(6) )

// We can use the combine method to combine functions as well.
def combineFunctions(x: Int) = Semigroup[Int => Int].combine(_ + 1, _ * 10)(x)

// as well as the |+| operator
def combineFunctions2(x: Int) = (((_: Int) + 1) |+| ((_: Int) * 10))(x)

// Many of these types have methods defined directly on them,
// which allow for such combining, e.g. ++ on List, but the value of having a
// Semigroup type class available is that these compose, so for instance, we can say

// Map("foo" -> Map("bar" -> 5)).combine(Map("foo" -> Map("bar" -> 6), "baz" -> Map()))
// Map("foo" -> List(1, 2)).combine(Map("foo" -> List(3, 4), "bar" -> List(42)))

// which is far more likely to be useful than

// Map("foo" -> Map("bar" -> 5)) ++ Map("foo" -> Map("bar" -> 6), "baz" -> Map())
// Map("foo" -> List(1, 2)) ++ Map("foo" -> List(3, 4), "bar" -> List(42))

// since the first version uses the Semigroup's combine operation,
//it will merge the map's values with combine.

val aMap = Map("foo" -> Map("bar" -> 5))
val anotherMap = Map("foo" -> Map("bar" -> 6))
val combinedMap =
  Semigroup[Map[String, Map[String, Int]]].combine(aMap, anotherMap)
