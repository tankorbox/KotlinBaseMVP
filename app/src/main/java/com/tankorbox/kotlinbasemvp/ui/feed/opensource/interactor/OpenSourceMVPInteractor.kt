import io.reactivex.Observable

interface OpenSourceMVPInteractor : MVPInteractor {

    fun getOpenSourceList(): Observable<OpenSourceResponse>
}