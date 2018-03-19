package dani.cleanarchitecture.data.api.model

import com.google.gson.annotations.SerializedName

class ResponseCarUser(@SerializedName("id_user")
                      val idUser: Int,
                      val brand: String,
                      val model: String)