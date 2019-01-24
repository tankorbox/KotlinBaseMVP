package com.tankorbox.kotlinbasemvp.ui.base.presenter

import com.tankorbox.kotlinbasemvp.ui.base.interactor.MVPInteractor
import com.tankorbox.kotlinbasemvp.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}