package part2.chap02.section3

open class Superman() {
    fun work() = println("Talking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air")
}
fun main() {
    val pretendedMan = object : Superman() {
        override fun fly() {
            println("I'm not real superman. i cant fly")
        }
    }
    pretendedMan.fly()
    pretendedMan.work()
    pretendedMan.talk()
}