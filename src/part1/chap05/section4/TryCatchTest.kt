package part1.chap05.section4

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a/b
        println("after?")
    }catch (e: Exception) {
        println(e)
    } finally {
        println("finally")
    }
}