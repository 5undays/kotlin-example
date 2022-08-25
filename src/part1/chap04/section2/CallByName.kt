package part1.chap04.section2

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

// 람다식 자체가 매개변수에 복사됨
fun callByName(b:() -> Boolean):Boolean {
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}