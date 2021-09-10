package com.jjrodcast.patterns

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.jjrodcast.patterns.view.State
import com.jjrodcast.patterns.viewmodel.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeChanges()
        viewModel.getMovies()

    }

    private fun observeChanges() {
        viewModel.state.observe(this) {
            when (it) {
                is State.Success -> Log.d("movies", it.data.toString())
                else -> Unit
            }
        }
    }
}