package com.tankorbox.kotlinbasemvp.ui.splash.view

import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView

interface SplashMVPView : MVPView {

    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
    fun openLoginActivity()
}