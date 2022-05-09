sealed class Resource<T>(
    val response: T? = null,
    val message: String? = null
) {
    class Success<T>(response: T?): Resource<T>(response)
    class Error<T>(errorMessage: String): Resource<T>(message = errorMessage)
    class Loading<T>(): Resource<T>()
}

fun <T> getResponse(id: Int): Resource<T>? {
    when(id) {
        1 -> Resource.Success(response = (100..1000).random().toString() as T)
        //2 -> Resource.Loading() as T

    }
    return null

}

fun main() {
    when(getResponse<String>(1)) {
        is Resource.Success -> println("Success!")
    }
}