package dani.cleanarchitecture.data.preference.mapper

import dani.cleanarchitecture.data.api.model.ResponseCredentialsApi
import dani.cleanarchitecture.data.preference.model.CredentialsPreference
import dani.cleanarchitecture.domain.model.Credentials


class PreferenceModelMapperImp: IPreferenceModelMapper {
    override fun credentialsApiToPreference(responseCredentialsApi: ResponseCredentialsApi): CredentialsPreference {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun credentialsPreferenceToDomain(credentialsPreference: CredentialsPreference): Credentials {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}