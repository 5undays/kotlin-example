package part2.chap05.section1

fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")
    var mixed = listOf(1, 2, "3", "4")

    for (name in names) {
        println(name)
    }

    for (num in numbers) print(num)
    println()

    val mutableNames = names.toMutableList()
    mutableNames.add("four")
    println(mutableNames)

    for (index in numbers.indices) {
        println(numbers[index])
    }

    val emptylist: List<String> = emptyList();

    val emptyList2: List<Int> = listOfNotNull(2, 45, null, 33, 1)
    println(emptyList2)
}