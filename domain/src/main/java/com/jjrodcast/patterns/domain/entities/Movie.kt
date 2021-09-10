package com.jjrodcast.patterns.domain.entities

class Movie(
    val id: Long,
    val title: String,
    val overview: String,
    val popularity: Float,
    val average: Float,
    val count: Long,
    val posterPath: String,
    val backdropPath: String,
    val releaseDate: String
)