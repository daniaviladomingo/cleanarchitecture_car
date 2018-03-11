package dani.cleanarchitecture.data.mapper

import dani.cleanarchitecture.data.preference.model.CredentialsPreference
import dani.cleanarchitecture.domain.model.Credentials

interface Mapper {
    fun credentialsPreferenceToCredentials(credentialsPreference: CredentialsPreference)
    fun credentialsToCredentialsPreference(credentials: Credentials)
}