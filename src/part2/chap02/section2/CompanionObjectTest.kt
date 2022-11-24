package part2.chap02.section2

class Person4 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working..")
        }
    }
}
fun main() {
    println(Person4.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person4.language = "English" // 기본값 변경 가능
    println(Person4.language) // 변경된 내용 출력
    Person4.work() // 메서드 실행
    //println(Person4.name) // name은 companion object가 아니기 때문에 초기화가 필요
}