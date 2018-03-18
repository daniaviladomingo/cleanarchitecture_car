package dani.cleanarchitecture.data.preference

import dani.cleanarchitecture.data.preference.model.CredentialsPreference
import io.reactivex.Single

class PreferenceImp: IPreference {
    override fun getCredentials(): Single<CredentialsPreference> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveCredentials(credentialsPreference: CredentialsPreference) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}