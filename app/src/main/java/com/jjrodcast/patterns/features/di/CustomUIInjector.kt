package com.jjrodcast.patterns.features.di

import com.jjrodcast.patterns.domain.di.CustomDomainInjector
import com.jjrodcast.patterns.domain.use_cases.CustomUseCasesImpl
import com.jjrodcast.patterns.domain.use_cases.interfaces.CustomUseCases

object CustomUIInjector {

    private var customUseCases: CustomUseCases? = null

    fun provideCustomUseCases(): CustomUseCases{
        return customUseCases ?: createCustomUseCases()
    }

    fun createCustomUseCases(): CustomUseCases{
        CustomUseCasesImpl(CustomDomainInjector.provideCustomRepository()).apply {
            customUseCases = this
            return this
        }
    }

    fun setCustomUseCases(useCases: CustomUseCases){
        customUseCases = useCases
    }

}