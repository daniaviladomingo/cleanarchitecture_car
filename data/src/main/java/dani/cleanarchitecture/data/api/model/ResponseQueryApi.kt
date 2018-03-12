package dani.cleanarchitecture.data.api.model

class ResponseQueryApi<out T>(codigo: Int, data: List<T>?) : ResponseBaseApi<List<T>>(codigo, data)