import java.lang.StringBuilder
import java.util.Scanner
import java.util.Stack
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    fun check(cold: String, score: Int) {
        if (cold == "Y" && score >= 37) {
            a ++
        } else if (cold == "N" && score >= 37) {
            b ++
        } else if (cold == "Y" && score < 37) {
            c ++
        } else {
            d ++
        }
    }

    repeat(3) {
        val cold = scanner.next()
        val score = scanner.nextInt()
        check(cold, score)
    }
    val str = StringBuilder()
    str.append("$a $b $c $d ")
    if (a >= 2) str.append("E")
    println(str)
}