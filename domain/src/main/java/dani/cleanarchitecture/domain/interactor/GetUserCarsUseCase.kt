package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.ISingleUseCaseWithParameter
import dani.cleanarchitecture.domain.model.Car
import dani.cleanarchitecture.domain.model.Credentials
import io.reactivex.Single

class GetUserCarsUseCase: ISingleUseCaseWithParameter<Credentials, List<Car>> {
    override fun execute(parameter: Credentials): Single<List<Car>> {
    }
}