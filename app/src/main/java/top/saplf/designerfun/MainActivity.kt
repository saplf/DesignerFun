package top.saplf.designerfun

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.Keep
import kotlinx.android.synthetic.main.activity_main.*
import top.saplf.designerfun.native.NativeMethods

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    @SuppressLint("SetTextI18n")
    textView.text = "id: ${NativeMethods.appId()}\nsecret: ${NativeMethods.appSecret()}"
  }
}
