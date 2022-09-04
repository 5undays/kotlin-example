package part2.chap03.section1

abstract class Vechicle(val name: String,val color:String, val weight:Int) {
    abstract var maxSpeed:Double
    var year = "2010"
    abstract fun start()
    abstract fun stop()
    fun displaySpec() {
        println("Name : $name , color:$color, weight : $weight, year : $year, maxspeed :$maxSpeed")
    }
}

class Car(name: String, color: String, weight: Int, override var maxSpeed: Double) : Vechicle(name, color, weight) {
    override fun start() {
        println("car start")
    }

    override fun stop() {
        println("car stop")
    }

}

class Motorcycle(name: String, color: String, weight: Int, override var maxSpeed: Double) : Vechicle(name, color, weight) {
    override fun start() {
        println("car start")
    }

    override fun stop() {
        println("car stop")
    }

}
fun main() {
    val car = Car("Matiz", "Yellow",111, 270.3)
    var motorcycle = Motorcycle("Bike", "Blue", 111,222.3)

    car.displaySpec()
    motorcycle.year = "2013"
    motorcycle.displaySpec()
    motorcycle.start()
    motorcycle.stop()
}