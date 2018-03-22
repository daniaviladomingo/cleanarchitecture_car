package com.turismonovo.cerdedocobate.domain.interactors.base

import io.reactivex.Scheduler
import io.reactivex.Single

abstract class SingleUseCase<P>(private val backgroundScheduler: Scheduler,
                                private val uiScheduler: Scheduler) {

    fun execute(): Single<P> = observable().observeOn(backgroundScheduler).subscribeOn(uiScheduler)

    protected abstract fun observable() : Single<P>
}