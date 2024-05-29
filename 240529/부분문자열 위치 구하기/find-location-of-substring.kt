import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val all = scanner.nextLine()
    val part = scanner.nextLine()

    if (!all.contains(part)) {
        println(-1)
        return
    }

    println(all.indexOf(part))
}