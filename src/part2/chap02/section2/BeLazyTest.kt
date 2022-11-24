package part2.chap02.section2

class LazyTest {
    init {
        println("init block") // 1
    }

    private val subject by lazy {
        println("lazy initialized") // 3
        "Kotlin Programming" // lazy 반환값
    }

    fun flow() {
        println("not initalized") // 2
        println("subject one : $subject") // 최초 초기화 시점 // 4
        println("subject two : $subject") // 이미 초기화된 값 사용 // 5
    }
}
fun main() {
    val test = LazyTest()
    test.flow()
}