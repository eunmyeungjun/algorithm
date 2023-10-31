package implementation

import java.util.LinkedList
import java.util.Queue

data class pair(val x:Int,val t:Int)
fun main()=with(System.`in`.bufferedReader()){
    val (N,K)=readLine().split(" ").map { it.toInt() }
    val visited=BooleanArray(100001){false}
    val q: Queue<pair> =LinkedList()

    q.add(pair(N,0))
    visited[N]=true
    while(q.isNotEmpty()){
        val(curx,curt)=q.remove()

        if(curx==K){
            println(curt)
            break
        }
        val move =listOf(curx -1,curx +1,curx*2)
        for(nx in move){
            if(!visited[nx]){
                q.add(pair(nx,curt+1))
                visited[nx]=true
            }
        }
    }
}