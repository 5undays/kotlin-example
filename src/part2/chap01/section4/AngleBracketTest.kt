package part2.chap01.section4

// 앵클 브라캣을 이용한 이름 중복 해결
open class A {
    open fun f() = println("A class f()")
    fun a() = println("A class a()")
}

interface B {
    fun f() = println("B interface f()") // 인터페이스 기본적으로 open 임
    fun b() = println("B interface b()")
}

class C: A(), B { // 콤마를 사용하여 클래스와 인터페이스를 지정
    // 컴파일되기 위해서 f()를 오버라이딩
    override fun f() {
        println("C class f()")
    }
    fun test() {
        f() // 현재 클래스의 f()
        b() // 인터페이스의 B의 b()
        super<A>.f() // A클래스의 f()
        super<B>.f() // B클래스의 f()
    }
}
fun main() {
    val c = C()
    c.test()
}