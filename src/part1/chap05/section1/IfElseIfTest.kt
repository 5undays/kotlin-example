package part1.chap05.section1

fun main() {
    println("Enter the Score :")
    val score = readLine()!!.toDouble();
    var grade:Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80 && score < 90) {
       grade = 'B'
    } else if (score >=70 && score < 80){
        grade = 'C'
    }

    println("score :$score grade :$grade")
}