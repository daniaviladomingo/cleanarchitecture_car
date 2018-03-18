package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.ISingleUseCase
import dani.cleanarchitecture.domain.model.Car
import io.reactivex.Single

class GetCarsUseCase: ISingleUseCase<List<Car>> {
    override fun execute(): Single<List<Car>> {
    }
}