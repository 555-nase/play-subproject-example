import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "HostApp"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )
  
  
  val testAppDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "oc-menu" % "oc-menu_2.10" % "0.9.5"
  )

  val module1 = play.Project("module1", "0.2", testAppDependencies, path = file("modules/TestApp"))
 
 
  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Local Play Repository" at "file://C:/Users/Administrator/play_framework/play/repository/local"
  ).dependsOn(
    module1
  ).aggregate(
    module1
  )

}
