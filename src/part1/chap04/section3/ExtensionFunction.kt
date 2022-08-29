package part1.chap04.section3

fun main() {
    val source = "Hello World"
    var target = "Kotlin"
    println(source.getLongString(target))
}

fun String.getLongString(target:String):String {
    return if (this.length > target.length) this else target
}