fun main(args: Array<String>) {
    //for(i in 1..10) {
        val radius = Math.random() * 10
        val converted = radius.toInt()
        //println("$radius -> $converted")
        val area = Math.PI * converted * converted
        print("Area of Circle for $converted is ${area.toInt()}")
    //}
}