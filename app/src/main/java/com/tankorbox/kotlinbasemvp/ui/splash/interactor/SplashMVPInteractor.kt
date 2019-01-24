package com.tankorbox.kotlinbasemvp.ui.splash.interactor

import com.tankorbox.kotlinbasemvp.data.database.repository.questions.Question
import com.tankorbox.kotlinbasemvp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface SplashMVPInteractor : MVPInteractor {

    fun seedQuestions(): Observable<Boolean>
    fun seedOptions(): Observable<Boolean>
    fun getQuestion() : Observable<List<Question>>

}