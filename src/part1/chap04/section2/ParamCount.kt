package part1.chap04.section2

fun main() {
    noParam({"Hello World!"})
    noParam { "Hello World!" } // 위와 동일한 결과 출력

    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" }

    moreParam { _, s2 -> "Hello Word! $s2" }

    withArgs("Args","Args2", {a,b -> "Hello World! $a $b"})
}

//
fun noParam(out:() -> String) = println(out())

// 매개변수가 하나 있는 람다식 함수가 oneParam 함수의 매개변수 out 으로 지정됨
fun oneParam(out:(String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("oneParam", "twoParam"))
}

// 일반 매개변수를 2개 포함 람다식 함수를 마지막 매개변수로 가짐
fun withArgs(a:String, b:String, out:(String, String) ->String) {
    println(out(a,b))
}