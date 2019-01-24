package com.tankorbox.kotlinbasemvp.ui.feed.opensource.view

import com.tankorbox.kotlinbasemvp.data.network.OpenSource
import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView

interface OpenSourceMVPView : MVPView {
    fun displayOpenSourceList(blogs: List<OpenSource>?)

}