import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = scanner.nextLine().split(" ").map { it.toInt() }
    val arrUnder = arr.filter { it < 500 }.sortedDescending()
    val arrOver = arr.filter { it > 500 }.sorted()

    println("${arrUnder.first()} ${arrOver.first()}")
}