package com.jjrodcast.patterns.features.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class SplashViewModel(private val customUseCases: CustomUseCases,
                      private val dispatcher: CoroutineDispatcher = Dispatchers.IO) : ViewModel() {

    private val _uiState = MutableLiveData<SplashUIState> (SplashUIState.Default)
    val uiState: LiveData<SplashUIState> = _uiState

}