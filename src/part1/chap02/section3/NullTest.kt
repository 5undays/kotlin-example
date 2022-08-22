package part1.chap02.section3

fun main() {
    var str:String?
    str =null
    var len = str?.length ?: -1
    println("str: $str, length :${len}")
}