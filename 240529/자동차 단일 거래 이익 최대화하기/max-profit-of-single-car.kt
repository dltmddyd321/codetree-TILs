import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()
    val arr = mutableListOf<Int>()
    repeat(n) {
        arr.add(scanner.nextInt())
    }
    val res = mutableListOf<Int>()
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            val tmp = arr[i] - arr[j]
            if (tmp < 0) res.add(tmp)
        }
    }
    if (res.isEmpty()) {
        println(0)
        return
    }

    val res2 = res.map { it * -1 }
    println(res2.max())
}