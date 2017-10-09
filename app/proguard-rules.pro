# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-dontshrink

# kotlin
-dontwarn kotlin.**
-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
  static void checkParameterIsNotNull(java.lang.Object, java.lang.String);
}

# kotlin coroutines
-keepclassmembernames class kotlinx.** {
  volatile <fields>;
}

# RxJava/RxKotlin

# retrofit
-dontwarn okio.**
-dontwarn javax.annotation.**
-dontwarn retrofit2.**

# moshi
-dontwarn okio.**
-dontwarn javax.annotation.Nullable
-dontwarn javax.annotation.ParametersAreNonnullByDefault
-keepclasseswithmembers class * {
  @com.squareup.moshi.* <methods>;
}
-keep @com.squareup.moshi.JsonQualifier interface *
-keepclassmembers class kotlin.Metadata {
  public <methods>;
}

# move all classes to root package
#-repackageclasses

-keep class * extends android.app.Activity

-keep class android.** { *; }

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.AppGlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
