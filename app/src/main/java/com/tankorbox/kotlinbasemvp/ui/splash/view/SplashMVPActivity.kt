package com.tankorbox.kotlinbasemvp.ui.splash.view

import android.content.Intent
import android.os.Bundle
import com.tankorbox.kotlinbasemvp.R
import com.tankorbox.kotlinbasemvp.ui.base.view.BaseActivity
import com.tankorbox.kotlinbasemvp.ui.login.view.LoginActivity
import com.tankorbox.kotlinbasemvp.ui.main.view.MainActivity
import com.tankorbox.kotlinbasemvp.ui.splash.interactor.SplashMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.splash.presenter.SplashMVPPresenter
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
