package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.ICompletableUseCaseWithParameter
import dani.cleanarchitecture.domain.model.AddDeleteCar
import io.reactivex.Completable

class DeleteCarUseCase: ICompletableUseCaseWithParameter<AddDeleteCar> {
    override fun execute(parameter: AddDeleteCar): Completable {
    }
}