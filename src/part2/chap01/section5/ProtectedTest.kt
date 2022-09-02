package part2.chap01.section5

open class Base { // 최상위 선언 클래스에는 protected 를 사용할 수 없음
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }
    fun access() {
        protectedFunc()
    }

    protected class Nested // 내부 클래스에는 지시자 허용
}
class Derived: Base () {
    fun test(base:Base):Int {
        protectedFunc() // base 클래스의 메서드에 접근 가능
        return i // base 클래스의 프로퍼티 접근 가능
    }
}
fun main() {
    val base = Base() // 생성 가능
    //base.i // 접근 불가
    //base.protectedFunc() // 접근 불가
    base.access() //접근 가능
}