name := "HelloWorld"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVer = "2.3.1"


resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)


libraryDependencies ++=  Seq(
    "org.apache.spark" %% "spark-core" % sparkVer,
    "org.apache.spark" %% "spark-sql" % sparkVer
  )


// https://mvnrepository.com/artifact/org.apache.spark/spark-core
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0"
