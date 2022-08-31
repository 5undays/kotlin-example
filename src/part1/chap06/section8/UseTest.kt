package part1.chap06.section8

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}