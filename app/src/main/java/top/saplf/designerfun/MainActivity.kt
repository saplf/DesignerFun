package top.saplf.designerfun

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.item_view.view.*
import top.saplf.designerfun.thirdparty.BoxTest
import top.saplf.designerfun.thirdparty.boxStore

class MainActivity : AppCompatActivity() {

  private val testBox by lazy { boxStore.boxFor(BoxTest::class.java) }
  private var counter: Long = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    if (testBox.count() > 0) {
      counter = testBox.all[0].count
    }

    with(main_list) {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = MainAdapter()
    }

    with(swipe_refresh) {
      setOnRefreshListener {
        app_bar_toolbar.title = "Hello ${++counter}"
        if (testBox.count() == 0L) {
          testBox.put(BoxTest(count = counter))
        } else {
          testBox.put(testBox.all[0].copy(count = counter))
        }
        isRefreshing = false
      }
    }

    with(app_bar_toolbar) {
      title = "Hello $counter"
    }
  }

  class MainAdapter : RecyclerView.Adapter<MainHolder>() {
    private val fakeData: List<String> by lazy { (1..30).map { "$it" } }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
      holder.render(fakeData[position])
    }

    override fun getItemCount(): Int = fakeData.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder
      = MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))

  }

  class MainHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun render(data: String) {
      itemView.item_text.text = data
    }
  }
}
