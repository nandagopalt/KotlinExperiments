sealed class Resource<T>(
    val response: T? = null,
    val message: String? = null
) {
    class Success<T>(response: T?): Resource<T>(response)
    class Error<T>(errorMessage: String): Resource<T>(message = errorMessage)
    class Loading<T>: Resource<T>()
}

fun <T> getResponse(): Resource<T> {
    return Resource.Success(response = (100..1000).random().toString())
}

fun main() {
    when(getResponse<String>()) {
        is Resource.Success -> println("Success!")
    }
}