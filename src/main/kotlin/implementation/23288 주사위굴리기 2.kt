package implementation

fun main()=with(System.`in`.bufferedReader()){
    val (N,M,K)=readLine().split(" ").map { it.toInt() }
    val map=Array(N){IntArray(M)}
    for(i in 0 until N){
        val input =readLine().split(" ").map { it.toInt() }
        for(j in 0 until M){
            map[i][j]=input[j]
        }
    }
    var now =Array(N){IntArray(M)}


    fun diceRoll(dir:Int,x:Int,y:Int){
        when(dir){
            0 ->{
                now[x][y]=now[x+1][0]

            }

            1->{
                now[x][y]=now[x][y-1]
            }

            2->{
                now[x][y]=now[x-1][y]
            }

            3->{
                now[x][y]=now[x][y+1]
            }




        }
    }



}