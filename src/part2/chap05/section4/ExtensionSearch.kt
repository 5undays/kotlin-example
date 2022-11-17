package part2.chap05.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D",200))
    val listRecord = listOf(2,3,4,5,5,6)

    // 인덱스에 해당하는 요소를 반환
    println("elementAt : " + list.elementAt(1))

    // 인덱스를 벗어나는 경우 식에 따라 결과 반환 아니면 요소 반환
    println("elementAtOrElse : " + list.elementAtOrElse(10, {2 * it}))

    // 인덱스를 벗어나는 경우 null 반환
    println("elementAtOrNull : " + list.elementAtOrNull(10))

    list.reversed()
    list.sorted()
    list.sortedDescending()
    list.sortedBy { it % 3 }
    list.sortedByDescending { it % 3 }
}