package dani.cleanarchitecture.data.api.model

class QueryApi<out T>(codigo: Int, data: List<T>?) : BaseApi<List<T>>(codigo, data)