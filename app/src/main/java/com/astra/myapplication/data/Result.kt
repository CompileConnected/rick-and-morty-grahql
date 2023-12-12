package com.astra.myapplication.data

sealed interface Result<T> {
    class Default<T> : Result<T>
    class Loading<T> : Result<T>
    data class Success<T>(val data: T) : Result<T>
    data class Failure<T>(val throwable: Throwable) : Result<T>

    companion object {
        fun <T> default() = Default<T>()
        fun <T> loading() = Loading<T>()
        fun <T> success(data: T) = Success(data)
        fun <T> failure(throwable: Throwable) = Failure<T>(throwable)
        fun <T> failure(message: String) = Failure<T>(Exception(message))

    }
}
