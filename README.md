# scala-exercises WIP

a scala-cli implementation of [scala-exercises](https://www.scala-exercises.org/)
For local interaction with minimal dependencies

## pre-requisites

Install [Scala-cli](https://scala-cli.virtuslab.org/docs/overview#installation)

docker for database

## How to use this repo

There are two commands needed to explore these exercises

- `scala-cli repl <file.scala>` This will allow you to play with values and functions
- `scala-cli test <file.test.scala>` This will allow you to test files

```bash
❯ scala-cli repl 1.semigroup.scala
Compiling project (Scala 3.4.1, JVM (17))
Compiled project (Scala 3.4.1, JVM (17))
Welcome to Scala 3.4.1 (17.0.5, Java Java HotSpot(TM) 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.

scala> combineFunctions2(6)
val res0: Int = 67
```

```bash
❯ scala-cli test 1.semigroup.test.scala
Compiling project (test, Scala 3.4.1, JVM (17))
Compiled project (test, Scala 3.4.1, JVM (17))
Semigroup:
  + combine Ints 0.084s
  + combine Strings 0.001s
  + combine Option[Int] 0.001s
  + combine List[Int] 0.0s
  + combine List[Option[Int]] 0.001s
  ...
```

### Some additional helpful commands

`scala-cli setup-ide <file>`

### create js file

```bash
❯ scala-cli --power package --js src/logic.scala -o src/logic.js --force
Compiling project (Scala 3.4.1, Scala.js 1.16.0)
Compiled project (Scala 3.4.1, Scala.js 1.16.0)
[hint] ./src/logic.scala:4:15
[hint] "scalajs-dom is outdated, update to 2.8.0"
[hint]      scalajs-dom 2.2.0 -> org.scala-js::scalajs-dom::2.8.0
[hint] //> using dep org.scala-js::scalajs-dom::2.2.0
[hint]               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Wrote /Users/scala/47deg/scala-cli-exercise/scala-js/src/logic.js, run it with
  node ./src/logic.js
```

import later in the HTML file

![alt text](image.png)

## Doobie

run `docker-compose up`

## pre-requisites

Cats effects

```bash
❯ scala-cli  doobie.scala
Compiling project (Scala 3.4.1, JVM (17))
Compiled project (Scala 3.4.1, JVM (17))
Found country: Country(FRA,France,59225700)
All countries: DEU, ESP, FRA, GBR, USA
```
