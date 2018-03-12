package dani.cleanarchitecture.data.api

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dani.cleanarchitecture.data.api.model.ResponseCredentialsApi
import dani.cleanarchitecture.data.api.model.ResponseQueryApi
import dani.cleanarchitecture.data.api.model.ResponseUpdateApi
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

object RestApi {

    private const val URL_BASE_API_CARS = "http://localhost/apirest_car/cars/ws/"

    interface CarsApi {
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

    private val retrofit = Retrofit.Builder().baseUrl(URL_BASE_API_CARS).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build()

    val carsApi: CarsApi = retrofit.create(CarsApi::class.java)
}