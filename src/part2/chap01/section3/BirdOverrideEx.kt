package part2.chap01.section3

// 상속 가능한 클래스를 위해 open 사용
open class Bird2(var name:String, var wing: Int, var beak:String, var color:String) {
    fun fly() = println("fly wing $wing")
    open fun sing(vol: Int) = println("sing vol :$vol") // 오버라이딩 가능한 메서드
}

class Parrot2(name:String
              , wing: Int = 2
              , beak:String
              , color:String // 마지막 인자만 var로 선언되어 프로퍼티가 추가됨
              , var language: String = "natural") : Bird2 (name, wing, beak, color) {
    fun speak() = println("speak! $language")
    override fun sing(vol: Int) { // 오버라이딩 메서드
        println("I'm a parrot! The Volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot2(name = "myparrot", beak = "short", color = "blue")
    parrot.language = "english"
    println("parrot : ${parrot.name}, ${parrot.language}, ${parrot.color}, ${parrot.beak}, ${parrot.wing}")
    parrot.sing(5)
}