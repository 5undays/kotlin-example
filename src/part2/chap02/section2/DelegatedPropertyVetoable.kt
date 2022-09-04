package part2.chap02.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { // 초기값은 0
        property, oldValue, newValue ->
        newValue > oldValue // 조건에 맞지 않으면 거부권 행사
    }

    println(max) // 0
    max = 10
    println(max) // 10

    // 여기서는 기존값이 새값보다 크므로 false임으로 5가 할당되지 않는다
    max = 5
    println(max) // 10
}