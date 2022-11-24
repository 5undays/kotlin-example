package part2.chap06.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun dowork1(): String {
    delay(1000)
    return "work1"
}

suspend fun dowork2(): String {
    delay(3000)
    return "work2"
}

private fun worksInSerial() {
    GlobalScope.launch {
        val one = dowork1()
        val two = dowork2()
        println("kotline one : $one")
        println("kotline two : $two")
    }
}

fun main() {
    worksInSerial()
    readLine() // main()이 먼저 죽는 것을 방지 콘솔에서 엔터키 입력 대기
}