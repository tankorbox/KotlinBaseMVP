package com.tankorbox.kotlinbasemvp.ui.feed.opensource.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.BasePresenter
import com.tankorbox.kotlinbasemvp.ui.feed.opensource.interactor.OpenSourceMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.opensource.view.OpenSourceMVPView
import com.tankorbox.kotlinbasemvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class OpenSourcePresenter<V : OpenSourceMVPView, I : OpenSourceMVPInteractor> @Inject constructor(
    interactor: I,
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable
) : BasePresenter<V, I>(
    interactor = interactor,
    schedulerProvider = schedulerProvider,
    compositeDisposable = compositeDisposable
), OpenSourceMVPPresenter<V, I> {

    override fun onViewPrepared() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.getOpenSourceList()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe { openSourceResponse ->
                    getView()?.let {
                        it.hideProgress()
                        it.displayOpenSourceList(openSourceResponse.data)
                    }
                })
        }

    }
}