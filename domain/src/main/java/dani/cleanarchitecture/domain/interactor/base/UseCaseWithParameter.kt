package com.turismonovo.cerdedocobate.domain.interactors.base

import io.reactivex.Observable
import io.reactivex.Scheduler

abstract class UseCaseWithParameter<in P, R>(private val backgroundScheduler: Scheduler,
                                             private val uiScheduler: Scheduler) {

    fun execute(parameter: P): Observable<R> = observable().observeOn(backgroundScheduler).subscribeOn(uiScheduler)

    protected abstract fun observable() : Observable<R>
}