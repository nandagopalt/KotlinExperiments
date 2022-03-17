import kotlin.concurrent.thread

fun main(args: Array<String>) {
    println("Welcome to Kotlin !")
    val count = 100
    println("Thread started from ")
    thread {
        println("Thread executing from ${Thread.currentThread().name}")
        for(i in 1..count) {
            println("Downloading ${i}/${count}")
        }
    }
    println("Thread executing from ${Thread.currentThread().name}")
}