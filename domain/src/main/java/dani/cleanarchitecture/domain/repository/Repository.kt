package dani.cleanarchitecture.domain.repository

import dani.cleanarchitecture.domain.model.Car
import io.reactivex.Completable
import io.reactivex.Single

interface Repository {
    fun login(user: String) : Completable
    fun getUserCars(idUser: Int, password: String) : Single<List<Car>>
    fun getCars() : Single<List<Car>>
    fun addUserCar(idUser: Int, password: String, idCar: Int) : Completable
    fun deleteUserCar() : Completable

}