package com.jjrodcast.patterns.domain.models

import com.jjrodcast.patterns.features.splash.models.CustomModel
import java.io.Serializable

data class CustomResult(
    val id: String,
    val content: String) : Serializable {

    fun toFeature() = CustomModel(
        id = id,
        content = content
    )
}