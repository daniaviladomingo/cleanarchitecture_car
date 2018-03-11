package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.CompletableUseCaseWithParameter
import dani.cleanarchitecture.domain.model.AddDeleteCar
import io.reactivex.Completable

class AddCarUseCase: CompletableUseCaseWithParameter<AddDeleteCar> {
    override fun execute(parameter: AddDeleteCar): Completable {
    }
}