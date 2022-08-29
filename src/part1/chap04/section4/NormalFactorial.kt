package part1.chap04.section4

fun main() {
    val number = 4
    var result: Long

    result = factorial(number)
    println("factorial : $number -> $result")
}

fun factorial(n: Int):Long {
    return if (n == 1) n.toLong() else n * factorial(n-1)
}