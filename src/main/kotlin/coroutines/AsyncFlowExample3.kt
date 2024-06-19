import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull


fun main() {
    /*runBlocking {
        println("Inside runBlocking block...")
        sendOddNumbers2().collect { it ->
            println(it)
        }

        println("Flow collection completed !")
    }*/


    /*runBlocking {
        println("Execution of runBlocking...")
        val numbers = sendNumbers()
        println("Flow processing is yet to be started !")
        numbers.collect { it ->
            println("Printing $it")
        }

    }*/


    runBlocking {
        val newNumbers = sendNewNumbers()
        println("Flow processing is yet to get started !")
        println("Flow Processing is being started now !")
        withTimeoutOrNull(1000L) {
            newNumbers.collect { it ->
                println("Received $it")
            }
        }
    }
}

fun sendOddNumbers1() =
    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).asFlow()

fun sendOddNumbers2() = flowOf(1, 2, 3)


fun sendNumbers(): Flow<Int> = flow {
    listOf(1, 2, 3).forEach { it ->
        delay(it * 100L)
        emit(it)
    }
}

fun sendNewNumbers(): Flow<Int> = flow {
    listOf(1, 2, 3).forEach { it ->
        delay(400L)
        emit(it)
    }
}


