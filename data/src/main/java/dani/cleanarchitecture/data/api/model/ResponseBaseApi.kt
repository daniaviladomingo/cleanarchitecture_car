package dani.cleanarchitecture.data.api.model

abstract class ResponseBaseApi<out T>(val codigo: Int, val data: T?)