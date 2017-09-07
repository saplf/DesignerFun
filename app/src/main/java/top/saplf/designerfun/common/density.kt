package top.saplf.designerfun.common

import android.content.res.Resources
import android.util.DisplayMetrics
import top.saplf.designerfun.App

/**
 * @author saplf
 */

val resource: Resources by lazy { App.appContext.resources }

val displayMetrics: DisplayMetrics by lazy { resource.displayMetrics }

val displayWidth: Int by lazy { displayMetrics.widthPixels }

val displayHeight: Int by lazy { displayMetrics.heightPixels }
