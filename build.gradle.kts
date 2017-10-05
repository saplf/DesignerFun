// Top-level build file where you can add configuration options common to all sub-projects/modules.
val kotlinVersion = "1.1.51"

buildscript {
  dependencies {
    classpath("com.android.tools.build:gradle:2.3.3")
    classpath(kotlin("gradle-plugin"))
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.51")
//    classpath("me.ele:mess-plugin:1.1.4")
  }
  repositories {
    google()
    jcenter()
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

task<Delete>("clean") {
  delete(rootProject.buildDir)
  rootProject.childProjects.forEach { _, project ->
    delete(project.buildDir)
  }
}
