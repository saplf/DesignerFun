package top.saplf.designerfun

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

/**
 * @author saplf
 */
class App : Application() {

  companion object {
    val appContext: App by lazy { tmpApp }
    private lateinit var tmpApp: App
  }

  override fun onCreate() {
    super.onCreate()

    tmpApp = this

    if (BuildConfig.DEBUG) {
      // Init Logger
      Logger.addLogAdapter(AndroidLogAdapter())
    }
  }
}
