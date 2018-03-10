package dani.cleanarchitecture.cars.ui.cars

import dani.cleanarchitecture.cars.base.BasePresenter
import dani.cleanarchitecture.cars.base.BaseView

interface CarsContract {
    interface View: BaseView<Presenter>

    interface Presenter: BasePresenter
}