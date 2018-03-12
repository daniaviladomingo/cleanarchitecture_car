package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.SingleUseCaseWithParameter
import dani.cleanarchitecture.domain.repository.Repository
import io.reactivex.Single
import sun.security.krb5.Credentials

class LoginUseCase(repository: Repository): SingleUseCaseWithParameter<String, Credentials> {
    override fun execute(parameter: String): Single<Credentials> {
    }
}