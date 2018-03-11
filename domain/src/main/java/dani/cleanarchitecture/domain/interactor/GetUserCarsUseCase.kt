package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.SingleUseCaseWithParameter
import dani.cleanarchitecture.domain.model.Car
import dani.cleanarchitecture.domain.model.Credentials
import io.reactivex.Single

class GetUserCarsUseCase: SingleUseCaseWithParameter<Credentials, List<Car>> {
    override fun execute(parameter: Credentials): Single<List<Car>> {
    }
}