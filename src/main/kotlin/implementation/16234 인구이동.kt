package implementation

fun main()=with(System.`in`.bufferedReader()){
    val(N,L,R)=readLine().split(" ").map{it.toInt()}
    val pop=Array(N){IntArray(N)}
    var connect=Array(N){BooleanArray(N){false}}
    val dx= listOf(0,0,1,-1)
    val dy= listOf(1,-1,0,0)
        for(i in 0 until N){
            val input = readLine().split(" ").map { it.toInt() }
            for(j in 0 until N){
                pop[i][j]=input[j]
            }
        }
    fun check(x:Int,y:Int,nation:Int){
        var people = pop[x][y]
        var nation=1
        var moved=false
        for(k in 0 until 4 ){
            val zx=x+dx[k]
            val zy=y+dy[k]
            if(pop[zx][zy]-pop[x][y] in L..R &&zx in 0 ..N && zy in 0.. N && !connect[zx][zy]){
                connect[x][y]=true
                people +=pop[x][y]
                check(zx,zy,nation+1)
            }
        }
        if(nation >1){
            val avg=people/nation
            pop[x][y]=avg
            var moved=true
        }
    }
    var day =0
    while(true){
        for(l in 0 until N){
            for(m in 0 until N){
                var nation =1
                check(l,m, 1)
            }
        }
    }



}