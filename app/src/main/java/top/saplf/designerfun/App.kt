package top.saplf.designerfun

import android.app.Application
import android.support.annotation.Keep
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import io.objectbox.android.AndroidObjectBrowser
import top.saplf.designerfun.thirdparty.boxStore

/**
 * @author saplf
 */
@Keep class App : Application() {

  companion object {
    @JvmStatic val appContext: App by lazy { tmpApp }
    private lateinit var tmpApp: App
  }

  override fun onCreate() {
    super.onCreate()

    tmpApp = this

    if (BuildConfig.DEBUG) {
      // Init Logger
      Logger.addLogAdapter(AndroidLogAdapter())
      // ObjectBox relative
      AndroidObjectBrowser(boxStore).start(appContext)
    }
  }
}
