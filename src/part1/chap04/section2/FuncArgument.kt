package part1.chap04.section2

fun sum(a:Int, b:Int) = a+b
fun mul(a:Int, b:Int) = a*b
fun funFunc(a:Int, b:Int) = sum(a,b)
fun main() {
    val result = sum(10,10)
    var result2 = mul(sum(10,10),10)
    println("result:$result result2:$result2")
    var result3 = funFunc(2,3)
    println("result3:$result3")

}