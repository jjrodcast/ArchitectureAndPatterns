package com.jjrodcast.patterns.model

interface PeopleRepository {

    suspend fun getPeople(): List<Person>
}