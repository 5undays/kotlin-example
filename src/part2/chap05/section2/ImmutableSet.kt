package part2.chap05.section2

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "World", 3.14, 'c') // 자료형 혼합 초기화
    var intSet: Set<Int> = setOf<Int> (1,4,4) // 정수형만 초기화

    println(mixedTypeSet)
    println(intSet) // 중복된 요소는 하나만 나타남

}