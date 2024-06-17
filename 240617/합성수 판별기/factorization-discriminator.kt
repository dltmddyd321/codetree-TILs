import java.util.Scanner

fun isComposite(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return true
    }
    return false
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    if (isComposite(n)) {
        println("C")
    } else {
        println("N")
    }
}