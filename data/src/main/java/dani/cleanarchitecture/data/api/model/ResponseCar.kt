package dani.cleanarchitecture.data.api.model

import com.google.gson.annotations.SerializedName

class ResponseCar(@SerializedName("id_car")
                  val idCar: Int,
                  val model: String,
                  val brand: String)