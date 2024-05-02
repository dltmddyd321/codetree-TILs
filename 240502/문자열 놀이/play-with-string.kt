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
    val (input, cnt) = scanner.nextLine().split(" ")
    var arr = input.toCharArray()
    fun check(str: String) {
        val (mode, a, b) = str.split(" ")
        when (mode.toInt()) {
            1 -> {
                val tmp1 = arr[a.toInt() - 1]
                val tmp2 = arr[b.toInt() - 1]
                arr[b.toInt() - 1] = tmp1
                arr[a.toInt() - 1] = tmp2
                println(arr.joinToString().replace(",", "").replace(" ", ""))
            }
            else -> {
                val res = arr.joinToString().replace(a, b).replace(",", "").replace(" ", "")
                arr = res.toCharArray()
                println(res)
            }
        }
    }

    repeat(cnt.toInt()) {
        check(scanner.nextLine())
    }
}