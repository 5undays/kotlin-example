package part1.chap04.section2

// 값에 의한 호출로 람다식 활용
fun main() {
    var result = callByValue(lambda())
    println(result)
}

fun callByValue(a:Boolean):Boolean {
    println("callByValue function")
    return a
}

val lambda: () -> Boolean= {
    println("lambda function")
    true
}

