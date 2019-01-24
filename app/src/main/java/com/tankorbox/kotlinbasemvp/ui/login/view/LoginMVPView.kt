package com.tankorbox.kotlinbasemvp.ui.login.view

import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView

interface LoginMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}