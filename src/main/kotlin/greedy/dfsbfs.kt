package greedy

fun main() = with(System.`in`.bufferedReader()) {
    val (n,m,v) = readLine().split(" ").map { it.toInt() }

    val graph = Array(n+1) { mutableListOf<Int>() }
    repeat(m) {
        val (a,b) = readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val dfsList = mutableListOf<Int>()

    for (i in 1..n) {
        graph[i].sort()
    }

    val visited = BooleanArray(n+1){ false }

    fun dfs(node :Int) {
        visited[node] = true
        dfsList.add(node)

        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor)
            }
        }
    }

    dfs(v)


}