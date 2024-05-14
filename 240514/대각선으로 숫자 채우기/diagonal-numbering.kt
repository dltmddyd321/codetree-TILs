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

fun fillDiagonalMatrix(n: Int, m: Int): Array<Array<Int>> {
    val matrix = Array(n) { Array(m) { 0 } }
    var num = 1

    // 대각선 방향으로 숫자 채우기
    for (line in 1..(n + m - 1)) {
        val startRow = maxOf(0, line - m)
        val count = minOf(line, minOf((n - startRow), m))

        for (j in 0 until count) {
            matrix[startRow + j][minOf(m, line) - j - 1] = num++
        }
    }

    return matrix
}

fun printMatrix(matrix: Array<Array<Int>>) {
    for (row in matrix) {
        for (num in row) {
            print("$num ")
        }
        println()
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    val matrix = fillDiagonalMatrix(n, m)
    printMatrix(matrix)
}