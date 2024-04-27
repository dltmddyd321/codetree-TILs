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
    fun removeOccurrences(source: String, toRemove: String): String {
        var result = source
        while (result.contains(toRemove)) {
            result = result.replace(toRemove, "")
        }
        return result
    }
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val check = scanner.nextLine()
    println(removeOccurrences(input, check))
}