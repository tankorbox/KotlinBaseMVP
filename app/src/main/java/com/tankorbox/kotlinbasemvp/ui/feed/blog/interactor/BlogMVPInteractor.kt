package com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor

import com.tankorbox.kotlinbasemvp.data.network.BlogResponse
import com.tankorbox.kotlinbasemvp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface BlogMVPInteractor : MVPInteractor {

    fun getBlogList(): Observable<BlogResponse>

}