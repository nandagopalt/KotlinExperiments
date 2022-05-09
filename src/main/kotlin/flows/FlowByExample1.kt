package flows

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

class FlowByExample1 {
    init {
        println("Init called !")
    }

    companion object {
        val flow = flow<String> {
            for (i in 1..10) {
                emit("Welcome $i")
                delay(1000L)
            }
        }
    }


    fun testFlow() {

    }
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    //val flowByExample1 = FlowByExample1()
    CoroutineScope(Dispatchers.IO).launch {
        FlowByExample1.flow.collect {
            println(it)
        }
    }


}