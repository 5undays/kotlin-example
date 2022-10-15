package part2.chap05.section1

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "World", 3.14, 'c')
    var intSet: Set<Int> = setOf<Int> (1,4,4)

    println(mixedTypeSet)
    println(intSet)

}