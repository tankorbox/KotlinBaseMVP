package com.tankorbox.kotlinbasemvp.ui.feed.blog.presenter

import com.tankorbox.kotlinbasemvp.ui.base.presenter.BasePresenter
import com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor.BlogMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogMVPView
import com.tankorbox.kotlinbasemvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class BlogPresenter<V : BlogMVPView, I : BlogMVPInteractor> @Inject constructor(interactor: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), BlogMVPPresenter<V, I> {

    override fun onViewPrepared() {
        getView()?.showProgress()
        interactor?.let {
            it.getBlogList()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe { blogResponse ->
                        getView()?.let {
                            it.hideProgress()
                            it.displayBlogList(blogResponse.data)
                        }
                    }
        }
    }
}