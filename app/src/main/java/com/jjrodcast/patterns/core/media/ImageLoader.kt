package com.jjrodcast.patterns.core.media

import android.widget.ImageView
import androidx.annotation.DrawableRes

interface ImageLoader {
    fun load(imageView: ImageView, url: String)
    fun load(imageView: ImageView, @DrawableRes placeholder: Int, url: String)
}