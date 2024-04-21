import java.io.*
import java.math.RoundingMode
import java.text.DecimalFormat
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
    val br = System.`in`.bufferedReader()
    val (n, k) = br.readLine().split(" ").map { it }
    
    if (n.length > k.length) {
        println("$n ${n.length}")
    } else if (n.length < k.length) {
        println("$k ${k.length}")
    } else {
        println("same")
    }
}