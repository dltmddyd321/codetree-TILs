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
    val scanner = Scanner(System.`in`)
    val arr = mutableListOf<Int>()
    var temp = ""
    val (first, second) = scanner.nextLine().split(" ")
    fun check(input: String) {
        for (i in input) {
            if (i.isDigit()) temp += i
            else {
                arr.add(temp.toInt())
                temp = ""
                return
            }
        }
    }
    check(first)
    check(second)
    if (arr.size > 1) {
        println(arr[0] + arr[1])
    } else {
        println(arr[0])
    }
}