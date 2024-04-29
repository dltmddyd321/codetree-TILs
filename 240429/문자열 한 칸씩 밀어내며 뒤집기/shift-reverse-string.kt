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
    val queue: Deque<Char> = LinkedList()
    fun execute(value: Int) {
        when (value) {
            1 -> {
                val out = queue.pollFirst()
                queue.addLast(out)
                println(queue.joinToString(""))
            }
            2 -> {
                val out = queue.pollLast()
                queue.addFirst(out)
                println(queue.joinToString(""))
            }
            3 -> {
                val reverse = queue.reversed()
                queue.clear()
                queue.addAll(reverse)
                println(queue.joinToString(""))
            }
        }
    }
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    input.forEach { queue.offer(it) }
    val cnt = scanner.next().toInt()
    repeat(cnt) { execute(scanner.nextInt()) }
}