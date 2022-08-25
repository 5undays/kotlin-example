package part1.chap03.section1

fun normalVarrags(vararg a:Int) {
    for (num in a) {
        println("$num ")
    }
}
fun main() {
    normalVarrags(1)
    println()
    normalVarrags(1,2,3,4)
}