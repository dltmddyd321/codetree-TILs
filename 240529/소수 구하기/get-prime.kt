import java.util.Scanner

fun findPrimesUpTo(n: Int): List<Int> {
    if (n < 2) return emptyList()

    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..n) {
        if (isPrime[i]) {
            for (j in i * 2..n step i) {
                isPrime[j] = false
            }
        }
    }

    return isPrime.indices.filter { isPrime[it] }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val primes = findPrimesUpTo(n)
    println(primes.joinToString(" "))
}