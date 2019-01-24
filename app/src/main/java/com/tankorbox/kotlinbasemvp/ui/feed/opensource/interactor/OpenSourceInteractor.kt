package com.tankorbox.kotlinbasemvp.ui.feed.opensource.interactor

import com.tankorbox.kotlinbasemvp.data.network.ApiHelper
import com.tankorbox.kotlinbasemvp.data.network.OpenSourceResponse
import com.tankorbox.kotlinbasemvp.data.preferences.PreferenceHelper
import com.tankorbox.kotlinbasemvp.ui.base.interactor.BaseInteractor
import io.reactivex.Observable
import javax.inject.Inject

class OpenSourceInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), OpenSourceMVPInteractor {

    override fun getOpenSourceList(): Observable<OpenSourceResponse> {
        return apiHelper.getOpenSourceApiCall()
    }

}