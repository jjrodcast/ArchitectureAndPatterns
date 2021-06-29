package com.jjrodcast.patterns.interfaces

import com.jjrodcast.patterns.models.Person

interface PeopleView {

    fun updatePeople(people: List<Person>)
    fun showProgress()
    fun showError()
    fun hideProgress()
}