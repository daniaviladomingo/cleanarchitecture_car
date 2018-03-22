package com.turismonovo.cerdedocobate.domain.interactors.base

import io.reactivex.Observable
import io.reactivex.Scheduler

abstract class UseCase<P>(private val backgroundScheduler: Scheduler,
                          private val uiScheduler: Scheduler) {

    fun execute(): Observable<P> = observable().observeOn(backgroundScheduler).subscribeOn(uiScheduler)

    protected abstract fun observable() : Observable<P>
}