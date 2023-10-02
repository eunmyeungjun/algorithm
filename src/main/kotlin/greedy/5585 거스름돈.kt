/*
package 그리디

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner: Scanner = Scanner(System.`in`)
    val PAYMENT = 1000
    val price = scanner.nextInt()
    val change = PAYMENT - price
    var currentChange = change

    val coinList = listOf(500, 100, 50, 10, 5, 1)
    var answer = 0

    for (coin in coinList) {
        if (currentChange / coin >= 1) {
            answer += (currentChange / coin)
            currentChange %= coin
        }
    }

    println(answer)

}

 */