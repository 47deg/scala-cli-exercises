//> using toolkit com.xebia.SE:0.1.1-SNAPSHOT
package com.xebia.stdlib

import org.scalatest.matchers.should.Matchers._

// ScalaTest makes three assertions available by default in any style trait. You can use:
//  assert for general assertions;
//  assertResult to differentiate expected from actual values;
//  intercept to ensure a bit of code throws an expected exception.

// In any Scala program, you can write assertions by invoking assert and passing in a Boolean expression:

// val left = 2
// val right = 1
// assert(left == right)

// If the passed expression is true, assert will return normally.
// If false, Scala's assert will complete abruptly with an AssertionError.
// This behavior is provided by the assert method defined in object Predef,
//  whose members are implicitly imported into every Scala source file.

// ScalaTest provides a domain specific language (DSL) for expressing assertions in tests using the word should.
// ScalaTest matchers provides five different ways to check equality,
// each designed to address a different need. They are:

// result should equal(3) // can customize equality
// result should ===(3) // can customize equality and enforce type constraints
// result should be(3) // cannot customize equality, so fastest to compile
// result shouldEqual 3 // can customize equality, no parentheses required
// result shouldBe 3       // cannot customize equality, so fastest to compile, no parentheses required

// Come on, your turn: true and false values can be compared with should matchers:

val assertTrue = true shouldBe true
// test: Boolean = true

// Booleans in asserts can test equality:

val v4 = 4
val assertEqual = v4 shouldEqual 4
// test: Int = 4

// Sometimes we expect you to fill in the values:

val v2 = 2
val assertEquation = assert(v2 == 1 + 1)
// test: Int = 2
