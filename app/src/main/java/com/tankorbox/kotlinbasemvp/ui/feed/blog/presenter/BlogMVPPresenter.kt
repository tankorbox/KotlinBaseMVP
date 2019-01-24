package com.tankorbox.kotlinbasemvp.ui.feed.blog.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.MVPPresenter
import com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor.BlogMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogMVPView

interface BlogMVPPresenter<V : BlogMVPView, I : BlogMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}