package part2.chap04.section1

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
    val result2 = getType<Int>(1)
    println("result2 = $result2")
    val result3 = getType<Double>(2)
    println("result3 = $result3")
}

inline fun <reified T> getType(value: Int) :T {
    println(T::class) // 실행 시간에 삭제되지 않고 사용 가능
    println(T::class.java)

    return when (T::class) { // 받아 들인 제네릭 자료형에 따라 반환
        Float::class -> value.toFloat() as T
        Int::class -> value.toInt() as T
        else -> throw IllegalStateException("${T::class} is not supported")
    }
}