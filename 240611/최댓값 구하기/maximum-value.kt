import java.lang.StringBuilder
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    // 세 정수의 최댓값을 찾습니다.
    var max = a

    if (b > max) {
        max = b
    }

    if (c > max) {
        max = c
    }

    // 최댓값을 출력합니다.
    println(max)
}