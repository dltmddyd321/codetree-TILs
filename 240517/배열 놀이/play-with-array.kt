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

    // 첫 줄 입력
    val n = scanner.nextInt()
    val q = scanner.nextInt()
    scanner.nextLine() // 개행 문자 처리

    // n개의 원소 입력
    val elements = scanner.nextLine().split(" ").map { it.toInt() }

    // 질의 처리
    for (i in 0 until q) {
        val query = scanner.nextLine().split(" ")
        when (query[0].toInt()) {
            1 -> {
                val a = query[1].toInt()
                println(elements[a - 1])
            }
            2 -> {
                val b = query[1].toInt()
                val index = elements.indexOf(b)
                if (index != -1) {
                    println(index + 1)
                } else {
                    println(0)
                }
            }
            3 -> {
                val s = query[1].toInt()
                val e = query[2].toInt()
                val result = elements.subList(s - 1, e).joinToString(" ")
                println(result)
            }
        }
    }
}