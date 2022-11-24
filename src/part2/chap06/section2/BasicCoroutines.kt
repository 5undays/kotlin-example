package part2.chap06.section2
import kotlinx.coroutines.*

fun main() { // 메인 스레드
    //doSomething() 사용불가
    GlobalScope.launch {
        delay(1000L) // 지연 함수
        println("world")
        doSomething()
    }
    println("Hello")
    Thread.sleep(2000L)
}

suspend fun doSomething() {
    print("DoSomething")
}