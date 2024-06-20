import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val str = StringBuilder()
    
    for (i in 1..a) {
        if (i % 3 == 0 || i.toString.contains("3") || i.toString.contains("6") || i.toString.contains("9")) {
            str.append("0 ")
        } else {
            str.append("$i ")
        }
    }
    
    println(str.toString())
}