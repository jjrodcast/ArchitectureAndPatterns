package com.jjrodcast.patterns.data.repository.interfaces

import com.jjrodcast.patterns.core.message.DataResult

internal interface CustomRepository {

    suspend fun fetchCustomModel(): DataResult<List<CustomResult>>

}