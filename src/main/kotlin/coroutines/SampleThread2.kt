import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {
    println("Thread execution from ${Thread.currentThread().name}")
    /* thread {
         println("Background work started from ${Thread.currentThread().name}")
         Thread.sleep(2000)
         println("Background work completed from ${Thread.currentThread().name}")
     }*/
    val job: Job = CoroutineScope(Dispatchers.Default).launch {
        println("Task started from ${Thread.currentThread().name}")
        //Thread.sleep(3000)
        try {
            for (i in 1..500) {
                /* if (!isActive) {
                     return@launch
                 }*/
                delay(100)
                //Thread.sleep(100)
                print("$i..")
                //yield()
            }
        } catch (exception: CancellationException) {
            println("\nException caught safely! ${exception.message}")
        } finally {
            withContext(NonCancellable) {
                delay(1000)
                println("Freeup the resources !")
            }

        }

        println("Task completed from ${Thread.currentThread().name}")
    }
    runBlocking {
        delay(3000)
        job.cancel(CancellationException("Coroutine cancelled"))
        job.join()
    }
    //Thread.sleep(4000)
    println("Thread execution completed from ${Thread.currentThread().name}")
}