package com.tankorbox.kotlinbasemvp.ui.feed.opensource.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.MVPPresenter
import com.tankorbox.kotlinbasemvp.ui.feed.opensource.interactor.OpenSourceMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.opensource.view.OpenSourceMVPView

interface OpenSourceMVPPresenter<V : OpenSourceMVPView, I : OpenSourceMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}