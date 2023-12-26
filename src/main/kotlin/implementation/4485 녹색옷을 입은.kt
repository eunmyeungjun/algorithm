package implementation

import java.util.PriorityQueue


data class Point(val x: Int, val y: Int, val value: Int) : Comparable<Point> {
    override fun compareTo(other: Point) = value - other.value
}

fun main() = with(System.`in`.bufferedReader()) {
    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, -1, 0)
    lateinit var map: Array<IntArray>

    var num = 0


    fun dfs(): Int {
        val cost = Array(num) { IntArray(num) { Int.MAX_VALUE } }
        val que = PriorityQueue<Point>()

        cost[0][0] = map[0][0]
        que.offer(Point(0, 0, map[0][0]))

        while (que.isNotEmpty()) {
            val cur = que.poll()

            for (i in 0 until 4) {
                val nx = cur.x + dx[i]
                val ny = cur.y + dy[i]

                if (nx < 0 || ny < 0 || nx >= num || ny >= num) continue

                if (cost[nx][ny] > cost[cur.x][cur.y] + map[nx][ny]) {
                    cost[nx][ny] = cost[cur.x][cur.y] + map[nx][ny]
                    que.offer(Point(nx, ny, cost[nx][ny]))
                }
            }
        }
        return cost[num -1][num -1]

    }

    var time = 1
    while (true){
        num = readLine().toInt()
        if (num == 0){
            break
        }

        map = Array(num){IntArray(num)}

        for (i in 0 until num){
            val input = readLine().split(" ").map { it.toInt() }
            for (j in 0 until num){
                map[i][j] = input[j]
            }
        }
        println("Problem $time: ${dfs()}")
        time++
    }


}





