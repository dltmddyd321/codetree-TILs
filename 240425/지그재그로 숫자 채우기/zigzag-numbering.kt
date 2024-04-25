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
    fun printRectangle(width: Int, height: Int) {
        // 각 행에 대해서
        for (i in 0 until height) {
            var start = i
            // 각 열에 대해서
            for (j in 0 until width) {
                print("$start ")
                start += height  // 다음 열의 숫자는 현재 행의 높이만큼 증가
            }
            println() // 각 행이 끝날 때마다 줄바꿈
        }
    }
    val scanner = Scanner(System.`in`)
    val height = scanner.nextInt()
    val width = scanner.nextInt()
    printRectangle(width, height)
}