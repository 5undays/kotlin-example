package part2.chap04.section1

open class Animal(val size: Int)

class Cat(val jump:Int) : Animal(50)

class Spider(val poison:Boolean) : Animal(1)

class Box2<out T:Animal>
    /*(val element:T) {
    fun getAnimal(): T = element
}*/

fun main() {
    val c1 = Cat(19)
    val s1 = Spider(false)

    var a1:Animal = c1
    a1 = s1

    println("s1 ${a1.size} ${a1.poison}")
    println("s1 ${a1.size} $a1.poison")

    val b1: Box2<Animal> = Box2<Cat>()
    val b2: Box2<Animal> = Box2<Spider>()
    val b3 = Box2<Animal>()
    //val b4:Box2<Number> = Box2<Int>()

}