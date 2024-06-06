import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()

    fun isPerfectNumber(n: Int): Boolean {
        var sum = 0
        for (i in 1 until n) {
            if (n % i == 0) {
                sum += i
            }
        }
        return sum == n
    }

    var count = 0
    for (n in start..end) {
        if (isPerfectNumber(n)) {
            count++
        }
    }

    println(count)
}