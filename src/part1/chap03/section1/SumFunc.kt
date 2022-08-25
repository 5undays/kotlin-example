package part1.chap03.section1

//fun sum(a:Int, b:Int) :Int {
//    return a+b
//} // 지역 함수
fun sum(a:Int, b:Int = 5) = a+b

//fun max(a:Int, b:Int): Int {
//    return if (a > b) a else b
//}
fun max(a:Int, b:Int) = if (a>b) a else b

//fun outFunc(name:String):Unit {
//    println("Name : $name")
//}
fun outFunc(name:String) = println("Name:$name")
fun main() { // 최상위 함수
    var result = sum(2,3)
    result = sum(2)
    var result2 = max(3,5)
    println(result2)
    println(result)
    outFunc("Kildong")
}