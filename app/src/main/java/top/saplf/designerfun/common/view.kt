@file:Suppress("unused")

package top.saplf.designerfun.common

import android.view.View
import android.view.ViewGroup

/**
 * @author saplf
 */

operator fun ViewGroup.get(index: Int): View {
  if (index < 0 || index >= childCount) {
    throw RuntimeException("$index is beyond 0..$childCount, check your code.")
  }
  return getChildAt(index)
}

operator fun ViewGroup.plusAssign(view: View) { addView(view) }

operator fun ViewGroup.minusAssign(view: View) { removeView(view) }

inline fun ViewGroup.foreach(exec: (child: View) -> Unit) { (0 until childCount).forEach { exec(this[it]) } }

inline fun ViewGroup.foreachIndexed(exec: (index: Int, child: View) -> Unit) {
  (0 until childCount).forEach { exec(it, this[it]) }
}
