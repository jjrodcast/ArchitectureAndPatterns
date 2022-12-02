package com.jjrodcast.patterns.core.extensions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

internal fun <T : ViewModel> T.createFactory(): ViewModelProvider.Factory{
    val viewModel = this
    return object : ViewModelProvider.Factory{
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T = viewModel as T
    }
}