import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()

    if (input <= 0) return

    // Check if input is a power of 2
    if (input and (input - 1) != 0) return

    // Calculate the exponent x
    var n = input
    var x = 0
    while (n > 1) {
        n /= 2
        x++
    }

    println(x)
}