package com.turismonovo.cerdedocobate.domain.interactors.base

import io.reactivex.Scheduler
import io.reactivex.Single

abstract class SingleUseCaseWithParameter<in P, R>(private val backgroundScheduler: Scheduler,
                                                   private val uiScheduler: Scheduler) {

    fun execute(parameter: P): Single<R> = observable(parameter).observeOn(backgroundScheduler).subscribeOn(uiScheduler)

    protected abstract fun observable(parameter: P) : Single<R>
}