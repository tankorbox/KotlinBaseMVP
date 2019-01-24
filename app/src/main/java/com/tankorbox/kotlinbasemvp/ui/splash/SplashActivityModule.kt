package com.tankorbox.kotlinbasemvp.ui.splash

import com.tankorbox.kotlinbasemvp.ui.splash.interactor.SplashInteractor
import com.tankorbox.kotlinbasemvp.ui.splash.interactor.SplashMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.splash.presenter.SplashMVPPresenter
import com.tankorbox.kotlinbasemvp.ui.splash.presenter.SplashPresenter
import com.tankorbox.kotlinbasemvp.ui.splash.view.SplashMVPView
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter
}