ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1"

lazy val scalaJsSample = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalaJSJUnitPlugin)
  .settings(
    name := "scalajs-sample",
    scalaJSUseMainModuleInitializer := true,
    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(), // なぜか jsdomnodejs が解決できない。
    libraryDependencies ++= {
      Seq(
        "org.scala-js" %%% "scalajs-dom" % "1.1.0"
      )
    }
  )
