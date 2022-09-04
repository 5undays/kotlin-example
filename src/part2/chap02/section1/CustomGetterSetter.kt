package part2.chap02.section1

class User1(id:Int, name:String, age:Int) {
    val id:Int = id
    var name:String =name
        set(value) {
            println("The name was changed")
        }
    var age:Int = age
}
fun main() {
    val user1 = User1(1,"kildong", 34)
    user1.name = "coco"
    println("user3.name=${user1.name}")
}