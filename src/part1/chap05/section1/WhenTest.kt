package part1.chap05.section1

fun main() {
    println("Enter the Score :")
    val score = readLine()!!.toDouble();
    var grade:Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade= 'C'
    }

//    if (score >= 90.0) {
//        grade = 'A'
//    } else if (score >= 80 && score < 90) {
//       grade = 'B'
//    } else if (score >=70 && score < 80){
//        grade = 'C'
//    }

    println("score :$score grade :$grade")
}