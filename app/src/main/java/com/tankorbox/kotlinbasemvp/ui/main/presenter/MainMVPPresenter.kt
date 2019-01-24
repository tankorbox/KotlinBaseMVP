package com.tankorbox.kotlinbasemvp.ui.main.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.MVPPresenter
import com.tankorbox.kotlinbasemvp.ui.main.interactor.MainMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.main.view.MainMVPView

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

    fun refreshQuestionCards(): Boolean?
    fun onDrawerOptionAboutClick() : Unit?
    fun onDrawerOptionRateUsClick(): Unit?
    fun onDrawerOptionFeedClick(): Unit?
    fun onDrawerOptionLogoutClick()

}