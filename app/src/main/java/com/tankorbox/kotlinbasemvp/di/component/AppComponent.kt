package com.tankorbox.kotlinbasemvp.di.component

import android.app.Application
import com.tankorbox.kotlinbasemvp.MvpApp
import com.tankorbox.kotlinbasemvp.di.builder.ActivityBuilder
import com.tankorbox.kotlinbasemvp.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MvpApp)

}