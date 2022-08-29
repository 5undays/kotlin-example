package part1.chap05.section2

fun main() {
    print("Enter the Number :")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) { // n * n - 1 *... * 2 * 1
        factorial *= number
        --number
    }

    println("Factorial : $factorial")
}