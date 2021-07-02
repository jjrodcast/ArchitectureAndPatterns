package com.jjrodcast.patterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjrodcast.patterns.model.PeopleDataRepository
import com.jjrodcast.patterns.viewmodel.PeopleViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy { PeopleViewModel(PeopleDataRepository()) }

    /**
     * TODO("Crear UI")
     *
     * 1. Crear el diseño para mostrar una lista de personas
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.gePeople()

    }

    private fun observeChanges() {
        viewModel.state.observe(this) {
            // TODO(Enviar los datos del estado para mostrar los datos en la lista)
        }
    }
}