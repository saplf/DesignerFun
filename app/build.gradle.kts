import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import java.io.FileInputStream
import java.util.*

apply {
  plugin("com.android.application")
  plugin("kotlin-android")
  plugin("kotlin-android-extensions")
//  plugin("me.ele.mess")
}

//val properties = Properties()
//val inputStream = FileInputStream(project.rootProject.file("local.properties"))
//properties.load(inputStream)
//
//val stringType = "String"
//val signFile = properties["key.file"]
//val signAlias = properties["key.alias"]
//val signPassword = properties["key.password"]
//val signAliasPassword = properties["key.alias.password"]

//android {
//  compileSdkVersion(26)
//  buildToolsVersion("26.0.2")
//  defaultConfig {
//    minSdkVersion(21)
//    targetSdkVersion(26)
//
//    applicationId = "top.saplf.designerfun"
//    versionCode = 1
//    versionName = "0.1"
//  }
//
//  signingConfigs {
//    appSignConfig {
//
//    }
//  }
//
//  externalNativeBuild {
//    cmake {
//      path("CMakeLists.txt")
//    }
//  }
//}
//
//dependencies {
//  testCompile("junit:junit:4.12")
//}

