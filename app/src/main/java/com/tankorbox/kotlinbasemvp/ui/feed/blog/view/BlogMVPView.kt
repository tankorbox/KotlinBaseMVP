package com.tankorbox.kotlinbasemvp.ui.feed.blog.view

import com.tankorbox.kotlinbasemvp.data.network.Blog
import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView

interface BlogMVPView : MVPView {

    fun displayBlogList(blogs: List<Blog>?): Unit?

}