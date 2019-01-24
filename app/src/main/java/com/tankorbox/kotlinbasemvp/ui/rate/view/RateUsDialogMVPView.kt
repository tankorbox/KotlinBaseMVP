package com.tankorbox.kotlinbasemvp.ui.rate.view

import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView

interface RateUsDialogMVPView : MVPView {

    fun dismissDialog()
    fun showRatingSubmissionSuccessMessage()
}