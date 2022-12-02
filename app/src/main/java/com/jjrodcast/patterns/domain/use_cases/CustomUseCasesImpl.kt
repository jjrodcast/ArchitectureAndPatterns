package com.jjrodcast.patterns.domain.use_cases

import com.jjrodcast.patterns.core.message.DataResult
import com.jjrodcast.patterns.data.repository.interfaces.CustomRepository
import com.jjrodcast.patterns.domain.models.CustomResult
import com.jjrodcast.patterns.domain.use_cases.interfaces.CustomUseCases

internal class CustomUseCasesImpl(private val customRepository: CustomRepository): CustomUseCases {

    override suspend fun getCustomExamples(): DataResult<List<CustomResult>> {
        return customRepository.fetchCustomModel()
    }

}