package com.tankorbox.kotlinbasemvp.ui.login.interactor

import com.tankorbox.kotlinbasemvp.data.network.LoginResponse
import com.tankorbox.kotlinbasemvp.ui.base.interactor.MVPInteractor
import com.tankorbox.kotlinbasemvp.util.AppConstants
import io.reactivex.Observable

interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>

    fun doFBLoginApiCall(): Observable<LoginResponse>

    fun doGoogleLoginApiCall(): Observable<LoginResponse>

    fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode)

}