libraryDependencies += "org.scalafx" % "scalafx" % "1.0-SNAPSHOT"

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))
