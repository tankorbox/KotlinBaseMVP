package com.tankorbox.kotlinbasemvp.ui.main.interactor

import com.tankorbox.kotlinbasemvp.data.network.LogoutResponse
import com.tankorbox.kotlinbasemvp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable
import io.reactivex.Single

interface MainMVPInteractor : MVPInteractor {

    fun getQuestionCardData(): Single<List<QuestionCardData>>
    fun getUserDetails() : Pair<String?,String?>
    fun makeLogoutApiCall() : Observable<LogoutResponse>
}