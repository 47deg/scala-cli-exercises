package com.xebia.cats

// `Monoid` extends the `Semigroup` type class, adding an `empty` method to
// semigroup's `combine`. The `empty` method must return a value that when
// combined with any other instance of that type returns the other instance,
// i.e.
// combine(x, empty) == combine(empty, x) == x
//
// For example, if we have a `Monoid[String]` with `combine` defined as string
// concatenation, then `empty = ""`.
//
// Having an `empty` defined allows us to combine all the elements of some
// potentially empty collection of `T` for which a `Monoid[T]` is defined and
// return a `T`, rather than an `Option[T]` as we have a sensible default to
// fall back to.
//

// First some imports.
import cats.*
import cats.implicits.*

// And let's see the implicit instance of `Monoid[String]` in action.

val emptyString = Monoid[String].empty
// test: String =

val combineString = Monoid[String].combineAll(List("a", "b", "c"))
// test: String = abc

val combineEmpty = Monoid[String].combineAll(List())
// test: String =

// The advantage of using these type class provided methods, rather than the specific ones for
// each type, is that we can compose monoids to allow us to operate on more complex types, e.g.
val stringMap = Monoid[Map[String, Int]].combineAll(
  List(Map("a" -> 1, "b" -> 2), Map("a" -> 3))
)
// test: Map[String, Int] = Map("a" -> 4, "b" -> 2)

val emptyMap = Monoid[Map[String, Int]].combineAll(List())
// test: Map[String, Int] = Map()

// This is also true if we define our own instances. As an example, let's use `Foldable`'s
// `foldMap`, which maps over values accumulating the results, using the available `Monoid` for
// the type mapped onto.
val l             = List(1, 2, 3, 4, 5)
val intFoldmapped = l.foldMap(identity)
// test: Int = 15

val strFoldmapped = l.foldMap(i => i.toString)
// test: String = 12345

// To use this with a function that produces a tuple, we can define a `Monoid` for a tuple that
// will be valid for any tuple where the types it contains also have a `Monoid` available. Note
// that cats already defines it for you.

implicit def monoidTuple[A: Monoid, B: Monoid]: Monoid[(A, B)] =
  new Monoid[(A, B)] {
    def combine(x: (A, B), y: (A, B)): (A, B) = {
      val (xa, xb) = x
      val (ya, yb) = y
      (Monoid[A].combine(xa, ya), Monoid[B].combine(xb, yb))
    }
    def empty: (A, B) = (Monoid[A].empty, Monoid[B].empty)
  }

// This way we are able to combine both values in one pass, hurrah!
val tupleFoldmapped = l.foldMap(i => (i, i.toString))
// test: (Int, String) = (15, 12345)
