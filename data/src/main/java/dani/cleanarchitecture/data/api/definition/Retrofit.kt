package dani.cleanarchitecture.data.api.definition

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dani.cleanarchitecture.data.api.model.*
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Path

object Retrofit {
    interface RestApi {
        @FormUrlEncoded
        @GET("v{version}/login.php")
        fun login(@Path("version") version: Int,
                  @Field("user") user: String) : Single<ResponseQueryApi<ResponseCredentialsApi>>

        @FormUrlEncoded
        @GET("v{version}/cars_user.php")
        fun getCarsUser(@Path("version") version: Int,
                        @Field("id_user") idUSer: Int,
                        @Field("password") password: String) : Single<ResponseQueryApi<ResponseCarUser>>

        @FormUrlEncoded
        @GET("v{version}/cars.php")
        fun getCars(@Path("version") version: Int,
                    @Field("id_user") idUSer: Int,
                    @Field("password") password: String) : Single<ResponseQueryApi<ResponseCar>>


        @FormUrlEncoded
        @GET("v{version}/add_car_user.php")
        fun addCarUser(@Path("version") version: Int,
                       @Field("id_user") idUSer: Int,
                       @Field("password") password: Int,
                       @Field("id_car") idCard: Int) : Single<ResponseUpdateApi>

        @FormUrlEncoded
        @GET("v{version}/delete_car_user.php")
        fun deleteCarUser(@Path("version") version: Int,
                          @Field("id_user") idUSer: Int,
                          @Field("password") password: Int,
                          @Field("id_car") idCard: Int) : Single<ResponseUpdateApi>
    }

    private const val URL_BASE_API_CARS = "http://localhost/apirest_car/cars/ws/"
    private val retrofit = Retrofit.Builder().baseUrl(URL_BASE_API_CARS).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build()
    val api = retrofit.create(RestApi::class.java)
}