package com.jjrodcast.patterns.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjrodcast.patterns.model.PeopleRepository
import com.jjrodcast.patterns.view.State
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PeopleViewModel(private val peopleRepository: PeopleRepository) : ViewModel() {

    private val _state = MutableLiveData<State>()

    val state: LiveData<State> get() = _state

    // TODO("Refactorizar para obtener resultados de error")
    fun gePeople() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _state.postValue(State.Success(peopleRepository.getPeople()))
            }
        }
    }

}