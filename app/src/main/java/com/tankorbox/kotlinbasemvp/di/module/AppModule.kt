package com.tankorbox.kotlinbasemvp.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.tankorbox.kotlinbasemvp.BuildConfig
import com.tankorbox.kotlinbasemvp.data.database.AppDatabase
import com.tankorbox.kotlinbasemvp.data.database.repository.options.OptionsRepo
import com.tankorbox.kotlinbasemvp.data.database.repository.options.OptionsRepository
import com.tankorbox.kotlinbasemvp.data.database.repository.questions.QuestionRepo
import com.tankorbox.kotlinbasemvp.data.database.repository.questions.QuestionRepository
import com.tankorbox.kotlinbasemvp.data.network.ApiHeader
import com.tankorbox.kotlinbasemvp.data.network.ApiHelper
import com.tankorbox.kotlinbasemvp.data.network.AppApiHelper
import com.tankorbox.kotlinbasemvp.data.preferences.AppPreferenceHelper
import com.tankorbox.kotlinbasemvp.data.preferences.PreferenceHelper
import com.tankorbox.kotlinbasemvp.di.ApiKeyInfo
import com.tankorbox.kotlinbasemvp.di.PreferenceInfo
import com.tankorbox.kotlinbasemvp.util.AppConstants
import com.tankorbox.kotlinbasemvp.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).build()

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(apiKey = apiKey,
            userId = preferenceHelper.getCurrentUserId(),
            accessToken = preferenceHelper.getAccessToken())

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    @Singleton
    internal fun provideQuestionRepoHelper(appDatabase: AppDatabase): QuestionRepo = QuestionRepository(appDatabase.questionsDao())

    @Provides
    @Singleton
    internal fun provideOptionsRepoHelper(appDatabase: AppDatabase): OptionsRepo = OptionsRepository(appDatabase.optionsDao())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()


}