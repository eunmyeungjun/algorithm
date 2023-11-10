package implementation

fun main() = with(System.`in`.bufferedReader()){
    val (N,M,K)=readLine().split(" ").map { it.toInt() }
    val map=Array(N){IntArray(M)}
    for(i in 0 until N){
        val input =readLine().split(" ").map { it.toInt() }
        for(j in 0 until M){
            map[i][j]=input[j]
        }
    }


}