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
    val arr = mutableListOf<String>()
    val scanner = Scanner(System.`in`)
    val first = scanner.nextLine()
    arr.add(first)
    val second = scanner.nextLine()
    arr.add(second)
    val third = scanner.nextLine()
    arr.add(third)

    val short = arr.minOf { it.length }
    val long = arr.maxOf { it.length }

    print(long - short)
}