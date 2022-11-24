package part2.chap06.section1

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val myService: ExecutorService = Executors.newFixedThreadPool(8)
    var i = 0;

//    while (i < items.size) {
//        val item = items[i]
//        myService.submit {
//            processItem(item)
//        }
//        i ++
//    }
}