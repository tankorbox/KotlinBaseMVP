package com.tankorbox.kotlinbasemvp.ui.rate.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.MVPPresenter
import com.tankorbox.kotlinbasemvp.ui.rate.interactor.RateUsMVPInterator
import com.tankorbox.kotlinbasemvp.ui.rate.view.RateUsDialogMVPView

interface RateUsMVPPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> : MVPPresenter<V, I> {

    fun onLaterOptionClicked(): Unit?
    fun onSubmitOptionClicked(): Unit?
}