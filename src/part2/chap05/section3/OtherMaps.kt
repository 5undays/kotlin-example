package part2.chap05.section3

import java.util.SortedMap

fun main() {
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap")

    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sorted = $sortedMap")

    val linkedHashMap: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("linked = $linkedHashMap")
}