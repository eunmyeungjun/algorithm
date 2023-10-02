package implementation

import java.util.*

fun main()=with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val que: Queue<Int> = LinkedList<Int>()

    for (i in 1..n) {
        que.add(i)
    }
    while(que.size !=1){
        que.poll()
        que.add(que.poll())
    }
        println(que.poll())
}
    /*
    while(que.size<2){
        que.poll()
        que.remove()
        que.add(que.remove())
    }
println(que.element())
}

     */