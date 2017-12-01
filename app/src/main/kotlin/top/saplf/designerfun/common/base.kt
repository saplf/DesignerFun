package top.saplf.designerfun.common

import android.support.v7.app.AppCompatActivity
import kotlinx.coroutines.experimental.Job

/**
 * @author saplf
 */

abstract class AppBaseActivity : AppCompatActivity(), JobHolder {
  override val job: Job = Job()

  override fun onDestroy() {
    super.onDestroy()
    job.cancel()
  }
}
