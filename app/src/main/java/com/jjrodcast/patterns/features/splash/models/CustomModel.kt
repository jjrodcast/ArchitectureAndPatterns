package com.jjrodcast.patterns.features.splash.models

import java.io.Serializable

data class CustomModel(
    val id: String,
    val content: String) : Serializable {

    val presentationContent: String
        get() = content.format("")

    companion object{
        fun getCustomModelMocked() : List<CustomModel>{
            return listOf(
                CustomModel("", ""),
                CustomModel("", ""),
                CustomModel("", ""),
                CustomModel("", ""),
                CustomModel("", ""),
            )
        }
    }
}