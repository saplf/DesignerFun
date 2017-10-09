package top.saplf.designerfun.net

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import top.saplf.designerfun.BuildConfig

/**
 * @author saplf
 */
object CustomRetrofit {

  private val okhttpClient by lazy {
    OkHttpClient.Builder()
      .addInterceptor(CustomRetrofit::customHeader)
      .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
      .build()
  }

  private val normalRetrofit by lazy {
    Retrofit.Builder()
      .baseUrl("https://api.dribbble.com/v1/")
      .addConverterFactory(MoshiConverterFactory.create())
      .client(okhttpClient)
      .build()
  }

  private fun customHeader(chain: Interceptor.Chain): Response
    = chain.proceed(
    chain.request()
      .newBuilder()
      .addHeader("Authorization", "bearer ${BuildConfig.CLIENT_TOKEN}")
      .build()
  )

  val dribbbleApi: DribbbleApi by lazy { normalRetrofit.create(DribbbleApi::class.java) }
}
