package top.saplf.designerfun.core.shot.view

import android.content.Context
import android.support.annotation.StringDef
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.shot_item_view.view.*
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.run
import top.saplf.designerfun.R
import top.saplf.designerfun.common.JobHolder
import top.saplf.designerfun.core.shot.vm.ShotViewModel
import top.saplf.designerfun.model.ShotModel

/**
 * @author saplf
 */
class ShotAdapter(
  private val mContext: Context
) : RecyclerView.Adapter<ShotHolder>(), JobHolder {
  private val shots by lazy { mutableListOf<ShotModel>() }
  override val job: Job = Job()

  override fun onBindViewHolder(holder: ShotHolder, position: Int) {
    holder.render(shots[position])
  }

  override fun getItemCount(): Int = shots.size

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShotHolder {
    return ShotHolder(LayoutInflater.from(mContext).inflate(R.layout.shot_item_view, parent, false))
  }

  suspend fun loadData() {
    val list = ShotViewModel.loadData()
    run(job) {
      shots.clear()
      shots.addAll(list)
    }
    notifyDataSetChanged()
  }
}

class ShotHolder(view: View) : RecyclerView.ViewHolder(view) {
  fun render(shot: ShotModel) {
    with(shot.shot) {
      with(itemView) {
        item_text.text = "$title\n$description"
      }
    }
  }
}
