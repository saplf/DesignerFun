package top.saplf.designerfun.native

import android.support.annotation.Keep

/**
 * @author saplf
 */
@Keep object NativeMethods {

  init {
    System.loadLibrary("native-lib")
  }

  private val signature by lazy { "123" }

  external fun appId(): String

  external fun appSecret(): String

}
