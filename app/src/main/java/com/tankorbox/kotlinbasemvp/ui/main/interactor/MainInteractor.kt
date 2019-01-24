import javax.inject.Inject

class MainInteractor @Inject internal constructor(
    private val questionRepoHelper: QuestionRepo,
    private val optionsRepoHelper: OptionsRepo,
    preferenceHelper: PreferenceHelper,
    apiHelper: ApiHelper
) : BaseInteractor(preferenceHelper = preferenceHelper, apiHelper = apiHelper),
    MainMVPInteractor {

    override fun getQuestionCardData() = questionRepoHelper.loadQuestions()
        .flatMapIterable { question -> question }
        .flatMapSingle { question -> getQuestionCards(question) }
        .toList()

    override fun getUserDetails() = Pair(
        preferenceHelper.getCurrentUserName(),
        preferenceHelper.getCurrentUserEmail()
    )

    override fun makeLogoutApiCall() = apiHelper.performLogoutApiCall()

    private fun getQuestionCards(question: Question) = optionsRepoHelper.loadOptions(question.id)
        .map { options -> createQuestionCard(options, question) }

    private fun createQuestionCard(options: List<Options>, question: Question) = QuestionCardData(options, question)

}


