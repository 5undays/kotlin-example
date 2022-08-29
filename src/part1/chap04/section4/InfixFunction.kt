package part1.chap04.section4

fun main() {
    val num = 3
    val str = num.strPlus("Kotlin")
    println(str)
}
infix fun Int.strPlus(x:String): String {
    return "$x version $this"
}