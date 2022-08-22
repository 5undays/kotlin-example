package part1.chap02.section3

fun main() {
    val num = 256
    if (num is Int) {
        println(num)
    } else if (num !is Int) {
        print("Not a Int")
    }
}