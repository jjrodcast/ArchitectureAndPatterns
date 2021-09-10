package com.jjrodcast.patterns.data.di

import com.jjrodcast.patterns.data.datasources.MovieCloudDataSource
import com.jjrodcast.patterns.data.network.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object MovieServiceModule {

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    @Provides
    fun provideMovieCloudDataSource(service: MovieService) = MovieCloudDataSource(service)

    @Provides
    fun provideMovieService(): MovieService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieService::class.java)
    }
}