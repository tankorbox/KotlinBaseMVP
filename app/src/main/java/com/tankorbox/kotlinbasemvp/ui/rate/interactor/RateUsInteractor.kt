package com.tankorbox.kotlinbasemvp.ui.rate.interactor

import com.tankorbox.kotlinbasemvp.data.network.ApiHelper
import com.tankorbox.kotlinbasemvp.data.preferences.PreferenceHelper
import com.tankorbox.kotlinbasemvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class RateUsInteractor @Inject internal constructor(apiHelper: ApiHelper, preferenceHelper: PreferenceHelper) :
    BaseInteractor(apiHelper = apiHelper, preferenceHelper = preferenceHelper), RateUsMVPInterator {

    override fun submitRating() {}
}