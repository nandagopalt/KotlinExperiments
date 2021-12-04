fun main(args: Array<String>) {
    val number = 29
    var isPrime = true
    for (i in 2 .. number/2) {
        println("$number % $i = ${number%i}")
        if (number % i == 0 && number != i) {
            isPrime = false
            println("$number is not a prime number !")
            break
        }
    }
    if (isPrime) {
        println("$number is prime number !")
    }
}
