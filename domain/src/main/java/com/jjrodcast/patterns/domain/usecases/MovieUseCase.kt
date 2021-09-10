package com.jjrodcast.patterns.domain.usecases

import com.jjrodcast.patterns.domain.repositories.MovieRepository
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    suspend fun getMovies() = movieRepository.getMovies()
}