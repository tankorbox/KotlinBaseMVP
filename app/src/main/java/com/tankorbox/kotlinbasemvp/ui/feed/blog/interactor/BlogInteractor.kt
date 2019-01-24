package com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor

import com.tankorbox.kotlinbasemvp.data.network.ApiHelper
import com.tankorbox.kotlinbasemvp.data.preferences.PreferenceHelper
import com.tankorbox.kotlinbasemvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class BlogInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) :
    BaseInteractor(preferenceHelper, apiHelper), BlogMVPInteractor {

    override fun getBlogList() = apiHelper.getBlogApiCall()

}