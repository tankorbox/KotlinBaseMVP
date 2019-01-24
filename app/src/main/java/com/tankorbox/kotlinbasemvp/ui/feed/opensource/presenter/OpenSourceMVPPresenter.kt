
interface OpenSourceMVPPresenter<V : OpenSourceMVPView, I : OpenSourceMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}