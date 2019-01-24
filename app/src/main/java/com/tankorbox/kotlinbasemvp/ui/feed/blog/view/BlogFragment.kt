package com.tankorbox.kotlinbasemvp.ui.feed.blog.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tankorbox.kotlinbasemvp.R
import com.tankorbox.kotlinbasemvp.data.network.Blog
import com.tankorbox.kotlinbasemvp.ui.base.view.BaseFragment
import com.tankorbox.kotlinbasemvp.ui.feed.blog.interactor.BlogMVPInteractor
import com.tankorbox.kotlinbasemvp.ui.feed.blog.presenter.BlogMVPPresenter
import kotlinx.android.synthetic.main.fragment_blog.*
import javax.inject.Inject

class BlogFragment : BaseFragment(), BlogMVPView {

    companion object {
        fun newInstance(): BlogFragment {
            return BlogFragment()
        }
    }

    @Inject
    internal lateinit var blogAdapter: BlogAdapter
    @Inject
    internal lateinit var layoutManager: LinearLayoutManager
    @Inject
    internal lateinit var presenter: BlogMVPPresenter<BlogMVPView, BlogMVPInteractor>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        inflater.inflate(R.layout.fragment_blog, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.onAttach(this)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun setUp() {
        layoutManager.orientation = RecyclerView.VERTICAL
        blog_recycler_view.layoutManager = layoutManager
        blog_recycler_view.itemAnimator = DefaultItemAnimator()
        blog_recycler_view.adapter = blogAdapter
        presenter.onViewPrepared()
    }

    override fun displayBlogList(blogs: List<Blog>?) = blogs?.let {
        blogAdapter.addBlogsToList(it)
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }
}