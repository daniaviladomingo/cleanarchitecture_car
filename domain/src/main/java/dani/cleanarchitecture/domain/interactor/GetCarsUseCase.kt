package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.SingleUseCase
import dani.cleanarchitecture.domain.model.Car
import io.reactivex.Single

class GetCarsUseCase: SingleUseCase<List<Car>> {
    override fun execute(): Single<List<Car>> {
    }
}