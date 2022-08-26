package part1.chap04.section3

inline fun shortFunc(a: Int, out: (Int)->Unit) {
    println("Hello")
    out(a)
}
fun main() {
    //shortFunc(2, {a -> println("a:$a") })
    shortFunc(2, ){
        println("a:$it")
    }
}