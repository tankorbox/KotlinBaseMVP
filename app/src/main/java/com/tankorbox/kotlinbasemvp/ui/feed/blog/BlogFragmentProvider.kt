package com.tankorbox.kotlinbasemvp.ui.feed.blog

import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class BlogFragmentProvider {

    @ContributesAndroidInjector(modules = [BlogFragmentModule::class])
    internal abstract fun provideBlogFragmentFactory(): BlogFragment
}