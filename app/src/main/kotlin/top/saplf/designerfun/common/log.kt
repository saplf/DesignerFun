@file:Suppress("unused")

package top.saplf.designerfun.common

import com.orhanobut.logger.Logger
import top.saplf.designerfun.App
import top.saplf.designerfun.BuildConfig

/**
 * @author saplf
 *
 * Log printers. With these functions & proguard tool in release mode, log info will
 * be removed automatically. Remember to init [Logger] in [App]'s `onCreate` method.
 */

inline fun logD(tag: String? = null, message: () -> Any) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).d(message())
    } else {
      Logger.d(message())
    }
  }
}

inline fun logE(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).e(message())
    } else {
      Logger.e(message())
    }
  }
}

inline fun logW(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).w(message())
    } else {
      Logger.w(message())
    }
  }
}

inline fun logV(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).v(message())
    } else {
      Logger.v(message())
    }
  }
}

inline fun logI(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).i(message())
    } else {
      Logger.i(message())
    }
  }
}

inline fun logWtf(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).wtf(message())
    } else {
      Logger.wtf(message())
    }
  }
}

inline fun logJson(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).json(message())
    } else {
      Logger.json(message())
    }
  }
}

inline fun logXml(tag: String? = null, message: () -> String) {
  if (BuildConfig.DEBUG) {
    if (tag != null) {
      Logger.t(tag).xml(message())
    } else {
      Logger.xml(message())
    }
  }
}
