package part1.chap05.section2

fun main() {
    var total = 0
    for (num in 1..99 step 2) // 짝수합
        total += num
    println("total: $total")
}