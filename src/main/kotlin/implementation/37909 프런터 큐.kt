package implementation


import java.util.*


fun main() = with(System.`in`.bufferedReader()) {
    val x = readLine().toInt()

    repeat(x) {
        val (n,m) = readLine().split(" ").map { it.toInt() }
        val q : Queue<MutableMap<Int,Int>> = ArrayDeque()
        var count = 0

        val arr = readLine().split(" ").map { it.toInt() }



        for (i in 0 until n) {
            val map = mutableMapOf(i to arr[i])
            q.add(map)
        }


        while (q.isNotEmpty()) {
            val currentKey = q.peek().keys.first()
            val currentValue = q.peek().values.first()



            if (q.any { it.values.first() > currentValue }) {
                q.add(q.poll())
            } else {
                q.poll()
                count++
                if (currentKey == m) break
            }
        }

        println(count)

    }
}