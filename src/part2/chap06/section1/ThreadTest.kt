package part2.chap06.section1

// Thread 클래스 를 상속받아 구현
class SimpleThread : Thread() {
    override fun run() {
        println("Class Thread ${Thread.currentThread()}")
    }
}

// Runnable 인터페이스로부터 run() 구현하기
class SimpleRunnable : Runnable {
    override fun run() {
        println("Interface Thread ${Thread.currentThread()}")
    }

}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)
    thread2.start()

    // 익명 객체
    object : Thread() {
        override fun run() {
            println("object thread : ${Thread.currentThread()}")
        }
    }.start()

    // 람다식
    Thread {
        println("Lambda Thread : ${Thread.currentThread()}")
    }.start()
}