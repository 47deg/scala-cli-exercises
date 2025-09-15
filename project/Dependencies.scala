import sbt.*

object V {
    val toolkit = "0.1.29"
}
object Deps {
  val toolkit = "org.typelevel" %% "toolkit" % V.toolkit
  val toolkitTest = "org.typelevel" %% "toolkit-test" % V.toolkit

  val scalaCliDeps = Seq(
    "org.typelevel" %% "toolkit" % "0.1.29" ,
    //"com.raquo" %% "airstream" % "17.2.1" ,
    //"com.raquo" %% "laminar" % "17.2.1" ,
    "io.circe" %% "circe-core" % "0.14.14" ,
    "io.circe" %% "circe-generic" % "0.14.14" ,
    "io.circe" %% "circe-parser" % "0.14.14" ,
    //"org.scala-js" %% "scalajs-dom" % "2.8.1" ,
    "org.scalatest" %% "scalatest" % "3.2.19" ,
    "org.tpolecat" %% "doobie-core" % "1.0.0-RC10" ,
    "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC10" ,
    "org.typelevel" %% "cats-core" % "2.13.0" ,
    "org.typelevel" %% "cats-kernel" % "2.13.0" ,
    "org.typelevel" %% "cats-effect" % "3.6.3" 
  )

  val scalaCliTestDeps = Seq(
    "org.typelevel" %% "toolkit-test" % "0.1.29" % Test,
    "org.scalameta" %% "munit-scalacheck" % "1.2.0" % Test,
    "org.scalameta" %% "munit" % "1.1.2" % Test,
    "org.scalatest" %% "scalatest" % "3.2.19" % Test,
    "org.typelevel" %% "munit-cats-effect" % "2.1.0" % Test,
    "org.typelevel" %% "scalacheck-effect-munit" % "2.0.0-M2" % Test,
    "org.typelevel" %% "toolkit" % "0.1.29" % Test,
    //"com.raquo" %% "airstream" % "17.2.1" % Test,
    //"com.raquo" %% "laminar" % "17.2.1" % Test,
    "io.circe" %% "circe-core" % "0.14.14" % Test,
    "io.circe" %% "circe-generic" % "0.14.14" % Test,
    "io.circe" %% "circe-parser" % "0.14.14" % Test,
    //"org.scala-js" %% "scalajs-dom" % "2.8.1" % Test,
    "org.tpolecat" %% "doobie-core" % "1.0.0-RC10" % Test,
    "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC10" % Test,
    "org.typelevel" %% "cats-core" % "2.13.0" % Test,
    "org.typelevel" %% "cats-kernel" % "2.13.0" % Test,
    "org.typelevel" %% "cats-effect" % "3.6.3" % Test
  )
}
