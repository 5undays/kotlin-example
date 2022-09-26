package part2.chap04.section2

data class Product2(val name: String, val price: Double)
fun main() {
    val products = arrayOf(
        Product2("snow ball", 870.00),
        Product2("smart phone", 1000.00),
        Product2("Drone", 200.11),
        Product2("mouse", 100.00)
    )

    // 두 객체의 비교 p1 이 크면 1 같으면 0 작으면 -1
    products.sortWith(Comparator<Product2> { p1, p2 -> when {
        p1.price > p2.price -> 1
        p1.price == p2.price -> 0
        else -> -1
    } })

    products.forEach { println(it) }
    println()

    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
    println()

    println(products.minBy { it.price })
    println(products.maxBy { it.price })
}