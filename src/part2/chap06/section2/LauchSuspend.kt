package part2.chap06.section2

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun dowork1(): String {
    delay(1000)
    return "work1"
}

suspend fun dowork2(): String {
    delay(3000)
    return "work2"
}

private fun worksInSerial() : Job {
    // 순차적 실행
    val job = GlobalScope.launch {
        val one = dowork1()
        val two = dowork2()
        println("kotline one : $one")
        println("kotline two : $two")
    }
    return job
}

private fun workInParallel() : Job{
    val one = GlobalScope.async {
        dowork1()
    }
    val two = GlobalScope.async {
        dowork2()
    }
    var job = GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin combined : $combined")
    }
    return job
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        //val job = worksInSerial()
        //readLine() // main()이 먼저 죽는 것을 방지 콘솔에서 엔터키 입력 대기
        val job = workInParallel()
        job.join()
    }
    println("time $time")
}