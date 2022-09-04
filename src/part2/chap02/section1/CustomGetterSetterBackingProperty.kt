package part2.chap02.section1

class User2(id:Int, name:String, age:Int) {
    val id:Int = id
    private var tempName:String? =null
    var name:String = name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age:Int = age
}
fun main() {
    val user1 = User2(1,"Kildong", 34)
    user1.name = ""
    println("user.name :${user1.name}")
}