lazy val root = (project in file("."))
  .settings(
    name := "doddle-model-examples",
    organization := "com.picnicml",
    version := Version(),
    scalaVersion := "2.12.6",
    libraryDependencies ++= Dependencies.settings
  )
