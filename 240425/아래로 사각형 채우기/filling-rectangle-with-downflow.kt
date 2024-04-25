import java.io.*
import java.util.Arrays
import java.util.Deque
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner
import java.util.Stack
import java.util.StringTokenizer
import java.util.TreeMap
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.math.*

fun main() {

    fun printSquare(n: Int) {
        for (i in 1..n) {
            for (j in 0 until n) {
                print("${i + j * n} ")
            }
            println()
        }
    }
    
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    printSquare(n)
}