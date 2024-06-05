import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()

    fun isResult(i: Int): Boolean {
        var cnt = 0
        for (j in 1..i) {
            if (i % j == 0) cnt ++
        }
        return cnt == 3
    }

    var res = 0
    for (i in start..end) {
        if (isResult(i)) res ++
    }
    println(res)
}