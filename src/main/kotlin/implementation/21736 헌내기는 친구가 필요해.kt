package implementation

fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val campus = Array(N) { CharArray(M) }
    var people = 0
    val dx = listOf(0, 0, 1, -1)
    val dy = listOf(1, -1, 0, 0)

    for (i in 0 until N) {
        val input = readLine()!!.toCharArray()
        campus[i] = input
    }

    fun move(x: Int, y: Int) {
        for (k in 0 until 4) {
            val zx = x + dx[k]
            val zy = y + dy[k]
            if (zx in 0 until N && zy in 0 until M && campus[zx][zy] != ' ') {
                if (campus[zx][zy] == 'P') {
                    people++
                    campus[zx][zy] = ' '
                    move(zx, zy)
                }
                if (campus[zx][zy] == 'O') {
                    campus[zx][zy] = ' '
                    move(zx, zy)
                }
                if (campus[zx][zy] == 'X') {
                    return
                }
            }
        }
    }

    for (l in 0 until N) {
        for (m in 0 until M) {
            if (campus[l][m] == 'I') {
                move(l, m)
            }
        }
    }

    when (people) {
        0 -> println("TT")
        else -> println("$people")
    }
}
