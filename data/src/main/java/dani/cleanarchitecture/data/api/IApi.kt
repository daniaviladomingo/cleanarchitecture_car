package dani.cleanarchitecture.data.api

import dani.cleanarchitecture.data.api.model.ResponseCredentialsApi
import dani.cleanarchitecture.data.api.model.ResponseQueryApi
import dani.cleanarchitecture.data.api.model.ResponseUpdateApi
import io.reactivex.Single
import retrofit2.http.*

interface IApi {
    @FormUrlEncoded
    @GET("v{version}/login.php")
    fun login(@Path("version") version: Int,
              @Field("user") user: String) : Single<ResponseQueryApi<ResponseCredentialsApi>>

    @FormUrlEncoded
    @POST("v{version}/cars_user.php")
    fun getCarsUser(@Path("version") version: Int,
                    @Field("id_user") idUSer: Int,
                    @Field("password") password: String) : Single<ResponseQueryApi<ResponseCredentialsApi>>

    @FormUrlEncoded
    @POST("v{version}/add_car_user.php")
    fun addCarUser(@Path("version") version: Int,
                   @Field("id_user") idUSer: Int,
                   @Field("password") password: Int,
                   @Field("id_car") idCard: Int) : Single<ResponseUpdateApi>

    @FormUrlEncoded
    @POST("v{version}/delete_car_user.php")
    fun deleteCarUser(@Path("version") version: Int,
                      @Field("id_user") idUSer: Int,
                      @Field("password") password: Int,
                      @Field("id_car") idCard: Int) : Single<ResponseUpdateApi>
}