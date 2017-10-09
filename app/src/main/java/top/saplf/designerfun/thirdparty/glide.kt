package top.saplf.designerfun.thirdparty

import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.annotation.GlideOption
import com.bumptech.glide.annotation.GlideType
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions

/**
 * @author saplf
 */

@GlideModule class CustomAppGlideModule : AppGlideModule()

@GlideExtension object CustomAppExtension {
  @JvmStatic @GlideOption
  fun miniThumb(options: RequestOptions) {
    options.fitCenter().override(100)
  }

  @JvmStatic @GlideType(GifDrawable::class)
  fun asGifOfMine(requestBuilder: RequestBuilder<GifDrawable>) {
    requestBuilder
      .transition(DrawableTransitionOptions())
      .apply(RequestOptions.decodeTypeOf(GifDrawable::class.java))
  }
}
