package part1.chap05.section3

fun main() {
    retFun()
}

inline fun inlineLambda(a:Int, b:Int, out:(Int, Int) -> Unit) {
    out(a,b)
}

fun retFun() {
    println("start of retFun")
    inlineLambda(13,3) lit@{
            a, b->
        val result = a+b
        if (result > 10) return@lit
        println("result : $result")
    }
//    inlineLambda(13,3) {
//        a, b->
//        val result = a+b
//        if (result > 10) return // 비지역반환
//        println("result : $result")
//    }
    println("end of retFun")
}