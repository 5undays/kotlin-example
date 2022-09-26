package part2.chap04.section2

data class Product(val name: String, val price: Double)
fun main() {
    val products = arrayOf(
        Product("snow ball", 870.00),
        Product("smart phone", 1000.00),
        Product("Drone", 200.11),
        Product("mouse", 100.00)
    )

    products.sortBy { it.price }
    products.forEach { println(it) }
}