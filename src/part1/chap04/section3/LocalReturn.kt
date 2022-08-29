package part1.chap04.section3

fun main() {
    shortFunc(3) {
        println("First call: $it")
        return
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before call out()")
    out(a)
    println("After call out()")
}