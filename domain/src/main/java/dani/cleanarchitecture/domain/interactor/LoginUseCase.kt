package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.SingleUseCaseWithParameter
import dani.cleanarchitecture.domain.model.Credentials
import dani.cleanarchitecture.domain.repository.Repository

class LoginUseCase(private val repository: Repository): SingleUseCaseWithParameter<String, Credentials> {
    override fun execute(user: String)= repository.login(user)
}