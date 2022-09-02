package part2.chap01.section4

// 이너 클래스에서 바깥 클래스 접근하기
open class Base {
    open val x:Int = 1
    open fun f() = println("Base Class f()")
}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f() // 현재 이너 클래스의 f() 호출
            Child().f() //바로 바깥 클래스의 f() 호출
            super@Child.f() // child의 상위 클래스인 Base 클래스의 f() 호출
            println("[Inside] super@Child.x : ${super@Child.x}") // base의 x접근

        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}