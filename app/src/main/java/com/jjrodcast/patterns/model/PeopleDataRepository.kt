package com.jjrodcast.patterns.model

class PeopleDataRepository: PeopleRepository {

    override suspend fun getPeople(): List<Person> {
        TODO("Retornar lista de personas")
    }
}