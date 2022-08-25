package part1.chap04.section1

fun main() {
    var result: Int
    val multi = {a:Int,b:Int-> a+b}
    val multi2:(a:Int,b:Int)->Int ={a,b->
        println("$a $b")
        a*b
    }
    // 람다식 안에 람다식
    val nestedLambda: () -> () -> Unit = {{ print("nestedLambda") }}
    result = multi2(10,20)
    println(result)
}