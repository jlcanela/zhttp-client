lazy val hello = project.in(file("."))
  .settings(
    scalaVersion := "3.0.0-RC3",
    libraryDependencies ++=
      Seq(
          "dev.zio" %% "zio" % "1.0.7",
          "io.d11" %% "zhttp" % "1.0.0.0-RC16"
          )
  )
