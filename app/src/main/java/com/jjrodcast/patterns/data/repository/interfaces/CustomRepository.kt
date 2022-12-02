package com.jjrodcast.patterns.data.repository.interfaces

import com.jjrodcast.patterns.core.message.DataResult
import com.jjrodcast.patterns.domain.models.CustomResult

internal interface CustomRepository {

    suspend fun fetchCustomModel(): DataResult<List<CustomResult>>

}