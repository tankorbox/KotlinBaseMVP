package com.tankorbox.kotlinbasemvp.ui.main.interactor

import com.tankorbox.kotlinbasemvp.data.database.repository.options.Options
import com.tankorbox.kotlinbasemvp.data.database.repository.questions.Question

data class QuestionCardData(val option: List<Options>, val question: Question)