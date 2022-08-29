package part1.chap05.section1

fun main() {
    val a = 12
    val b = 7

    // 블록과 함께 사용
    val max = if (a>b) {
        println("a 선택")
        a // 마지막 식이 반환
    } else {
        println("b 선택")
        b
    }
    println(max)
}