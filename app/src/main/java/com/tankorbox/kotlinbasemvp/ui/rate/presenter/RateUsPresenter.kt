package com.tankorbox.kotlinbasemvp.ui.rate.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.BasePresenter
import com.tankorbox.kotlinbasemvp.ui.rate.interactor.RateUsMVPInterator
import com.tankorbox.kotlinbasemvp.ui.rate.view.RateUsDialogMVPView
import com.tankorbox.kotlinbasemvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class RateUsPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> @Inject internal constructor(
    interator: I,
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable
) : BasePresenter<V, I>(
    interactor = interator,
    schedulerProvider = schedulerProvider,
    compositeDisposable = compositeDisposable
), RateUsMVPPresenter<V, I> {

    override fun onLaterOptionClicked() = getView()?.let { it.dismissDialog() }

    override fun onSubmitOptionClicked() = interactor?.let {
        it.submitRating()
        getView()?.let {
            it.showRatingSubmissionSuccessMessage()
            it.dismissDialog()
        }
    }
}
