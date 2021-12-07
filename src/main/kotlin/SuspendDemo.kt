class SuspendDemo {
    fun firstMethod() {
        println("This is from first method !")
    }

    /*  1. Suspend modifier labels the method as function executing long running tasks
        2. Suspend function can be called from another suspending function or from the coroutine. Compiler will
        throw the warning in case if suspending function is called from non suspending function and forces
        to make the caller function suspend by adding the suspend modifier preceding the fun keyword.
     */
    suspend fun secondMethod() {
        for (i in 1..20000) {
            println("Printing $i")
        }
    }
}

 suspend fun main(args: Array<String>) {
    val suspendObject = SuspendDemo()
    suspendObject.firstMethod()
    suspendObject.secondMethod()
}