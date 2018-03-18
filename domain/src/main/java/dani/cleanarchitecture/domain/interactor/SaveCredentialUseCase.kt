package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.ICompletableUseCaseWithParameter
import dani.cleanarchitecture.domain.model.Credentials
import dani.cleanarchitecture.domain.repository.IRepository

class SaveCredentialUseCase(private val repository: IRepository): ICompletableUseCaseWithParameter<Credentials> {
    override fun execute(credentials: Credentials) = repository.saveCredentials(credentials)
}