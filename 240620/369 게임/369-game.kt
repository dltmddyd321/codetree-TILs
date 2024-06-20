import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val str = StringBuilder()
    
    for (i in 1..a) {
        if (i % 3 == 0) {
            str.append("0 ")
        } else {
            str.append("$i ")
        }
    }
    
    println(str.toString())
}