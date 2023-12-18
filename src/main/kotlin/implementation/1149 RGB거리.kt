package implementation

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val r = mutableListOf<Int>()
    val g = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    val minR = Array(N) { 0 }
    val minG = Array(N) { 0 }
    val minB = Array(N) { 0 }
    repeat(N) {
        val (red, green, blue) = readLine().split(" ").map { it.toInt() }
        r += red
        g += green
        b += blue
    }
    minR[0] = r[0]
    minG[0] = g[0]
    minB[0] = b[0]
    for (i in 1 until N) {
        minR[i] = min(minG[i - 1], minB[i - 1]) + r[i]
        minG[i] = min(minR[i - 1], minB[i - 1]) + g[i]
        minB[i] = min(minR[i - 1], minG[i - 1]) + b[i]
    }
    val answer = min(minR[N-1] , min(minG[N-1], minB[N-1]))

    println(answer)
}