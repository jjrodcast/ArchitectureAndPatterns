package com.jjrodcast.patterns.data.datasources

import com.jjrodcast.patterns.data.network.MovieService
import javax.inject.Inject

class MovieCloudDataSource @Inject constructor(private val service: MovieService) {


    suspend fun getMovies() = service.getPopularMovies(API_KEY, LANG, PAGE).results

    companion object {
        private const val API_KEY = "595a5ae969931649fc8e0d0ac37ec387"
        private const val PAGE = 1
        private const val LANG = "es-ES"

    }
}