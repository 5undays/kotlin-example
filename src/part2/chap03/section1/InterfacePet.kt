package part2.chap03.section1

interface Pet {
    var category:String // abstruct 키워드가 없어도 기본은 추상 프로퍼티
    val msgTag:String // val 선언시 게터 구현이 가능
        get() = "I'm your lovely pet"
    fun feeding() // 마찬가지로 추상 메서드
    fun patting() { // 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep Patting!") // 구현부
    }
    var species: String
}

class Cat(override var category: String, override var species: String) : Pet {
    override fun feeding() {
        println("Feed the cat tuna can!")
    }
}

fun main() {
    val obj = Cat("small", "")
    println("Pet Category : ${obj.category}")
    obj.feeding() // 구현된 메서드
    obj.patting() // 기본 메서드
}