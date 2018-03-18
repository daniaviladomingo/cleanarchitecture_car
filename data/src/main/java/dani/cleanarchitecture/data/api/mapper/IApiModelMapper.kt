package dani.cleanarchitecture.data.api.mapper

import dani.cleanarchitecture.data.api.model.ResponseCredentialsApi
import dani.cleanarchitecture.domain.model.Credentials

interface IApiModelMapper {
    fun mapApiCredentialsToDomain(responseCredentialsApi: ResponseCredentialsApi): Credentials
    fun mapApiCarUserToDomain
}