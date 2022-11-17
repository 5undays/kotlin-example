package part2.chap05.section4

fun main() {
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    println(nums.take(10).toList())

    val squares = generateSequence(1) { it + 1 }.map { it * it }
    println(squares.take(10).toList())

    val oddSequence = squares.filter { it % 2 != 0 }
    println(oddSequence.take(5).toList())
}