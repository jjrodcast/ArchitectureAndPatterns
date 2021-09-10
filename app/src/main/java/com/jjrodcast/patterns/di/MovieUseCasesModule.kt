package com.jjrodcast.patterns.di

import com.jjrodcast.patterns.domain.repositories.MovieRepository
import com.jjrodcast.patterns.domain.usecases.MovieUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object MovieUseCasesModule {

    @Provides
    fun provideMovieUseCase(movieRepository: MovieRepository) = MovieUseCase(movieRepository)
}