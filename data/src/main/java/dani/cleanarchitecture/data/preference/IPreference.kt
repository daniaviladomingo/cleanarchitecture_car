package dani.cleanarchitecture.data.preference

import dani.cleanarchitecture.data.preference.model.CredentialsPreference
import io.reactivex.Single

interface IPreference {
    fun getCredentials(): Single<CredentialsPreference>
    fun saveCredentials(credentialsPreference: CredentialsPreference)
}