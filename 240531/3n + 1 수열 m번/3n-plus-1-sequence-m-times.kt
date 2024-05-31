import java.util.Scanner

fun main() {
    fun check(input: Int): Int {
        var num = input
        var cnt = 0
        while (true) {
            if (num == 1) break
            if (num % 2 == 0) { //짝
                num /= 2
                cnt ++
            } else { //홀
                num = num * 3 + 1
                cnt ++
            }
        }
        return cnt
    }
    val sc = Scanner(System.`in`)
    val n = sc.nextLine().toInt()
    repeat(n) {
        println(check(sc.nextLine().toInt()))
    }
}