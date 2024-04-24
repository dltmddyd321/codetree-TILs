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
    val scanner = Scanner(System.`in`)
    var min = 0
    var max = 0
    val first = scanner.nextLine()
    min = first.length
    max = first.length

    val second = scanner.nextLine()
    if (second.length < min) min = second.length
    if (second.length > max) max = second.length

    val third = scanner.nextLine()
    if (third.length < min) min = third.length
    if (third.length > max) max = third.length

    print(max - min)
}