package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    println("Program executes from ${Thread.currentThread().name}")
    /*val executionTimeInMillis = measureTimeMillis {
        val resultFromMessageOne: Deferred<String> = async { getMessageOne() }
        val resultFromMessageTwo: Deferred<String> = async { getMessageTwo() }
        val result = "${resultFromMessageOne.await()} ${resultFromMessageTwo.await()}"
        println(result)
    }
    println("Execution time in millis : $executionTimeInMillis ms")*/
    checkWithLaunchCoroutineBuilder()
    println("Program execution completed from ${Thread.currentThread().name}")
}

suspend fun checkWithLaunchCoroutineBuilder() = runBlocking {
    var job1: Job
    var job2: Job
    val time1 = measureTimeMillis {
        job1 = launch(Dispatchers.IO) { checkLaunch1() }
        job2 = launch(Dispatchers.IO) { checkLaunch2() }
    }
    /*val time2 = measureTimeMillis {
        job1 = async(Dispatchers.IO) { checkLaunch1() }
        job2 = async(Dispatchers.IO) { checkLaunch2() }
    }*/
    //delay(3000)
    job1.join()
    job2.join()
    println("Execution time in : $time1 ms")
}


suspend fun getMessageOne(): String {
    println("Message 1: Task executing from ${Thread.currentThread().name}")
    delay(1000L)
    return "Hello"
}

suspend fun getMessageTwo(): String {
    println("Message 2: Task executing from ${Thread.currentThread().name}")
    delay(1000L)
    return "World"
}

suspend fun checkLaunch1() {
    println("Message 1: Task executing from ${Thread.currentThread().name}")
    delay(1000)
    //println("From checkLaunch1")
    println("Message 1: Task completed from ${Thread.currentThread().name}")
}

suspend fun checkLaunch2() {
    println("Message 2: Task executing from ${Thread.currentThread().name}")
    delay(1000)
    //println("From checkLaunch2")
    println("Message 2: Task completed from ${Thread.currentThread().name}")
}