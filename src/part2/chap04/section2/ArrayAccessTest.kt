package part2.chap04.section2

import java.util.*

fun main() {
    val arr = arrayOf(1,2,3,4,5)

    println(arr.get(1))
    println(arr[1])

    println(arr.size) // 배열의크기
    for (e in arr) {
        print(e)
    }

    println(Arrays.toString(arr)) // 배열의 내용을 문자로 나타냄
    println(arr.sum()) // 배열의 합

    // 세터에 의한 값의 설정
    arr.set(1, 8)
    println(Arrays.toString(arr))

    arr[1] = 8
    println(Arrays.toString(arr))
}