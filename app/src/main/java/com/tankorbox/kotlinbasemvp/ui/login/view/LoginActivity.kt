import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.tankorbox.kotlinbasemvp.R
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginMVPView {

    @Inject
    internal lateinit var presenter: LoginMVPPresenter<LoginMVPView, LoginMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.INVALID_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.invalid_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_PASSWORD_ERROR -> Toast.makeText(this, getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
            AppConstants.LOGIN_FAILURE -> Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
        }
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun setOnClickListeners() {
        btnServerLogin.setOnClickListener { presenter.onServerLoginClicked(et_email.text.toString(), et_password.text.toString()) }
        ibGoogleLogin.setOnClickListener { presenter.onGoogleLoginClicked() }
        ibFbLogin.setOnClickListener { presenter.onFBLoginClicked() }
    }
}