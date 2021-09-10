package com.jjrodcast.patterns.data.di

import com.jjrodcast.patterns.data.repositories.MovieDataRepository
import com.jjrodcast.patterns.domain.repositories.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class MovieRepositoryModule {

    @Binds
    abstract fun bindMovieRepository(movieRepository: MovieDataRepository): MovieRepository
}