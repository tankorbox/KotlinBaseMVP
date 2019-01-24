package com.tankorbox.kotlinbasemvp.ui.feed.opensource.interactor

import com.tankorbox.kotlinbasemvp.data.network.OpenSourceResponse
import com.tankorbox.kotlinbasemvp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface OpenSourceMVPInteractor : MVPInteractor {

    fun getOpenSourceList(): Observable<OpenSourceResponse>
}