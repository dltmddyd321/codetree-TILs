import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    val feetToCmConversionFactor = 30.48
    val mileToCmConversionFactor = 160934

    // 계산
    val feetInCm = 9.2 * feetToCmConversionFactor
    val milesInCm = 1.3 * mileToCmConversionFactor

    // DecimalFormat 객체 생성 및 설정
    val decimalFormat = DecimalFormat("0.0")

    // 결과 포매팅 및 출력
    val formattedFeet = decimalFormat.format(feetInCm)
    val formattedMiles = decimalFormat.format(milesInCm)

    println("9.2ft = ${formattedFeet}cm")
    println("1.3mi = ${formattedMiles}cm")
}