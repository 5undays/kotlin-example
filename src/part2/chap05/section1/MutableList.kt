package part2.chap05.section1

fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong", "dooly", "chelsu")
    mutableList.add("ben")
    mutableList.removeAt(1)
    mutableList[0] = "Sean"
    println(mutableList)

    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'X')
}