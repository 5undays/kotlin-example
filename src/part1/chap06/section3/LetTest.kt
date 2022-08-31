package part1.chap06.section3

fun main() {
    val score:Int? = 32
    // var score = null

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score : $score")
        }
    }

    // let 을 이용해서 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score : $it") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()
}