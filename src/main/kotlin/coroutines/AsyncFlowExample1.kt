import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        sendPrimes().collect { it ->
            println("Received the number $it")
        }
        println("Finished !")
    }
}

fun sendPrimes(): Flow<Int> = flow {
    val primeList: List<Int> = listOf(1, 3, 5, 7, 11, 13, 17, 23, 31)
    primeList.forEach { it ->
        delay(it * 100L)
        emit(it)
    }
}