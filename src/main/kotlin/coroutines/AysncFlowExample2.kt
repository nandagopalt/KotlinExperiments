import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    println("Flow is yet to be started !")
    runBlocking {
        println("Flow execution is getting started !")
        evenNumbers().collect { it ->
            println(it)
        }
        println("Flow execution completed!")
    }
}

fun evenNumbers(): Flow<Int> = flow {
    val evenNumbersList = listOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26)
    evenNumbersList.forEach { it ->
        delay(it * 100L)
        emit(it)
    }
}