package dani.cleanarchitecture.domain.interactor.type

import io.reactivex.Scheduler
import io.reactivex.Single

abstract class SingleUseCase<T>(private val backgroundScheduler: Scheduler,
                                private val uiScheduler: Scheduler) {

    fun execute(): Single<T> = observable().observeOn(backgroundScheduler).subscribeOn(uiScheduler)

    protected abstract fun observable() : Single<T>
}