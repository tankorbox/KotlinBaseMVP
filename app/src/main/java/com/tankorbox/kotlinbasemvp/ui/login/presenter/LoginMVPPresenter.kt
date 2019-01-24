package com.tankorbox.kotlinbasemvp.ui.login.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.MVPPresenter
import com.tankorbox.kotlinbasemvp.ui.login.interactor.LoginMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.login.view.LoginMVPView

interface LoginMVPPresenter<V : LoginMVPView, I : LoginMVPInteractor> : MVPPresenter<V, I> {

    fun onServerLoginClicked(email: String, password: String)
    fun onFBLoginClicked()
    fun onGoogleLoginClicked()

}