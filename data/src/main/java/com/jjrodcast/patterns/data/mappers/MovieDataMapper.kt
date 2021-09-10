package com.jjrodcast.patterns.data.mappers

import com.jjrodcast.patterns.data.network.response.MovieData
import com.jjrodcast.patterns.domain.entities.Movie
import javax.inject.Inject

class MovieDataMapper @Inject constructor() {

    companion object {
        private const val IMAGE_PATH = "https://image.tmdb.org/t/p/w300/"
    }

    fun map(movieData: MovieData): Movie = with(movieData) {
        return Movie(
            id = id,
            title = title,
            overview = overview,
            popularity = popularity,
            average = average,
            count = count,
            posterPath = "$IMAGE_PATH$posterPath",
            backdropPath = "$IMAGE_PATH$backdropPath",
            releaseDate = releaseDate
        )
    }
}