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
    val list = mutableListOf<String>()
    val scanner = Scanner(System.`in`)
    repeat(4) {
        list.add(scanner.next())
    }

    for (i in list.indices.reversed()) {
        println(list[i])
    }
}