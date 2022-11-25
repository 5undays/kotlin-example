package part2.chap06.section2

import kotlinx.coroutines.*

fun main() = runBlocking{
    println("runblocking : $coroutineContext")
    val request = launch {
        println("request: $coroutineContext")
        GlobalScope.launch {
            println("job1 : before suspend function, $coroutineContext")
            delay(1000)
            println("job1: after suspend function, $coroutineContext")
        }
        //launch {
        //launch(Dispatchers.Default) {
        CoroutineScope(Dispatchers.Default).launch {
            delay(100)
            println("job2 : before suspend function, $coroutineContext")
            delay(1000)
            println("job2 : after suspend function, $coroutineContext")
        }
    }
    delay(500)
    request.cancel()
    delay(1000)
    println("end")
}