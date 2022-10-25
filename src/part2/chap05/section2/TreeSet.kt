package part2.chap05.section2

import java.util.TreeSet

fun main() {
    // java util 사용
    val insSortedSet: TreeSet<Int> = sortedSetOf(4,1,7,2)
    insSortedSet.add(5)
    insSortedSet.remove(2)
    println("insSortedSet : ${insSortedSet}")
    insSortedSet.clear()
    println("insSortedSet : ${insSortedSet}")
}