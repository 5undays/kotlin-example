package part1.chap06.section7

fun main() {
    data class User (val name :String, var skills: String, var email:String? = null)
    val user = User("Kildong", "Kotlin")
    val result = with(user) {
        skills = "Swift"
        email = "kildong@example.com"
    }

    println(user)
    println(result)
}