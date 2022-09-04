package part2.chap02.section3

object OCustomer {
    var name:String = "Kildong"
    fun greeting() = println("Hello World")
    val hobby = Hobby("basketball")
    init {
        println("init!")
    }
}

class Hobby(val name:String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.hobby.name)
}