package com.tankorbox.kotlinbasemvp.ui.splash.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.BasePresenter
import com.tankorbox.kotlinbasemvp.ui.splash.interactor.SplashMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.splash.view.SplashMVPView
import com.tankorbox.kotlinbasemvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SplashPresenter<V : SplashMVPView, I : SplashMVPInteractor> @Inject internal constructor(
    interactor: I,
    schedulerProvider: SchedulerProvider,
    disposable: CompositeDisposable
) : BasePresenter<V, I>(
    interactor = interactor,
    schedulerProvider = schedulerProvider,
    compositeDisposable = disposable
), SplashMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        feedInDatabase()
    }

    private fun feedInDatabase() = interactor?.let {
        compositeDisposable.add(it.seedQuestions()
            .flatMap { interactor?.seedOptions() }
            .compose(schedulerProvider.ioToMainObservableScheduler())
            .subscribe {
                getView()?.let { decideActivityToOpen() }
            }
        )
    }

    private fun decideActivityToOpen() = getView()?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        else
            it.openLoginActivity()
    }

    private fun isUserLoggedIn(): Boolean {
        interactor?.let { return it.isUserLoggedIn() }
        return false
    }

}