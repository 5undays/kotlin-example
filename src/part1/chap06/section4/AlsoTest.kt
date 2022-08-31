package part1.chap06.section4

fun main() {
    data class Person(var name:String, var skills:String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let { it.skills = "Android"
        "success" // 마지막 문장 리턴
    }

    println(person)
    println("a : $a") // String

    val b = person.also { it.skills = "Java"
        "success" // 마지막 문장은 사용 되지 않음
    }

    println(person)
    println("b : $b") // Person의 객체 b
}