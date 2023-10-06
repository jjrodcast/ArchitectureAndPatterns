package com.jjrodcast.patterns.data.data_source.remote

import com.jjrodcast.patterns.core.message.DataResult
import com.jjrodcast.patterns.data.data_source.remote.dto.CustomResponse
import com.jjrodcast.patterns.data.data_source.remote.interfaces.CustomRemoteSource
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

internal class CustomRemoteSourceImpl(
    private val moshi: Moshi,
    private val remoteClient: String) : CustomRemoteSource {

    private val customAdapterList by lazy{
        val type = Types.newParameterizedType(List::class.java, CustomResponse::class.java)
        moshi.adapter<List<CustomResponse>>(type)
    }

    override suspend fun fetchCustomModel(): DataResult<List<CustomResult>> {
        return DataResult.Success(listOf<CustomResult>())
    }

    companion object{
        private const val CUSTOM_ENDPOINT: String = "url"
    }
}