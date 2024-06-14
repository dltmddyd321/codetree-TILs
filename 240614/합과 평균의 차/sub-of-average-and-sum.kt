import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val hap = a + b + c

    println(hap)
    println(hap / 3)
    println(hap - (hap / 3))
}