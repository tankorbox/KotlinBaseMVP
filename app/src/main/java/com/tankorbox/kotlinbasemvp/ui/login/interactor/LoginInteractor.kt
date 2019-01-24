import javax.inject.Inject

class LoginInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), LoginMVPInteractor {

    override fun doGoogleLoginApiCall() =
            apiHelper.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))

    override fun doFBLoginApiCall() =
            apiHelper.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))


    override fun doServerLoginApiCall(email: String, password: String) =
            apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))


    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }
}