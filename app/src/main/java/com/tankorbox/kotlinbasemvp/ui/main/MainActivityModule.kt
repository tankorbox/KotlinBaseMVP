package com.tankorbox.kotlinbasemvp.ui.main

import com.tankorbox.kotlinbasemvp.ui.main.interactor.MainInteractor
import com.tankorbox.kotlinbasemvp.ui.main.interactor.MainMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.main.presenter.MainMVPPresenter
import com.tankorbox.kotlinbasemvp.ui.main.presenter.MainPresenter
import com.tankorbox.kotlinbasemvp.ui.main.view.MainMVPView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>)
            : MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter

}