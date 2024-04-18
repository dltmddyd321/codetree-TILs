import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    val a = 5.26
    val b = 8.27
    val decimalFormat = DecimalFormat("0.000")
    println(decimalFormat.format(a * b))
}