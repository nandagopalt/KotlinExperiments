fun main(args: Array<String>) {
    val array = intArrayOf(10,200,30,40,50)
    val result = getInput(array = array, asc = false)
    print(result)
}

fun getInput(array: IntArray, asc: Boolean = true): Boolean {
    var isSorted = true
    for(i in 0 until array.size - 1) {
        if(!asc && array[i] > array[i + 1] ||
                asc && array[i] < array[i + 1]) {
            isSorted = false
            break
        }
    }
    return isSorted
}