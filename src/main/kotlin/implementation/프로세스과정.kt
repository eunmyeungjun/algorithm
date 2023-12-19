package implementation

import java.util.LinkedList
import java.util.Queue


fun main(){
    val priorities = arrayOf(2, 1, 3, 2) //  a b c d
    val location = 2
    var answer = 0

    var count = 0
    val q : Queue<Int> = LinkedList<Int>()
    val map = mutableMapOf<Int , Int>()

    for (i in 0 until priorities.size){
        map += (i to priorities[i])
    }

    q.addAll(map.keys)





}