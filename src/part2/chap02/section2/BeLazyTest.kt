package part2.chap02.section2

class LazyTest {
    init {
        println("init block")
    }

    private val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming" // lazy 반환값
    }

    fun flow() {
        println("not initalized")
        println("subject one : $subject") // 최초 초기화 시점
        println("subject two : $subject") // 이미 초기화된 값 사용
    }
}
fun main() {
    val test = LazyTest()
    test.flow()
}