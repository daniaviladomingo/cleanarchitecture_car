package dani.cleanarchitecture.data.api

import dani.cleanarchitecture.domain.model.AddDeleteCar
import dani.cleanarchitecture.domain.model.Car
import dani.cleanarchitecture.domain.model.Credentials
import io.reactivex.Completable
import io.reactivex.Single

interface IApi {
    fun login(idUser: String) : Single<Credentials>
    fun getCarsUser(credentials: Credentials): Single<List<Car>>
    fun getCars(): Single<List<Car>>
    fun addCarUser(addCar: AddDeleteCar): Completable
    fun deleteCarUser(removeCar: AddDeleteCar): Completable
}