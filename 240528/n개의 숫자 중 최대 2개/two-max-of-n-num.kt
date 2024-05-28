import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs
import kotlin.math.max

fun main(){
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val arr = mutableListOf<Int>()

    repeat(n) {
        arr.add(scan.nextInt())
    }

    arr.sortDescending()
    println("${arr.first()} ${arr[1]}")
}