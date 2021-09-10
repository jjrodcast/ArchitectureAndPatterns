package com.jjrodcast.patterns.viewmodel

import androidx.lifecycle.*
import com.jjrodcast.patterns.domain.usecases.MovieUseCase
import com.jjrodcast.patterns.view.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(private val movieUseCase: MovieUseCase) : ViewModel() {

    private val _state = MutableLiveData<State>()

    val state: LiveData<State> get() = _state

    fun getMovies() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _state.postValue(State.Success(movieUseCase.getMovies()))
            }
        }
    }

}