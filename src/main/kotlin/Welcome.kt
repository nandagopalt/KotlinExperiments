import kotlin.concurrent.thread

fun main(args: Array<String>) {
    //println("Welcome to Kotlin !")
    //val count = 100
    println("Thread started from ${Thread.currentThread().name}")
    thread {
        println("Thread started from ${Thread.currentThread().name}")
        // Simulated the long running operation
        Thread.sleep(1000)
       /* for(i in 1..count) {
            println("Downloading ${i}/${count}")
        }*/
        println("Thread completed from ${Thread.currentThread().name}")
    }
    //Thread.sleep(1000)
    println("Thread completed from ${Thread.currentThread().name}")
}