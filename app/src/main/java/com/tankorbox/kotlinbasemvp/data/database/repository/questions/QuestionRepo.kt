package com.tankorbox.kotlinbasemvp.data.database.repository.questions

import io.reactivex.Observable

interface QuestionRepo {

    fun isQuestionsRepoEmpty(): Observable<Boolean>

    fun insertQuestions(questions: List<Question>): Observable<Boolean>

    fun loadQuestions(): Observable<List<Question>>
}