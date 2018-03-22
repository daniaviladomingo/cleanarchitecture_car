package com.turismonovo.cerdedocobate.domain.interactors.base

import io.reactivex.Completable
import io.reactivex.Scheduler

abstract class CompletableUseCase(private val backgroundScheduler: Scheduler,
                                  private val uiScheduler: Scheduler) {

    fun execute(): Completable = observable().observeOn(backgroundScheduler).subscribeOn(uiScheduler)

    protected abstract fun observable() : Completable
}