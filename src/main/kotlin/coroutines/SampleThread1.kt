import kotlinx.coroutines.*
import kotlin.concurrent.thread

private lateinit var job: Job
private lateinit var deferredJob1: Deferred<Int>
private lateinit var deferredJob2: Deferred<Int>
private lateinit var deferredJob3: Deferred<Int>

fun main() {
    println("Thread executing from ${Thread.currentThread().name}")
    /*thread {
        println("Fake worked started from ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake worked ended from ${Thread.currentThread().name}")
    }*/
    //executeSequentialCoroutine()
    //executeAsynclikeCoroutine()
    executeAsyncCoroutine()
    runBlocking {
        //job.join()
        deferredJob1.join()
        deferredJob2.join()
        deferredJob3.join()
    }
    println("Thread completed from ${Thread.currentThread().name}")
}

fun executeSequentialCoroutine() {
    job = CoroutineScope(Dispatchers.IO).launch {
        task1()
        task2()
        task3()
    }
}

fun executeAsynclikeCoroutine() {
    deferredJob1 = CoroutineScope(Dispatchers.IO).async {
        task1()
        task2()
        task3()
    }
}

fun executeAsyncCoroutine() {
    deferredJob1 = CoroutineScope(Dispatchers.IO).async { task1() }
    deferredJob2 = CoroutineScope(Dispatchers.IO).async { task2() }
    deferredJob3 = CoroutineScope(Dispatchers.IO).async { task3() }
    runBlocking {
        val number1 = deferredJob1.await()
        val number2 = deferredJob2.await()
        val number3 = deferredJob3.await()
        val total = number1 + number2 + number3
        println(total)
    }
}

suspend fun task1(): Int {
    println("Task 1 execution from ${Thread.currentThread().name}")
    for (i in 1..10) {
        delay(1000)
        println("Task 1: $i")
    }
    println("Task 1 completed from ${Thread.currentThread().name}")
    return 10
}

suspend fun task2(): Int {
    println("Task 2 execution from ${Thread.currentThread().name}")
    for (i in 1..20) {
        delay(500)
        println("Task 2: $i")
    }
    println("Task 2 completed from ${Thread.currentThread().name}")
    return 20
}

suspend fun task3(): Int {
    println("Task 3 execution from ${Thread.currentThread().name}")
    for (i in 1..30) {
        delay(100)
        println("Task 3: $i")
    }
    println("Task 3 completed from ${Thread.currentThread().name}")
    return 30
}