import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()

    println(a * a)
    if (a < 5) println("tiny")
}