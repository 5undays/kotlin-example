package part2.chap05.section2

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6,4,2,1) // 불변성 기능이 없음
    intsHashSet.add(5) // 추가
    intsHashSet.remove(2) // 삭제
    println(intsHashSet)
}