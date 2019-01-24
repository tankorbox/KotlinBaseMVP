package com.tankorbox.kotlinbasemvp.ui.feed

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.tankorbox.kotlinbasemvp.ui.feed.blog.view.BlogFragment
import com.tankorbox.kotlinbasemvp.ui.feed.opensource.view.OpenSourceFragment

class FeedPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    private var tabCount = 0

    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> BlogFragment.newInstance()
            1 -> OpenSourceFragment.newInstance()
            else -> null
        }
    }

    internal fun setCount(count: Int) {
        this.tabCount = count
    }

}