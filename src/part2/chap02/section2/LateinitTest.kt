package part2.chap02.section2

class Person {
    lateinit var name:String // 늦은 초기화를 위한 선언
    fun test() {
        if (!::name.isInitialized) { // 프로퍼티 초기화 여부 판단
            println("Not initialized")
        } else {
            println("initialized")
        }
    }
}
fun main() {
    val person = Person()
    person.test()
    person.name = "Kildong" // 이시점에서 초기화됨
    person.test()
    println("name : ${person.name}")
}