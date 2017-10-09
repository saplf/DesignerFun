package top.saplf.designerfun.net

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import top.saplf.designerfun.model.Shot
import top.saplf.designerfun.net.DribbbleParamAnn.ListType
import top.saplf.designerfun.net.DribbbleParamAnn.SortType
import top.saplf.designerfun.net.DribbbleParamAnn.TimeFrameType

/**
 * @author saplf
 */
interface DribbbleApi {
  @GET("shots")
  fun shots(
    @Query("list") @ListType list: String? = null,
    @Query("timeframe") @TimeFrameType timeFrame: String? = null,
    @Query("date") data: String? = null,
    @Query("sort") @SortType sort: String? = null
  ): Call<List<Shot>>
}
