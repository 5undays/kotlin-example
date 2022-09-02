package part2.chap01.section2

import part2.chap01.section1.Bird

//class Bird(var name: String, var wing:Int, var beak:String){
class Bird{

    //프로퍼티
    var name:String
    var wing:Int
    var beak:String

    constructor(name: String,  beak:String) {
        this.name = name
        this.wing = 2
        this.beak = beak
    }

    constructor(name: String, wing:Int, beak:String) {
        this.name = name
        this.wing = wing
        this.beak = beak
    }

//    init {
//        println("--InitStart--")
//        name = name.capitalize()
//        println("name : $name , wing : $wing, beak : $beak")
//        println("--InitEnd--")
//    }
    // 메서드
    fun fly() {
        println("fly")
    }
}

fun main() {
    val coco = part2.chap01.section2.Bird("coco", 2, "long")
    val coco2 = part2.chap01.section2.Bird("coco", "long")
    coco.fly()
    println(coco.name)
    println("coco2 name: ${coco2.name}")
}