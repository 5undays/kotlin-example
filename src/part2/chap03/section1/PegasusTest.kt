package part2.chap03.section1

interface Bird {
    val wings:Int
    fun fly()
    fun jump() = println("bird jump!")
}

interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump() = println("jump! max speed : $maxSpeed")
}

class Pegasus: Bird, Horse {
    override val wings: Int
        get() = 2

    override fun fly() {
        println("fly")
    }

    override val maxSpeed: Int
        get() = 100

    override fun run() {
        println("run")
    }

    override fun jump() {
        super<Horse>.jump()
        println("and Jump")
    }

}
fun main() {

}