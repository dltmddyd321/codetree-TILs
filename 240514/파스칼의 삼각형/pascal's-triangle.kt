import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
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
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

fun main() {

    fun printPascalTriangle(triangle: List<List<Int>>) {
        // 파스칼 삼각형 출력
        for (row in triangle) {
            for (number in row) {
                print("$number ")
            }
            println()
        }
    }

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val triangle = MutableList(n) { MutableList(it + 1) { 1 } }

    for (i in 2 until n) {
        for (j in 1 until i) {
            triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
        }
    }

    printPascalTriangle(triangle)
}