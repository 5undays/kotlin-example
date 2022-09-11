package part3.chap01

open class Parent

class Child: Parent()

class Cup<T>

fun main() {
    val obj1:Parent = Child()
    //val obj2:Child = Parent() // 에러 child 객체 obj2 는 parent 로 변환 불가

    //val obj3: Cup<Parent> = Cup<Child>() // 에러
    //val obj4:Cup<Child> = Cup<Parent>() // 에러

    val obj5 = Cup<Child>();
    val obj6: Cup<Child> = obj5
}