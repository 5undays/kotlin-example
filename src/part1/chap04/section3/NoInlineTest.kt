package part1.chap04.section3

fun main() {
    shortFunc2(3) { println("First call:$it") }
}

inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit): Unit {
    println("Before calling out ()")
    out(a)
    println("after calling out()")
}