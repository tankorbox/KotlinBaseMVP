package com.tankorbox.kotlinbasemvp.ui.login

import com.tankorbox.kotlinbasemvp.ui.login.interactor.LoginInteractor
import com.tankorbox.kotlinbasemvp.ui.login.interactor.LoginMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.login.presenter.LoginMVPPresenter
import com.tankorbox.kotlinbasemvp.ui.login.presenter.LoginPresenter
import com.tankorbox.kotlinbasemvp.ui.login.view.LoginMVPView
import dagger.Module
import dagger.Provides

@Module
class LoginActivityModule {

    @Provides
    internal fun provideLoginInteractor(interactor: LoginInteractor): LoginMVPInteractor = interactor

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter<LoginMVPView, LoginMVPInteractor>)
            : LoginMVPPresenter<LoginMVPView, LoginMVPInteractor> = presenter

}