package part1.chap02.section2

// 공간 제약에 따른 부동 소수점 연산의 단점
fun main() {
    var num: Double = 0.1
    for (x in 0..999) {
        num += 0.1
    }
    println("num : $num")
}