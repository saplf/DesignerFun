package top.saplf.designerfun.thirdparty

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.Gson
import com.google.gson.GsonBuilder

/**
 * @author saplf
 */
val gson: Gson by lazy {
  GsonBuilder()
    .setExclusionStrategies(IgnoreStrategy)
    .create()
}

inline fun <reified T> String?.toEntity(): T? {
  return try {
    gson.fromJson(this, T::class.java)
  } catch (e: Exception) {
    null
  }
}

inline fun <reified T> T?.toJson(): String = gson.toJson(this)

annotation class GsonIgnore

object IgnoreStrategy : ExclusionStrategy {
  override fun shouldSkipClass(clazz: Class<*>?): Boolean = false

  override fun shouldSkipField(f: FieldAttributes): Boolean =
    f.getAnnotation(GsonIgnore::class.java) != null

}