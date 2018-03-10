package dani.cleanarchitecture.cars.ui.detailcar

import dani.cleanarchitecture.cars.base.BasePresenter
import dani.cleanarchitecture.cars.base.BaseView

/**
 * Created by dani on 10/03/18.
 */
interface DetailCarContract {
    interface View: BaseView<Presenter>

    interface Presenter: BasePresenter
}