ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"



lazy val root = (project in file("."))
  .settings(
    name := "LightBend1"
  )
lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux") => "linux"
  case n if n.startsWith("Mac") => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}
lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
libraryDependencies ++= javaFXModules.map( m=>
  "org.openjfx" % s"javafx-$m" % "11" classifier osName
)
libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.192-R14"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.2.1"
libraryDependencies +="org.apache.spark" %% "spark-sql" % "3.2.1"
libraryDependencies +="org.apache.spark" %% "spark-mllib" % "3.2.1"
libraryDependencies += "io.github.pityka" %% "nspl-awt" % "0.3.0"