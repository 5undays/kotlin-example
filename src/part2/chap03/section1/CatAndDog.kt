package part2.chap03.section1

open class Animal(val name:String)

class Dog(name:String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Feed the dog a bone")
    }

    override var species: String
        get() = "dog"
        set(value) {}
}

class Master {
    // 인터페이스를 객체로 매개변수를 지정함
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}")
    }

}
fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}