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
    fun compressString(input: String): String {
        if (input.isEmpty()) return ""
        val result = StringBuilder()

        var currentChar = input.first()
        var count = 1

        for (i in 1 until input.length) {
            if (input[i] == currentChar) {
                count++
            } else {
                result.append("$currentChar$count")
                currentChar = input[i]
                count = 1
            }
        }
        result.append("$currentChar$count")

        return result.toString()
    }

    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val res = compressString(input)
    println(res.length)
    println(res)
}