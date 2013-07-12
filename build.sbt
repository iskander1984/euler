name := "Euler solutions in scala and scalaz"

version := "0.1"

scalaVersion := "2.10.1"

resolvers += "Typesafe snapshots" at "http://repo.typesafe.com/typesafe/snapshots"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.1"
)

scalacOptions += "-feature"

