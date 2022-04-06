fun main() {
    val sequence1 = sequence {
        println("One")
        yield(1)

        println("two")
        yield(2)

        println("three")
        yield(3)

        println("Four")
        yield("4")

        println("Five")
        yield("5")

        print("done")
    }
    for (value in sequence1) {
        println(value)
    }
}

