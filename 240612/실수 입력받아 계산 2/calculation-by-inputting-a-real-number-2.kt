import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextDouble()
    val result = a + 1.5
    println(String.format("%.2f", result))
}