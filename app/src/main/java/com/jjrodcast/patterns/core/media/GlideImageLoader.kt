package com.jjrodcast.patterns.core.media

import android.widget.ImageView
import com.bumptech.glide.Glide

internal class GlideImageLoader : ImageLoader {
    override fun load(imageView: ImageView, url: String) {
        Glide.with(imageView.context).load(url).into(imageView)
    }

    override fun load(imageView: ImageView, placeholder: Int, url: String) {
        Glide.with(imageView.context).load(url).placeholder(placeholder).into(imageView)
    }
}