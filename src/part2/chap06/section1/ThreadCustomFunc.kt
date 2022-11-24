package part2.chap06.section1

public fun thread(
    start: Boolean = true,
    isDaemon: Boolean = false,
    priority: Int = -1,
    contextClassLoader: ClassLoader? = null,
    name: String? = null,
    block: () -> Unit
): Thread {
    val thread = object : Thread() {
        override fun run() {
            block()
        }
    }
    if (isDaemon) // 백 그라운드 실행 여부
        thread.isDaemon = true
    if (priority > 0) // 우선순위 (1: 낮음, -5: 보통, -10:높음)
        thread.priority = priority
    if (name != null) // 이름
        thread.name = name
    if (contextClassLoader != null)
        thread.contextClassLoader = contextClassLoader
    if (start)
        thread.start()

    return thread
}

fun main() {
    thread(start = true) {
        println("Current Thread(Custom function) : ${Thread.currentThread()}")
        println("Priority : ${Thread.currentThread().priority}") // 기본 5
        println("Name : ${Thread.currentThread().name}")
        println("Name : ${Thread.currentThread().isDaemon}")
    }
}