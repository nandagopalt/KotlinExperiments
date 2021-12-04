import kotlin.math.roundToInt
fun main(args: Array<String>) {
    // Write a logic to generate random numbers between 2 and 1000
    val max = 20
    val min = 2
    val maxRange = (Math.random() * (max - min)).roundToInt() + min
    println("Prime Numbers between $min and $maxRange are:")
    for(i in 2 .. maxRange) {
        printPrime(i)
    }
}

fun printPrime(i: Int) {
    if(i == 2 || i == 3)
        println(i)
    else {
        for (j in 2..i / 2) {
            // Logic to check for prime number
            if (i % j != 0) {
                println(i)
            }
            break
        }
    }
}


