fun main(args: Array<String>) {
    val numberInMonth = (Math.random() * 12).toInt()
    val month = when(numberInMonth) {
        12 -> "December"
        11 -> "November"
        10 -> "October"
        9 -> "September"
        8 -> "August"
        7 -> "July"
        6 -> "June"
        5 -> "May"
        4 -> "April"
        3 -> "March"
        2 -> "February"
        1 -> "January"
        else -> "Invalid Input !"
    }
    if(month != "Invalid Input !")
        print("Selected Month is $month")
    else
        print(month)
}