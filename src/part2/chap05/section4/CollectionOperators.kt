package part2.chap05.section4

fun main() {
    val list1: List<String> = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1,3,4)
    val map1 = mapOf("hi" to 1, "hello" to 2, "Goodbye" to 3)

    println(list1 + "four") // + 연산자를 사용한 문자열 요소 추가
    println(list2 + 1) // + 연산자를 사용한 정수형 요소 추가
    println(list2 + listOf(5,6,7)) // 두 list의 병합
    println(list2 - 1) // 요소의 제거
    println(list2 - listOf(3,4,5)) // 일치하는 요소의 제거
    println(map1 + Pair("bye", 4)) // pair를 사용한 map의 요소 추가
    println(map1 - "hello") // 일치하는 값의 제거
    println(map1 + mapOf("Apple" to 4, "Orange" to 5)) // map의 병합
    println(map1 - listOf("hi", "hello")) // list에 일치하는 값을 map에서 제거

    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A", 300), Pair("B",200), Pair("C",100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    list.forEach{ println("$it") }
    println()
    list.forEachIndexed { index, value -> println("index[$index] : $value") } // 인덱스

    // 각 요소를 람다 식으로 처리후 컬렉션으로 반환
    val returnList = list.onEach { println(it) }
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnList = $returnList")
    println("returnMap = $returnedMap")

    val list3 = listOf(1,2,3,4,5,6)

    // 초기값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4) { total, next -> total + next }) // 4 + 1 + ... 6 = 25
    println(list.fold(1) {total, next -> total * next }) // 1 * 1 * 2 * ... 6 = 720

    // fold와 같고 마지막 요소에서 처음요소로 반대로 적용
    println(list.foldRight(4) { total, next -> total + next })
    println(list.foldRight(1) {total, next -> total * next })

    // fold 와 동일하지만 초기값을 사용하지 않음
    println(list.reduce { total, next -> total + next })
    println(list.reduceRight { total, next -> total + next })

    val list4 = listOf(1,2,3,4,5,6,7)
    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)

    val groupMap = list.groupBy { if (it % 2 == 0) "even" else "" }

}