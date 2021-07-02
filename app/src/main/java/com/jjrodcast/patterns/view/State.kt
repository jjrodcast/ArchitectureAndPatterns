package com.jjrodcast.patterns.view

import com.jjrodcast.patterns.model.Person

sealed class State {
    object Loading : State()
    class Success(val data: List<Person>) : State()
    object Error : State()
}