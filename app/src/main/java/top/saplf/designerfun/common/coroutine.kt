package top.saplf.designerfun.common

import android.view.View
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.NonCancellable
import kotlinx.coroutines.experimental.channels.actor
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.channels.Channel

/**
 * @author saplf
 */

interface JobHolder {
  val job: Job
}

val View.contextJob: Job
  get() = (context as? JobHolder)?.job ?: NonCancellable

fun View.onClick(action: suspend (View) -> Unit) {
  val eventActor = actor<View>(contextJob + UI, capacity = Channel.CONFLATED) {
    for (event in channel) action(event)
  }

  setOnClickListener { eventActor.offer(it) }
}
