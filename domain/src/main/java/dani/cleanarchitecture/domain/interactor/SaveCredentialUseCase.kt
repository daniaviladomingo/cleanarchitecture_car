package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.CompletableUseCaseWithParameter
import dani.cleanarchitecture.domain.model.Credentials
import dani.cleanarchitecture.domain.repository.Repository

class SaveCredentialUseCase(private val repository: Repository): CompletableUseCaseWithParameter<Credentials> {
    override fun execute(credentials: Credentials) = repository.saveCredentials(credentials)
}