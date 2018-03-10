package dani.cleanarchitecture.cars.base

interface BaseView<in T:  BasePresenter> {
    fun setPresenter(presenter: T)
}