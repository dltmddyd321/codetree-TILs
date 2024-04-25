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

fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        // n, m을 입력받습니다.
        val n = sc.nextInt()
        val m = sc.nextInt()

        // 2차원 배열을 구현합니다.
        val arr = Array(100) { IntArray(100) }

        var count = 0
        for (col in 0 until m) {
            if (col % 2 == 0) {
                for (row in 0 until n) {
                    arr[row][col] = count
                    count++
                }
            } else {
                for (row in n - 1 downTo 0) {
                    arr[row][col] = count
                    count++
                }
            }
        }

        for (row in 0 until n) {
            for (col in 0 until m) {
                print(arr[row][col].toString() + " ")
            }
            println()
        }
    }