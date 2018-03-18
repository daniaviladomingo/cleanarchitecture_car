package dani.cleanarchitecture.domain.repository

import dani.cleanarchitecture.domain.model.AddDeleteCar
import dani.cleanarchitecture.domain.model.Car
import dani.cleanarchitecture.domain.model.Credentials
import io.reactivex.Completable
import io.reactivex.Single

interface IRepository {
    fun login(user: String) : Single<Credentials>
    fun saveCredentials(credentials: Credentials) : Completable
    fun getCredentials() : Single<Credentials>
    fun getCarsUser(credentials: Credentials) : Single<List<Car>>
    fun getCars() : Single<List<Car>>
    fun addCarUser(addCar: AddDeleteCar) : Completable
    fun deleteCarUser(removeCar: AddDeleteCar) : Completable
}