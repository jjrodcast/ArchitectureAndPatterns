package com.jjrodcast.patterns.data.repository

import com.jjrodcast.patterns.core.message.DataResult
import com.jjrodcast.patterns.data.data_source.remote.interfaces.CustomRemoteSource
import com.jjrodcast.patterns.data.repository.interfaces.CustomRepository

internal class CustomRepositoryImpl(private val customRemoteSource: CustomRemoteSource) : CustomRepository {

    override suspend fun fetchCustomModel(): DataResult<List<CustomResult>> {
        return customRemoteSource.fetchCustomModel()
    }

}