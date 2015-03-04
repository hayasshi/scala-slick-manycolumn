val Organization = "local"
val Name = "scala-slick-manycolumn"
val Version = "0.0.1"
val ScalaVersion = "2.11.5"

lazy val root = (project in file(".")).settings(
  name := Name,
  organization := Organization,
  version := Version,
  scalaVersion := ScalaVersion,
  sourcesInBase := false,
  resolvers ++= Seq(
    Classpaths.typesafeReleases
  ),
  scalacOptions := Seq("-deprecation", "-language:postfixOps"),
  libraryDependencies ++= Seq(
    "com.typesafe.slick" %% "slick" % "2.1.0",
    "com.h2database" % "h2" % "1.4.180",
    "org.slf4j" % "slf4j-nop" % "1.6.4",
    "org.specs2" %% "specs2" % "2.3.13" % "test"
  ),
  javacOptions in compile ++= Seq("-target", "7", "-source", "7", "-encoding", "UTF-8")
)
