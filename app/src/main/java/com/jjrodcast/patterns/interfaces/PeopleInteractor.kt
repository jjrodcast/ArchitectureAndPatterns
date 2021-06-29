package com.jjrodcast.patterns.interfaces

class PeopleInteractor(private val repository: PeopleRepository) {

    fun getPeople() = repository.getPeople()

    interface OnPeopleReady {
        fun showLoading()
        fun showError()
        fun hideLoading()
    }
}