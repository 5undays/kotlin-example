package part1.chap04.section2

fun main() {
    twoParam({a,b->"First $a $b"}, {"Second $it"})
    twoParam({a,b->"First $a $b"}) {"Second $it"} // 위와 동일
}

fun twoParam(first:(String,String)->String,second:(String)->String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}
