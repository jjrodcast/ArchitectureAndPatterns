package com.jjrodcast.patterns.data.repositories

import com.jjrodcast.patterns.data.datasources.MovieCloudDataSource
import com.jjrodcast.patterns.data.mappers.MovieDataMapper
import com.jjrodcast.patterns.domain.dispatchers.IoDispatcher
import com.jjrodcast.patterns.domain.entities.Movie
import com.jjrodcast.patterns.domain.repositories.MovieRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieDataRepository @Inject constructor(
    @IoDispatcher private val dispatcher: CoroutineDispatcher,
    private val movieCloudDataSource: MovieCloudDataSource,
    private val movieMapper: MovieDataMapper
) : MovieRepository {

    override suspend fun getMovies(): List<Movie> {
        return withContext(dispatcher) {
            movieCloudDataSource.getMovies().map { movieMapper.map(it) }
        }
    }
}