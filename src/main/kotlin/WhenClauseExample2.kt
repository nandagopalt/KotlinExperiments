fun main(args: Array<String>) {
    val a = (Math.random() * 100).toInt()
    val b = (Math.random() * 100).toInt()
    val c: Char = '-'
    val result = when(c) {
        '+' -> a + b
        '-' -> a - b
        '%' -> a % b
        '/' -> a / b
        '*' -> a * b
        else -> -1
    }
    print(result)
}