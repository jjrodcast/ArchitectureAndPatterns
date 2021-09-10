package com.jjrodcast.patterns.domain.repositories

import com.jjrodcast.patterns.domain.entities.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>
}