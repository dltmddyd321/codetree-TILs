import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    val hap = a + b
    val char = a - b

    val result = hap.toDouble() / char.toDouble()
    val roundedResult = "%.2f".format(result)
    println(roundedResult)
}