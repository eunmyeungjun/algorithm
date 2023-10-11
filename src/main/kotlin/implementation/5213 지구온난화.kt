package implementation

import java.lang.StringBuilder
fun main()= with(System.`in`.bufferedReader()) {
    val (R, C) = readln().split(" ").map { it.toInt() }
    val zido = Array(R) { CharArray(C) }
    for (i in 0 until R) {
        zido[i] = readln().toCharArray()
    }
    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)
    var minR = 10
    var maxR = 0
    var minC = 10
    var maxC = 0

    val afterZido = Array(R) { CharArray(C) }
    for (j in 0 until R) {
        for (k in 0 until C) {
            if (zido[j][k] == 'X') {
                var sea = 0
                for (l in 0 until 4) {

                    val x = j + dx[l]
                    val y = k + dy[l]

                    if (x == -1 || y == -1 || x >= R || y >= C || zido[x][y] == '.') {
                        sea++
                    }
                }
                if (sea < 3) {
                    afterZido[j][k] = 'X'

                    minR = minOf(minR, j)
                    minC = minOf(minC, k)
                    maxR = maxOf(maxR, j)
                    maxC = maxOf(maxC, k)
                } else {
                    afterZido[j][k] = '.'
                }
            } else {
                afterZido[j][k] = '.'
            }
        }
    }
    val answer = StringBuilder()
    for (m in minR ..maxR) {
        for (n in minC ..maxC) {
            answer.append(afterZido[m][n])
        }
        answer.append("\n")
    }
    println(answer)
}

