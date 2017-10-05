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

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    with(main_list) {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = MainAdapter()
    }

    with(swipe_refresh) {
      setOnRefreshListener { isRefreshing = false }
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
