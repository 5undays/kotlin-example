package part2.chap03.section2

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov에서는 접근 불가
        fun accessOuter() {
            println(country)
            getSomething()
        }
    }

    fun outside() {
        val msg = Nested().greeting()
        println("[Outer]: $msg ${Nested().nv}")
    }

    companion object {
        const val country: String = "Korea"
        fun getSomething() {
            println("get Something")
        }
    }
}

fun main() {
    // static 처럼 Outer의 객체 생성 없이 Nested 객체를 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    // outer.outside() // 에러
    Outer().outside() // 가능
    Outer.Nested().accessOuter()

    val outer = Outer()
    outer.outside()
}