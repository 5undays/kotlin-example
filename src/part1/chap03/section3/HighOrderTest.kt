package part1.chap03.section3

fun highFunc (a:Int,b:Int,sum:(Int, Int) -> Int):Int {
    return sum(a,b)
}

fun main() {
    // 람다식을 매개변수와 인자로 사용한 함수
    var result = highFunc(1,3) {x,y->x+y}
    println(result)
}