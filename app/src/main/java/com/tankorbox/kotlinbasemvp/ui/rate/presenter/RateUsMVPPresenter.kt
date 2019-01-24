interface RateUsMVPPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> : MVPPresenter<V, I> {

    fun onLaterOptionClicked(): Unit?
    fun onSubmitOptionClicked(): Unit?
}