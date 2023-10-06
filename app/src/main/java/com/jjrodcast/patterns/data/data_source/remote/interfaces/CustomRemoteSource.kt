package com.jjrodcast.patterns.data.data_source.remote.interfaces

import com.jjrodcast.patterns.core.message.DataResult

interface CustomRemoteSource {

    suspend fun fetchCustomModel(): DataResult<List<CustomResult>>

}