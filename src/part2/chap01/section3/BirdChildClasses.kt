package part2.chap01.section3

open class Bird(var name:String, var wing:Int, var beak: String) {
    open fun fly() {
        println("Fly")
    }
}

class Lark(name:String, wing:Int, beak:String):Bird(name ,wing,beak) {
    override fun fly() {
        println("quick fly")
    }

    fun singHightone() {
        println("sing hightone")
    }
}

class Parrot:Bird {
    var lanauage :String
    constructor(name:String, wing:Int, beak:String, lanauage: String) :super (name, wing, beak){
        this.lanauage = lanauage
    }

    override fun fly() {
        println("slow fly")
    }
    fun speak() {
        println("Speak :$lanauage")
    }
}

fun main() {
    val lark = Lark("lark", 2, "short")
    val parrot = Parrot("parrot", 2, "long", "english")

    println("lark : ${lark.name}")
    println("parrot : ${parrot.lanauage}")

    lark.singHightone()
    lark.fly()

    parrot.speak()
}