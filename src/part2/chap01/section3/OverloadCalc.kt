package part2.chap01.section3

fun main() {
    val cal = Calc()
    println(cal.add(3,2))
    println(cal.add(3.2, 2.1))
    println(cal.add(3,3,2,))
    println(cal.add(3.2,1.2,2.3))
    println(cal.add("Hello ", "World"))
}

class Calc {
    // 다양한 매개변수로 오버로딩된 메서드들
    fun add(x:Int, y:Int) :Int = x+y
    fun add(x:Double, y:Double) : Double = x + y
    fun add(x:Int, y:Int, z:Int) = x+y+z
    fun add(x:Double, y:Double, z:Double) : Double = x+ y +z
    fun add(x:String, y:String) : String = x+y
}