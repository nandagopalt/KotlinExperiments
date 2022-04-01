import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(args: Array<String>) = runBlocking {
    //println("Welcome to Kotlin !")
    //val count = 100
    println("Thread started from ${Thread.currentThread().name}")
    val deferredJob: Deferred<Int> = async(Dispatchers.IO) {
        println("Thread started from ${Thread.currentThread().name}")
        println("${Thread.currentThread().name} is processing...")
        // Simulated the long running operation
        delay(10000)
        /* for(i in 1..count) {
             println("Downloading ${i}/${count}")
         }*/
        println("Thread completed from ${Thread.currentThread().name}")
        15
    }
    //Thread.sleep(2000)
    deferredJob.join()
    println("Deferred job : ${deferredJob.await()}")
    println("Thread completed from ${Thread.currentThread().name}")
}