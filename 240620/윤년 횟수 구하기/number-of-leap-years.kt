fun countLeapYears(n: Int): Int {
    var leapYearCount = 0
    for (year in 1..n) {
        if (isLeapYear(year)) {
            leapYearCount++
        }
    }
    return leapYearCount
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

fun main() {
    val n = readLine()!!.toInt()
    val leapYears = countLeapYears(n)
    println(leapYears)
}