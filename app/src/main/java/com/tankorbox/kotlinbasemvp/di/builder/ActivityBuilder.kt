package com.tankorbox.kotlinbasemvp.di.builder

import com.tankorbox.kotlinbasemvp.ui.about.AboutFragmentProvider
import com.tankorbox.kotlinbasemvp.ui.feed.blog.BlogFragmentProvider
import com.tankorbox.kotlinbasemvp.ui.feed.opensource.OpenSourceFragmentProvider
import com.tankorbox.kotlinbasemvp.ui.feed.view.FeedActivity
import com.tankorbox.kotlinbasemvp.ui.login.LoginActivityModule
import com.tankorbox.kotlinbasemvp.ui.login.view.LoginActivity
import com.tankorbox.kotlinbasemvp.ui.main.MainActivityModule
import com.tankorbox.kotlinbasemvp.ui.main.view.MainActivity
import com.tankorbox.kotlinbasemvp.ui.rate.RateUsDialogFragmentProvider
import com.tankorbox.kotlinbasemvp.ui.splash.SplashActivityModule
import com.tankorbox.kotlinbasemvp.ui.splash.view.SplashMVPActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (RateUsDialogFragmentProvider::class), (AboutFragmentProvider::class)])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [(BlogFragmentProvider::class), (OpenSourceFragmentProvider::class)])
    abstract fun bindFeedActivity(): FeedActivity

}