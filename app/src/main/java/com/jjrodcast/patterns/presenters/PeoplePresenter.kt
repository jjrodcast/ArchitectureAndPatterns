package com.jjrodcast.patterns.presenters

import com.jjrodcast.patterns.interfaces.PeopleInteractor
import com.jjrodcast.patterns.interfaces.PeopleView
import com.jjrodcast.patterns.models.PeopleDataRepository

class PeoplePresenter(
    private val view: PeopleView
) : PeopleInteractor.OnPeopleReady {

    private val interactor: PeopleInteractor by lazy { PeopleInteractor(PeopleDataRepository()) }

    fun getPeople() {
        interactor.getPeople()
    }

    override fun hideLoading() {
        view.hideProgress()
    }

    override fun showLoading() {
        view.showProgress()
    }

    override fun showError() {
        view.showError()
    }

}