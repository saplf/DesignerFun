package top.saplf.designerfun.common

import android.support.v4.widget.SwipeRefreshLayout
import android.view.View
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.NonCancellable
import kotlinx.coroutines.experimental.channels.actor
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.channels.Channel
import java.math.BigDecimal

/**
 * @author saplf
 */

interface JobHolder {
  val job: Job
}

val View.contextJob: Job
  get() = (context as? JobHolder)?.job ?: NonCancellable

fun View.onClick(action: suspend (View) -> Unit) {
  val actor = actor<View>(UI + contextJob, capacity = Channel.CONFLATED) {
    for (msg in channel) action(msg)
  }
  setOnClickListener { actor.offer(it) }
}

fun SwipeRefreshLayout.onRefresh(action: suspend () -> Unit) {
  val actor = actor<Unit>(UI + contextJob, capacity = Channel.CONFLATED) {
    for (msg in channel) action()
  }
  setOnRefreshListener { actor.offer(Unit) }
}
