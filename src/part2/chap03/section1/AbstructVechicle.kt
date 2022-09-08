package part2.chap03.section1

abstract class Vechicle(val name: String,val color:String, val weight:Int) {
    // 추상 프로퍼티 - 하위 클래스에서 오버라이딩
    abstract var maxSpeed:Double
    // 비추상 프로퍼티
    var year = "2010"

    // 추상 메서드
    abstract fun start()
    abstract fun stop()

    // 비추상 메서드
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
        println("Motorcycle start")
    }

    override fun stop() {
        println("Motorcycle stop")
    }

}
fun main() {
    var car = Car("Matiz", "Yellow",111, 270.3)
    var motorcycle = Motorcycle("Bike", "Blue", 111,222.3)

    car.displaySpec()
    motorcycle.year = "2013"
    motorcycle.displaySpec()
    motorcycle.start()
    motorcycle.stop()
}