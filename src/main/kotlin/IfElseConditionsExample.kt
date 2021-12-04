fun main(args: Array<String>) {
    val a = 2
    val b = 3
    //print(if(a > b) a else b) // "If/Else clause" is not a operator and it is considered as expression in kotlin
                              // and it returns the value in response
    val result = if(a > b) {
        println("$a is greater than $b")
        a
    } else {
        println("$b is greater than $a")
        b
    }

    print("Result is $result")

}