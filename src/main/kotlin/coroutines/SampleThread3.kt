package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")
    try {
        val result: Int? = withTimeoutOrNull(2000) {
            for (i in 1..100) {
                print("$i..")
                delay(1)
            }
            15
        }
        println("\nResult : $result")
    } catch (exception: TimeoutCancellationException) {
        //..code...
        println("\nException: $exception")
    } finally {
        //..code...
        println("Free up resources")
    }
    println("Main program completes: ${Thread.currentThread().name} ")

}
