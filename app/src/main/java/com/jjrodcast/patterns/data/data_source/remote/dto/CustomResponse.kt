package com.jjrodcast.patterns.data.data_source.remote.dto

import com.jjrodcast.patterns.domain.models.CustomResult
import com.squareup.moshi.Json

internal data class CustomResponse(
    @Json(name = FIELD_ID)
    val id: String,
    @Json(name = FIELD_CONTENT)
    val content: String){

    fun toDomain() = CustomResult(id, content)

    companion object{
        private const val FIELD_ID = "id"
        private const val FIELD_CONTENT = "content"
    }

}