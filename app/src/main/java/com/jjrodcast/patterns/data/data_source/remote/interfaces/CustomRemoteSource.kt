package com.jjrodcast.patterns.data.data_source.remote.interfaces

import com.jjrodcast.patterns.core.message.DataResult
import com.jjrodcast.patterns.domain.models.CustomResult

interface CustomRemoteSource {

    suspend fun fetchCustomModel(): DataResult<List<CustomResult>>

}