fun main(args: Array<String>) {
    println("Loops by example !")
    var s = "abcdefghijklmnopqrstuvwxyz"
    println(s.length)
    /*for(letter in s) {
        println(letter)
    }*/
   /* for(index in s.indices) {
        println("Letters from $index position is ${s[index]}")
    }*/
    for((index, element) in s.withIndex()) {
        println("$index, $element")
    }
}