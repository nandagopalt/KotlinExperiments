fun main(args: Array<String>) {
    /*var array = IntArray(5)
    for(i in 2 .. 10 step 2) {
        array[i/2 - 1] = i
    }
    var j = 0
    while (j < array.size) {
        print("${array[j]}\t")
        j++
    }*/

    var array = IntArray(5)
    for(index in array.indices) {
        array[index] = 2 * index
    }
    var j = 0
    while(j < array.size) {
        print("$j\t")
        j++
    }

}