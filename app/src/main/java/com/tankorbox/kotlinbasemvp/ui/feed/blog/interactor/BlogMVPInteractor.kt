import io.reactivex.Observable

interface BlogMVPInteractor : MVPInteractor {

    fun getBlogList(): Observable<BlogResponse>

}