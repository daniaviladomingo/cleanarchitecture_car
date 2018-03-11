package dani.cleanarchitecture.data

import dani.cleanarchitecture.domain.model.AddDeleteCar
import dani.cleanarchitecture.domain.model.Car
import dani.cleanarchitecture.domain.model.Credentials
import dani.cleanarchitecture.domain.repository.Repository
import io.reactivex.Completable
import io.reactivex.Single

class RepositoryImp: Repository {
    override fun login(user: String): Single<Credentials> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCredentials(): Single<Credentials> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserCars(credentials: Credentials): Single<List<Car>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCars(): Single<List<Car>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addUserCar(addCar: AddDeleteCar): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteUserCar(removeCar: AddDeleteCar): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}