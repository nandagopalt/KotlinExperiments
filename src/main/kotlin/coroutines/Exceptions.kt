import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    runBlocking {
        val myHandler = CoroutineExceptionHandler { couroutineContext, thorwable ->
            println("Exception handled : ${thorwable.localizedMessage}")
        }
        val job: Job = GlobalScope.launch(myHandler) {
            println("Throwing exception frm job")
            throw IndexOutOfBoundsException("Exception in coroutine")
        }
        job.join()

        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Exception frm async")
        }
        try {
            deferred.await()
        } catch (e: ArithmeticException) {
            println("Caught Arithmetic Exception")
        }
    }
}