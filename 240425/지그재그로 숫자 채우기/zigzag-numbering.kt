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
    fun printRectangle(height: Int, width: Int) {
        for (i in 0 until height) {
            for (j in 0 until width) {
                val number = if (j == 0) i else 2 * height - 1 - i
                print("$number ")
            }
            println()
        }
    }
    val scanner = Scanner(System.`in`)
    val height = scanner.nextInt()
    val width = scanner.nextInt()
    printRectangle(height, width)
}