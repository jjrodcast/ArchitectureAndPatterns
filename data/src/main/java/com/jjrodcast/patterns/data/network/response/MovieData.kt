package com.jjrodcast.patterns.data.network.response

import com.google.gson.annotations.SerializedName

class MovieData(
    @SerializedName("id")
    val id: Long,
    @SerializedName("title")
    val title: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("popularity")
    val popularity: Float,
    @SerializedName("vote_average")
    val average: Float,
    @SerializedName("vote_count")
    val count: Long,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("release_date")
    val releaseDate: String
)