package part2.chap04.section2

import java.util.*

fun main() {
    val b = Array<Any>(10, {0})
    b[0] = "Hello World"
    b[1] = 1.1
    println(Arrays.toString(b))
}