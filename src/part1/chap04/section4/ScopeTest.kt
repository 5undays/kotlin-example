package part1.chap04.section4

var global = 10
fun main() {
    fun localfunc() {
        println("localfunc")
    }
    localfunc()
    global = 15
    val local1 = 15
    println("main global - $global")
    userFun()
    println("after userFun - $global")
}
fun userFun() {
    global = 20
    println("userFun - $global")
}
