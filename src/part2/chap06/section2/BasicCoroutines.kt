package part2.chap06.section2
import kotlinx.coroutines.*

fun main() { // 메인 스레드
    //doSomething() 사용불가

    // 하위의 자식이 완료될때까지 기다림
    runBlocking {
        val job = GlobalScope.launch {
            delay(1000L) // 지연 함수
            println("world")
            doSomething()
        }
        println("Hello")
        println("job : ${job.isCompleted}")
        //job.join()
        //Thread.sleep(2000L)
        println("job : ${job.isActive}")
    }
}

suspend fun doSomething() {
    println("DoSomething")
}