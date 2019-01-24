package com.tankorbox.kotlinbasemvp.ui.main.view

import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView
import com.tankorbox.kotlinbasemvp.ui.main.interactor.QuestionCardData

interface MainMVPView : MVPView {

    fun inflateUserDetails(userDetails: Pair<String?, String?>)
    fun displayQuestionCard(questionCard: List<QuestionCardData>)
    fun openLoginActivity()
    fun openFeedActivity()
    fun openAboutFragment()
    fun openRateUsDialog(): Unit?
    fun lockDrawer(): Unit?
    fun unlockDrawer(): Unit?
}