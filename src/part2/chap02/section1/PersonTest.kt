package part2.chap02.section1

class Person(var id:Int, val name:String, val age:Int)

fun main() {
    val person = Person(1,"Kildong", 30)
    person.id = 30
    println(person.id)
}