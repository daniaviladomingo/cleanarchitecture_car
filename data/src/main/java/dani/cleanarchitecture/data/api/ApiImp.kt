package dani.cleanarchitecture.data.api

import dani.cleanarchitecture.data.api.definition.Retrofit
import dani.cleanarchitecture.domain.model.AddDeleteCar
import dani.cleanarchitecture.domain.model.Car
import dani.cleanarchitecture.domain.model.Credentials
import io.reactivex.Completable
import io.reactivex.Single

class ApiImp(private val restApi: Retrofit.RestApi): IApi {
    override fun login(idUser: String): Single<Credentials> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCarsUser(credentials: Credentials): Single<List<Car>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCars(): Single<List<Car>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addCarUser(addCar: AddDeleteCar): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteCarUser(removeCar: AddDeleteCar): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}