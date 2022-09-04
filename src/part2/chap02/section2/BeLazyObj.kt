package part2.chap02.section2

class Person2(val name:String, val age:Int)

fun main() {
    var isPersonInstantiated:Boolean =false // 초기화 확인 용도
    val person:Person2 by lazy { // lazy 를 사용한 Person객체의 지연 초기화
        isPersonInstantiated = true
        Person2("Kim", 23) // 이 부분이 Lazy 객체로 반환됨
    }
    val personDelegate = lazy { Person2("Park",24) } // 위임 변수를 사용한 초기화

    println("person Init : $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
    println("person.name :${person.name}") // 이시점에서 초기화
    println("personDelegate Init :${personDelegate.value.name}") // 이시점에서 초기화
    println("person Init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")
}