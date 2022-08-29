package part1.chap04.section3

inline fun shortFunc1(a: Int, crossinline out: (Int)->Unit) {
    println("Hello")
    out(a)
    println("Goodbye")
}
fun main() {
    //shortFunc(2, {a -> println("a:$a") })
    shortFunc1(2, ){
        println("a:$it")
        //return
    }
}