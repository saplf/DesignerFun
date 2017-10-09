package top.saplf.designerfun.net

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * @author saplf
 */
object CustomRetrofit {

  private val normalRetrofit by lazy {
    Retrofit.Builder()
        .baseUrl("https://api.dribbble.com/v1/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
  }
}