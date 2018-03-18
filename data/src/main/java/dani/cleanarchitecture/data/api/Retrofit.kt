package dani.cleanarchitecture.data.api

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private const val URL_BASE_API_CARS = "http://localhost/apirest_car/cars/ws/"
    private val retrofit = Retrofit.Builder().baseUrl(URL_BASE_API_CARS).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build()
    val api = retrofit.create(IApi::class.java)
}