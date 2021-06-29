package com.jjrodcast.patterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jjrodcast.patterns.interfaces.PeopleView
import com.jjrodcast.patterns.models.Person
import com.jjrodcast.patterns.presenters.PeoplePresenter


// TODO("Tasks")
/**
 * 1. Add views to show a list of people (modify the activity_main)
 * 2. Implement the logic to populate the list of people
 */
class MainActivity : AppCompatActivity(), PeopleView {

    private val presenter by lazy { PeoplePresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.getPeople()

    }

    override fun updatePeople(people: List<Person>) {
        TODO("Not yet implemented")
    }

    override fun showProgress() {
        //TODO(Show the progress)
    }

    override fun hideProgress() {
        TODO("Hide the progress")
    }

    override fun showError() {
        TODO("Not yet implemented")
    }

}