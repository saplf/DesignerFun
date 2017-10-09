package top.saplf.designerfun.core.shot.vm

import ru.gildor.coroutines.retrofit.await
import ru.gildor.coroutines.retrofit.awaitResult
import ru.gildor.coroutines.retrofit.getOrDefault
import top.saplf.designerfun.model.ShotModel
import top.saplf.designerfun.net.CustomRetrofit

/**
 * @author saplf
 */

object ShotViewModel {
  suspend fun loadData(): List<ShotModel> {
    return CustomRetrofit
      .dribbbleApi
      .shots()
      .awaitResult()
      .getOrDefault(emptyList())
      .map { ShotModel(it) }
  }
}
