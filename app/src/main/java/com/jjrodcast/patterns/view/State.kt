package com.jjrodcast.patterns.view

import com.jjrodcast.patterns.domain.entities.Movie

sealed class State {
    object Loading : State()
    class Success(val data: List<Movie>) : State()
    object Error : State()
}