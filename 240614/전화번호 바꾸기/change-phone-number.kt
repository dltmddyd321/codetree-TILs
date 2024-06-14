import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val inputs = scanner.nextLine().split("-").toMutableList()
    val first = inputs[1]
    val second = inputs[2]

    inputs[1] = second
    inputs[2] = first

    println("${inputs[0]}-${inputs[1]}-${inputs[2]}")
}