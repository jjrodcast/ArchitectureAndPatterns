package com.jjrodcast.patterns.di

import com.jjrodcast.patterns.domain.dispatchers.IoDispatcher
import com.jjrodcast.patterns.domain.dispatchers.MainDispatcher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier

@Module
@InstallIn(ViewModelComponent::class)
object DispatchersModule {

    @Provides
    @IoDispatcher
    fun providesIODispatcher() = Dispatchers.IO

    @Provides
    @MainDispatcher
    fun providesMainDispatcher() = Dispatchers.Main

}