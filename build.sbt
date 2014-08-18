name := "evaluation"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaJpa
)     

play.Project.playJavaSettings
