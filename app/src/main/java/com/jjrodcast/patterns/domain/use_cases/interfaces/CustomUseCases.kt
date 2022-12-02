package com.jjrodcast.patterns.domain.use_cases.interfaces

import com.jjrodcast.patterns.core.message.DataResult
import com.jjrodcast.patterns.domain.models.CustomResult

interface CustomUseCases {

    suspend fun getCustomExamples() : DataResult<List<CustomResult>>

}