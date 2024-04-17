import java.text.DecimalFormat
import java.math.RoundingMode

fun main() {
    val a = 13
    val b = 0.165000
    val decimalFormat = DecimalFormat("0.000000")  //소수점 2번째 자리까지 자름
    decimalFormat.roundingMode = RoundingMode.DOWN
    val res = decimalFormat.format(a * b)
    println("$a * ${decimalFormat.format(b)} = $res")
}