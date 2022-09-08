package part2.chap03.section2

interface Switcher {
    fun on():String
}

class SmartPhone(val model:String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size:Int) {
        fun getInfo() = "$model : Install on $cpu with ${size}GB"
    }

    fun powerOn(): String {
        class Led(val color:String) { // 지역 클래스 선언
            fun blink() : String = "Blinking $color on $model" // 외부 프로퍼티 접근 가능
        }
        val powerStatus = Led("RED") // 여기서 지역클래스가 사용됨
        val powerSwitch = object: Switcher { // 익명 객체를 사용해 switcher의 on() 을 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        } // 익명 객체 블록의 끝
        return powerSwitch.on() // 익명 객체의 메서드 사용
    }
}

fun main() {
    val myPhone = SmartPhone("S7").ExternalStorage(256)
    println(myPhone.getInfo())
}