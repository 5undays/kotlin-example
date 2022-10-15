package part2.chap05.section1

fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "WOw")
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}