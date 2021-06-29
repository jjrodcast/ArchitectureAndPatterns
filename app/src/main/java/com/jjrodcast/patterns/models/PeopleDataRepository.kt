package com.jjrodcast.patterns.models

import com.jjrodcast.patterns.interfaces.PeopleRepository

class PeopleDataRepository : PeopleRepository {

    override fun getPeople(): List<Person> {
        TODO("Implement the data sources to provide list of Person")
    }
}