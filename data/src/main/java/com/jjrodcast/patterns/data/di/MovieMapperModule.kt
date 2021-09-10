package com.jjrodcast.patterns.data.di

import com.jjrodcast.patterns.data.mappers.MovieDataMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object MovieMapperModule {
    @Provides
    fun provideMovieMapper() = MovieDataMapper()
}