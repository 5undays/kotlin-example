package part2.chap04.section1

class Calc<T: Number> { // 클래스의 형식 매개변수 제한
    fun plus(args1:T, args2:T) :Double {
        return args1.toDouble() + args2.toDouble()
    }
}
fun main(args: Array<String>) {
    val clac = Calc<Int>()
    println(clac.plus(1,2))

    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()
    //val calc4 = Calc<String>() // 사용 불가

    println(calc2.plus(2.3,4.5))
    println(calc3.plus(6L, 3L))

}