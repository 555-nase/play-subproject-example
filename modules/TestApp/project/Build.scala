import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "TestApp"
  val appVersion      = "0.2"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
  )

}