package part1.chap04.section4

fun a() =b()
fun b() = println("b")

fun c() {
    //fun d() = e() // 에러
    fun e() = println("e")
}
fun main() {
    a()
    //e() //에러
}