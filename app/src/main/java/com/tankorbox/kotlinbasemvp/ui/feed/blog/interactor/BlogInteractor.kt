import javax.inject.Inject

class BlogInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) :
    BaseInteractor(preferenceHelper, apiHelper), BlogMVPInteractor {

    override fun getBlogList() = apiHelper.getBlogApiCall()

}