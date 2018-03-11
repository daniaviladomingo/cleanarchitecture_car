package dani.cleanarchitecture.data.preference

import dani.cleanarchitecture.data.preference.model.CredentialsPreference

interface Preference {
    fun getCredentials(): CredentialsPreference
    fun saveCredentials(credentialsPreference: CredentialsPreference)
}