package com.jjrodcast.patterns.data.network.response

import com.google.gson.annotations.SerializedName


class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieData> = emptyList()
)