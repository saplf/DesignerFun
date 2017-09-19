package top.saplf.designerfun

import android.content.Context
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import android.view.View

/**
 * @author saplf
 */
class CustomView : AppCompatButton {
  constructor(context: Context?) : super(context)
  constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
  constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}