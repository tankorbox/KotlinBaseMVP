package com.tankorbox.kotlinbasemvp.ui.rate

import com.tankorbox.kotlinbasemvp.ui.rate.interactor.RateUsInteractor
import com.tankorbox.kotlinbasemvp.ui.rate.interactor.RateUsMVPInterator
import com.tankorbox.kotlinbasemvp.ui.rate.presenter.RateUsMVPPresenter
import com.tankorbox.kotlinbasemvp.ui.rate.presenter.RateUsPresenter
import com.tankorbox.kotlinbasemvp.ui.rate.view.RateUsDialogMVPView
import dagger.Module
import dagger.Provides

@Module
class RateUsFragmentModule {

    @Provides
    internal fun provideRateUsInteractor(interactor: RateUsInteractor): RateUsMVPInterator = interactor

    @Provides
    internal fun provideRateUsPresenter(presenter: RateUsPresenter<RateUsDialogMVPView, RateUsMVPInterator>)
            : RateUsMVPPresenter<RateUsDialogMVPView, RateUsMVPInterator> = presenter
}