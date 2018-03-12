package dani.cleanarchitecture.data.mapper

import dani.cleanarchitecture.data.api.model.ResponseCredentialsApi
import dani.cleanarchitecture.data.preference.model.CredentialsPreference
import dani.cleanarchitecture.domain.model.Credentials

interface Mapper {
    fun credentialsApiToPreference(responseCredentialsApi: ResponseCredentialsApi): CredentialsPreference
    fun credentialsPreferenceToDomain(credentialsPreference: CredentialsPreference): Credentials
}