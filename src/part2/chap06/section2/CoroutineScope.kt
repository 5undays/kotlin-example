package part2.chap06.section2

import kotlinx.coroutines.*

fun main() = runBlocking(Dispatchers.Default) {
    launch(Dispatchers.IO) {
        delay(200L)
        println("Task from runblocking")
    }

    coroutineScope {
        launch {
            delay(200L)
            println("Task From nested launch")
        }
        delay(200L)
        println("Task from coroutinescope")
    }

    println("end of runblocking")
}