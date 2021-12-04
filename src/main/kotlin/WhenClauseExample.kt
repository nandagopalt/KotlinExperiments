fun main(args: Array<String>) {
    val grade = (Math.random() * 10).toInt()
    when(grade) {
        10 -> print("Excellent !")
        9 -> print("Very Good !")
        8,7 -> print("Good !")
        6 -> print("Pass !")
        1,2,3,4,5 -> print("Fail !")
        else -> print("Illegal")
    }
}