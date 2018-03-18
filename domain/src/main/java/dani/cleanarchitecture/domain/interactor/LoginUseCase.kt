package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.ISingleUseCaseWithParameter
import dani.cleanarchitecture.domain.model.Credentials
import dani.cleanarchitecture.domain.repository.IRepository

class LoginUseCase(private val repository: IRepository): ISingleUseCaseWithParameter<String, Credentials> {
    override fun execute(user: String)= repository.login(user)
}