package implementation
import java.util.*
data class Pair(val x:Int,val y:Int)
fun main()=with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dx = arrayOf(-1, 1, 2, 2, 1, -1, -2, -2)
    val dy = arrayOf(2, 2, 1, -1, -2, -2, -1, 1)
    var bfs = 0

    repeat(n) {
        val size = readLine().toInt()
        var visited = Array(size) { BooleanArray(size) { false } }
        val chessmap = Array(size) { IntArray(size) }
        val (sx, sy) = readln().split(" ").map { it.toInt() }
        val (gx, gy) = readln().split(" ").map { it.toInt() }
        fun bfs(): Int {
            var count = 1
            if (sx == gx && sy == gy) {
                return 0
            }
            val que: Queue<Pair> = LinkedList()
            que.add(Pair(sx, sy))
            visited[sx][sy] = true

            while (que.isNotEmpty()) {
                val qsize = que.size
                for (i in 0 until qsize) {
                    val (cx, cy) = que.remove()
                    if (cx == gx && cy == gy) {
                        return count
                    }
                    for (j in 0 until 8) {
                        val nx = cx + dx[j]
                        val ny = cy + dy[j]
                    if (nx in 0 until chessmap.size && ny in 0 until chessmap.size && !visited[nx][ny]) {
                            que.add(Pair(nx, ny))
                            visited[nx][ny] = true
                        }
                    }
                }
                count++
            }
            return -1
        }
        val result=bfs()
        println(result)
    }
}


