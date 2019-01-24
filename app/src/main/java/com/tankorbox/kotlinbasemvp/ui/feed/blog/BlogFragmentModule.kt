package com.tankorbox.kotlinbasemvp.ui.feed.blog

import androidx.recyclerview.widget.LinearLayoutManager
import com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor.BlogInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor.BlogMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.blog.presenter.BlogMVPPresenter
import com.tankorbox.kotlinbasemvp.ui.feed.blog.presenter.BlogPresenter
import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogAdapter
import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogFragment
import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogMVPView
import dagger.Module
import dagger.Provides

@Module
class BlogFragmentModule {

    @Provides
    internal fun provideBlogInteractor(interactor: BlogInteractor): BlogMVPInteractor = interactor

    @Provides
    internal fun provideBlogPresenter(presenter: BlogPresenter<BlogMVPView, BlogMVPInteractor>)
            : BlogMVPPresenter<BlogMVPView, BlogMVPInteractor> = presenter

    @Provides
    internal fun provideBlogAdapter(): BlogAdapter = BlogAdapter(ArrayList())

    @Provides
    internal fun provideLinearLayoutManager(fragment: BlogFragment): LinearLayoutManager = LinearLayoutManager(fragment.activity)

}