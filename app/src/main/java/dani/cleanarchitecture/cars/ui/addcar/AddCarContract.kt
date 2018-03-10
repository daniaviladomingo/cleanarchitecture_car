package dani.cleanarchitecture.cars.ui.addcar

import dani.cleanarchitecture.cars.base.BasePresenter
import dani.cleanarchitecture.cars.base.BaseView

interface AddCarContract {
    interface View: BaseView<Presenter>

    interface Presenter: BasePresenter
}