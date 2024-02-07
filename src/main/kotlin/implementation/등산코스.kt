package implementation

import java.util.*
import kotlin.math.*



lateinit var graph : List<PriorityQueue<root>>

fun main(){
    val n : Int = 6
    val paths = arrayOf(arrayOf(1,2,3), arrayOf(2,3,5),arrayOf(2,4,2),arrayOf(2,5,4)
    ,arrayOf(3,4,4),arrayOf(4,5,3),arrayOf(4,6,1),arrayOf(5,6,1))
    val gates = arrayOf(1,3)
    val summits = arrayOf(5)

    var answer = intArrayOf()


    graph = List(n+1) {PriorityQueue<root>()}

    paths.forEach {(from,to,weight) ->
        if (from in summits || to in gates) {
            graph[to].add(root(from,weight))
        } else if (to in summits || to in gates) {
            graph[from].add(root(from,weight))
        } else {
            graph[from].add(root(to,weight))
            graph[to].add(root(from,weight))
        }
    }


    fun dijkstra(gates: Array<Int>, summits: List<Int>, n :Int) : Result{

        val prioritq = PriorityQueue<root>()
        val result = IntArray(n+1) {Int.MAX_VALUE}

        gates.forEach {
            prioritq.add(root(it))
            result[it] = 0
        }


        while (prioritq.isNotEmpty()) {
            val(now , distance) = prioritq.poll()

            if (distance > result[now]) {
                continue
            }

            for (to in graph[now])  {
                val cost = max(to.distance , result[now])
                if (cost < result[to.index]) {
                    result[to.index] = cost
                    prioritq.add(root(to.index, cost))
                }
            }
        }


        return summits.map { Result(it, result[it]) }.minByOrNull { it.intensity } !!
    }
    val realAnswer = dijkstra(gates,summits.sorted(),n)

    answer = intArrayOf(realAnswer.summit , realAnswer.intensity)

}

data class root (val index: Int , val distance:Int = 0) : Comparable<root> {
    override fun compareTo(other: root): Int =
        distance - other.distance
}

data class Result (val summit : Int , val intensity : Int)