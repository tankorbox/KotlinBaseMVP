package com.tankorbox.kotlinbasemvp.ui.splash.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.MVPPresenter
import com.tankorbox.kotlinbasemvp.ui.splash.interactor.SplashMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.splash.view.SplashMVPView

interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V, I>