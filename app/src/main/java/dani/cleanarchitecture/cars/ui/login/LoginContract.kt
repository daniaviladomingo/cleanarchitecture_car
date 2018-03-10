package dani.cleanarchitecture.cars.ui.login

import dani.cleanarchitecture.cars.base.BasePresenter
import dani.cleanarchitecture.cars.base.BaseView

interface LoginContract {
    interface View: BaseView<Presenter>

    interface Presenter: BasePresenter
}