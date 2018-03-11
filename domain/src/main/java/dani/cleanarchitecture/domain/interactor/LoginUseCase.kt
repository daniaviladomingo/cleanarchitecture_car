package dani.cleanarchitecture.domain.interactor

import dani.cleanarchitecture.domain.interactor.type.SingleUseCaseWithParameter
import io.reactivex.Single
import sun.security.krb5.Credentials

class LoginUseCase: SingleUseCaseWithParameter<String, Credentials> {
    override fun execute(parameter: String): Single<Credentials> {
    }
}