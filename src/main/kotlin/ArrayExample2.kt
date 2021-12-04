fun main(args: Array<String>) {
    // Declare and Define double array of size 10
    val doubleArray = DoubleArray(10)
    for(index in doubleArray.indices) {
        // Initialize the value of the array index with the random numbers
        doubleArray[index] = (Math.random() * 10)
    }
   /* for(i in 0 until doubleArray.size) {
        print("${doubleArray[i]}\t")
    }*/
    // find the average of the values in the array
    var j = 0
    var avg: Double = 0.00
    while(j < doubleArray.size) {
        print("[$j] -> ${doubleArray[j]}\t")
        avg += doubleArray[j] / doubleArray.size
        j++
    }
    println("\nAverage : $avg")
    var k = 0
    while(k < doubleArray.size) {
        println(if(doubleArray[k] < avg)
           "${doubleArray[k]} is lower than $avg"
           else "${doubleArray[k]} is bigger than $avg")
        k++
    }
}