package com.jjrodcast.patterns.domain.di

import com.jjrodcast.patterns.data.di.CustomDataInjector
import com.jjrodcast.patterns.data.repository.CustomRepositoryImpl
import com.jjrodcast.patterns.data.repository.interfaces.CustomRepository

internal object CustomDomainInjector {

    private var customRepository: CustomRepository? = null

    fun provideCustomRepository() = customRepository ?: createCustomRepository()

    private fun createCustomRepository(): CustomRepository{
        CustomRepositoryImpl(CustomDataInjector.provideCustomRemoteDataSource()).apply {
            customRepository = this
            return this
        }
    }

}