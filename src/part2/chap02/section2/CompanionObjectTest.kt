package part2.chap02.section2

class Person4 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working..")
        }
    }
}
fun main() {
    println(Person4.language) // 인스턴스
    Person4.language = "English"
    println(Person4.language)
    Person4.work()
    //println(Person4.name)
}