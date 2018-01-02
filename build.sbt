val settings: Seq[Def.Setting[_]] = Seq(
  version := "0.1.0",
  scalaVersion := "2.12.4",
  javacOptions ++= Seq("-encoding", "UTF-8"),
  javaOptions in ThisBuild ++= Seq("-Xmx1g"),
  fork := true,
  fork in Compile := true,
  fork in Test := true,
  showTiming := true,
  timingFormat := {
    import java.text.DateFormat
    DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
  },
  publishArtifact in Test := true,
)

lazy val root = project in file(".")

lazy val course1 = (project in file("Course 1 - Algorithmic Toolbox"))
  .settings(settings)
