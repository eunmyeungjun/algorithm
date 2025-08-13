package implementation

import java.util.PriorityQueue
import kotlin.Pair


/*
18352 특정 거리의 도시 찾기

첫째 줄에 도시의 개수 N, 도로의 개수 M, 거리 정보 K, 출발 도시의 번호 X

4 4 2 1
1 2
1 3
2 3
2 4

 */

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n,m,k,x) = readLine().split(" ").map { it.toInt() }

    val arr = Array(n+1) { mutableListOf<Int>()}
    val distance = IntArray(n+1){ Int.MAX_VALUE}

    repeat(m) {
        val(a,b) = readLine().split(" ").map{ it.toInt() }
        arr[a].add(b)
    }


    distance[x] = 0

    val pq = PriorityQueue<Pair<Int, Int>>(compareBy {it.first})
    pq.offer(Pair(0,x))

    while (pq.isNotEmpty()) {
        val (d,u) = pq.poll()

        if (d > distance[u]) continue

        for (i in arr[u]) {
            val newDist = d +1
            if (newDist < distance[i]) {
                distance[i] = newDist
                pq.add(Pair(newDist,i))
            }
        }

    }

    for (j in 1..n) {
        if (distance[j] == k) {
            sb.append(j).append("\n")
        }
    }

    if (sb.isEmpty()) sb.append(-1)




    print(sb)
}