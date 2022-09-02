package part2.chap01.section5

private class PrivateTest {
    private var i =1
    private fun privateTest() {
        i++
        println(i)
    }
    fun access() { // public
        privateTest()
    }
}

class OtherClass {
    //val pc = PrivateTest() // 공개 생성 불가 opc는 private 가 되어야함
    fun test() {
        val pc = PrivateTest()
        pc.access()
    }
}
fun main() {
    val pc = PrivateTest()
    //pc.i = 3 // 접근불가
    //pc.privateTest() // 접근불가
    pc.access()
}

fun topFunction() {
    val pc = PrivateTest()
}