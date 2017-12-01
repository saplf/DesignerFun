package top.saplf.designerfun.core.home.view

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.app_bar_main.*
import top.saplf.designerfun.R
import top.saplf.designerfun.common.AppBaseActivity
import top.saplf.designerfun.common.onRefresh
import top.saplf.designerfun.core.shot.view.ShotAdapter

class MainActivity : AppBaseActivity() {

  private val shotAdapter by lazy { ShotAdapter(this) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    main_list.apply(::listSetup)
    swipe_refresh.apply(::swipeRefreshSetup)
  }

  private fun listSetup(recyclerView: RecyclerView) = with(recyclerView) {
    adapter = shotAdapter
    layoutManager = LinearLayoutManager(this@MainActivity)
  }

  private fun swipeRefreshSetup(layout: SwipeRefreshLayout) = with(layout) {
    onRefresh { refresh() }
  }

  private suspend fun refresh() {
    shotAdapter.loadData()
    swipe_refresh.isRefreshing = false
  }
}
