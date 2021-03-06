import AssemblyKeys._

assemblySettings

name := "lllm"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.1"

//scalacOptions += "-target:jvm-1.6"
    
resolvers ++= Seq(
    Resolver.mavenLocal,
    Resolver.sonatypeRepo("snapshots"),
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("public"),
    Resolver.typesafeRepo("releases")
)

libraryDependencies ++= Seq(
  "edu.berkeley.nlp.cs" %% "igor" % "0.1-SNAPSHOT",
  "edu.berkeley.nlp.cs" %% "erector" % "0.1-SNAPSHOT",
  "org.scalanlp" %% "breeze-natives" % "0.8.1"
)


javaOptions := Seq("-Xmx6g", "-Xrunhprof:cpu=samples,depth=12", "-Dlog4j.configurationFile=src/main/resources/log4j.xml")
