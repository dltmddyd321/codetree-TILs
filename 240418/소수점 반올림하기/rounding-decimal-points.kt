fun main() {
    val number = 25.352
    val decimalFormat = DecimalFormat("0.0")
    val formattedNumber = decimalFormat.format(number)
    println(formattedNumber)
}