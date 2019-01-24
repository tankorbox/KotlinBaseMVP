package com.tankorbox.kotlinbasemvp.ui.about

import com.tankorbox.kotlinbasemvp.ui.about.view.AboutFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AboutFragmentProvider {

    @ContributesAndroidInjector
    internal abstract fun provideAboutFragment(): AboutFragment

}