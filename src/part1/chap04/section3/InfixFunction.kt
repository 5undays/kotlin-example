package part1.chap04.section3

fun main() {
    // 일반 표현법
    var multi = 3.multiply(10)
    // 중위 표현법
    val multi2 = 3 multiply 10
    println("multi : $multi2")
}

// Int 를 확장해서 multiply() 함수가 추가 되었음
infix fun Int.multiply(x:Int): Int { // infix 로 선언되었음으로 중위함수
    return x*this
}