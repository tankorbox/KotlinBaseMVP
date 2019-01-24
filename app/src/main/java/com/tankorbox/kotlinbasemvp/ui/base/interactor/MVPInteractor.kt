package com.tankorbox.kotlinbasemvp.ui.base.interactor

interface MVPInteractor {

    fun isUserLoggedIn(): Boolean

    fun performUserLogout()

}