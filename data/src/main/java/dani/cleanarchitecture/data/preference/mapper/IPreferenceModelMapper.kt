package dani.cleanarchitecture.data.preference.mapper

import dani.cleanarchitecture.data.api.model.ResponseCredentialsApi
import dani.cleanarchitecture.data.preference.model.CredentialsPreference
import dani.cleanarchitecture.domain.model.Credentials

interface IPreferenceModelMapper {
    fun credentialsApiToPreference(responseCredentialsApi: ResponseCredentialsApi): CredentialsPreference
    fun credentialsPreferenceToDomain(credentialsPreference: CredentialsPreference): Credentials
}