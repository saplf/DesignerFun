@file:Suppress("unused")

package top.saplf.designerfun.common

import com.orhanobut.logger.Logger
import top.saplf.designerfun.BuildConfig
import top.saplf.designerfun.App

/**
 * @author saplf
 *
 * Log printers. With these functions & proguard tool in release mode, log info will
 * be removed automatically. Remember to init [Logger] in [App]'s `onCreate` method.
 */

inline fun logD(message: () -> Any) { if (BuildConfig.DEBUG) { Logger.d(message()) } }

inline fun logE(message: () -> String) { if (BuildConfig.DEBUG) { Logger.e(message()) } }

inline fun logW(message: () -> String) { if (BuildConfig.DEBUG) { Logger.w(message()) } }

inline fun logV(message: () -> String) { if (BuildConfig.DEBUG) { Logger.v(message()) } }

inline fun logI(message: () -> String) { if (BuildConfig.DEBUG) { Logger.i(message()) } }

inline fun logWtf(message: () -> String) { if (BuildConfig.DEBUG) { Logger.wtf(message()) } }

inline fun logJson(message: () -> String) { if (BuildConfig.DEBUG) { Logger.json(message()) } }

inline fun logXml(message: () -> String) { if (BuildConfig.DEBUG) { Logger.xml(message()) } }
