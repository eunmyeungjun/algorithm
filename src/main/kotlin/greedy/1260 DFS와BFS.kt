//package greedy
//
//import java.util.*
//import kotlin.collections.ArrayDeque
//
///*
//첫줄에 정점의 갯수 n 간선의 갯수 m 탐색을 시작할 정점의 번호 v
//
//
//
//입력
//4 5 1
//1 2
//1 3
//1 4
//2 4
//3 4
//
//---
//
//  0 1 2 3 4
//1 0 0 1 1 1
//2 0 1 0 0 1
//3 0 1 0 0 1
//4 0 1 1 1 0
//
//
//출력
//1 2 4 3
//1 2 3 4
//
// */
//
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val sb = StringBuilder()
//    val st = StringTokenizer(readLine())
//
//    val n = st.nextToken().toInt()
//    val m = st.nextToken().toInt()
//    val v = st.nextToken().toInt()
//
//    val arr = Array(n+1){IntArray(n+1)}
//    val isVisited = BooleanArray(n+1)
//
//    repeat(m) {
//        val index = StringTokenizer(readLine())
//        val x = index.nextToken().toInt()
//        val y = index.nextToken().toInt()
//
//        arr[x][y] = 1
//        arr[y][x] = 1
//    }
//
//    fun dfs(node:Int) {
//        isVisited[node] = true
//        sb.append("$node ")
//
//        for (i in 1 until arr.size) {
//            if (arr[node][i] == 1 && !isVisited[i]) {
//                dfs(i)
//            }
//        }
//
//    }
//
//
//    fun bfs(start: Int) {
//        val q = ArrayDeque<Int>()
//        q.add(start)
//        isVisited[start] = true
//
//        while (q.isNotEmpty()) {
//            val node = q.removeFirst()
//            sb.append("$node ")
//
//            for (j in 1 until arr.size) {
//                if (arr[node][j] == 1 && !isVisited[j]) {
//                    q.add(j)
//                    isVisited[j] = true
//                }
//            }
//        }
//
//    }
//
//    dfs(v)
//    sb.append("\n")
//    isVisited.fill(false)
//    bfs(v)
//
//
//    print(sb)
//
//
//
//
//
//
//
//
//
//
//}
//
//
//
