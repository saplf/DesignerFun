package top.saplf.designerfun.core.shot.vm

import ru.gildor.coroutines.retrofit.await
import ru.gildor.coroutines.retrofit.awaitResult
import ru.gildor.coroutines.retrofit.getOrDefault
import top.saplf.designerfun.model.ShotModel
import top.saplf.designerfun.net.CustomRetrofit
import top.saplf.designerfun.thirdparty.boxStore

/**
 * @author saplf
 */

object ShotViewModel {

  private val shotBox by lazy { boxStore.boxFor(ShotModel::class.java) }

  suspend fun loadData(): List<ShotModel> {
    return CustomRetrofit
      .dribbbleApi
      .shots()
      .awaitResult()
      .getOrDefault(emptyList())
      .map { ShotModel(it) }
  }
}
