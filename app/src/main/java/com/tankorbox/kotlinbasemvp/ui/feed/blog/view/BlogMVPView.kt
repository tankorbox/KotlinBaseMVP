interface BlogMVPView : MVPView {

    fun displayBlogList(blogs: List<Blog>?): Unit?

}