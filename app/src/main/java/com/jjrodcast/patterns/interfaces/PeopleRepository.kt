package com.jjrodcast.patterns.interfaces

import com.jjrodcast.patterns.models.Person


interface PeopleRepository {

    fun getPeople(): List<Person>
}