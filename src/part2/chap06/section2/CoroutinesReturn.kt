package part2.chap06.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val job = GlobalScope.launch {
        delay(1000)
        println("world")
    }
    println("hello")
    println("job.active : ${job.isActive}, completed:${job.isCompleted}")
    Thread.sleep(2000)
    println("job.isActive : ${job.isCompleted}, completed: ${job.isCompleted}")
}