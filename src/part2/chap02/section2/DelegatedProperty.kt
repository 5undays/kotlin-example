package part2.chap02.section2

import kotlin.properties.Delegates

class User {
    // observable 은 값의 번화를 감시하는 일종의 콜백 루틴
    var name:String by Delegates.observable("NONAME") { // 프로퍼티를 위임
        prop, old, new -> // 람다식 매개변수로 프로퍼티, 기존값, 새로운 값
        println("$old -> $new") // 이부분은 이벤트가 발생될때만 실행됨
    }
}
fun main() {
    val user = User()
    user.name = "kildong"// 값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Dooly" // 값이 변경되는 시점에서 두번째 이벤트 발생
}