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

fun main () {
    val arr = listOf("apple", "banana", "grape", "blueberry", "orange")
    val scanner = Scanner(System.`in`)
    val input = scanner.next()

    val res = mutableListOf<String>()
    var cnt = 0
    arr.forEach {
        val third = it.getOrNull(2)
        val fourth = it.getOrNull(3)
        if (third != null && third.toString() == input) {
            res.add(it)
            cnt ++
        } else if (fourth != null && fourth.toString() == input) {
            res.add(it)
            cnt ++
        }
    }
    res.forEach {
        println(it)
    }
    println(cnt)
}