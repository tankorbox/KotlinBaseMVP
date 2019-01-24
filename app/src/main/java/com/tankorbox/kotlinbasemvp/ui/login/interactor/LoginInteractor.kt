package com.tankorbox.kotlinbasemvp.ui.login.interactor

import com.tankorbox.kotlinbasemvp.data.network.ApiHelper
import com.tankorbox.kotlinbasemvp.data.network.LoginRequest
import com.tankorbox.kotlinbasemvp.data.network.LoginResponse
import com.tankorbox.kotlinbasemvp.data.preferences.PreferenceHelper
import com.tankorbox.kotlinbasemvp.ui.base.interactor.BaseInteractor
import com.tankorbox.kotlinbasemvp.util.AppConstants
import javax.inject.Inject

class LoginInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) :
    BaseInteractor(preferenceHelper, apiHelper), LoginMVPInteractor {

    override fun doGoogleLoginApiCall() =
        apiHelper.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))

    override fun doFBLoginApiCall() =
        apiHelper.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))


    override fun doServerLoginApiCall(email: String, password: String) =
        apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))


    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
        preferenceHelper.let {
            it.setCurrentUserId(loginResponse.userId)
            it.setAccessToken(loginResponse.accessToken)
            it.setCurrentUserLoggedInMode(loggedInMode)
        }
}