package part2.chap02.section1

class User(id:Int, name:String, age:Int) {
    val id:Int =id
        get() = field

    var name:String = name
        get() = field
        set(value) {
            field = value
        }

    var age:Int = age
        get() = field
        set(value) {
            field = value
        }
}
fun main() {
    val user1 = User(1, "Kildong", 30)
//    user1.id = 2 // 에러
    user1.age= 30
    println("user1.age :${user1.age}")
}