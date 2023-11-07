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
    var score=0
    var curDice= mutableListOf(2,4,1,3,5,6)
    var afterDice= mutableListOf(0,0,0,0,0,0)
    val dx= listOf(1,-1,0,0)
    val dy= listOf(0,0,1,-1)
    var now =Array(N){IntArray(M)}

    fun diceRoll(x:Int,y:Int){
        var B=0;
        var C=0
        var dir=0
        when(dir){
            0 ->{
                if(x+1 in 0 until M){
                now[x][y]=now[x+1][y]
                B=map[x+1][y]
                afterDice[0]=curDice[0].also { afterDice[1]=curDice[5] }
                    .also {afterDice[2]=curDice[1]}.also { afterDice[3]=curDice[2] }
                    .also{afterDice[4]=curDice[4]}.also {afterDice[5]=curDice[3] }
                }
            else dir=2
            }

            1->{
                if(y-1 in 0 until N){
                now[x][y]=now[x][y-1]
                B=map[x][y-1]
                afterDice[0]=curDice[5].also { afterDice[1]=curDice[1] }
                    .also {afterDice[2]=curDice[0]}.also { afterDice[3]=curDice[3] }
                    .also{afterDice[4]=curDice[2]}.also {afterDice[5]=curDice[4] }
                }
                else dir=3
            }

            2->{
                if(x-1 in 0 until M){
                now[x][y]=now[x-1][y]
                B=map[x-1][y]
                afterDice[0]=curDice[0].also { afterDice[1]=curDice[2] }
                    .also {afterDice[2]=curDice[3]}.also { afterDice[3]=curDice[5] }
                    .also{afterDice[4]=curDice[4]}.also {afterDice[5]=curDice[1] }
                }
                else dir=0
            }

            3->{
                if(y+1 in 0 until N){
                now[x][y]=now[x][y+1]
                B=map[x][y+1]
                afterDice[0]=curDice[2].also { afterDice[1]=curDice[1] }
                    .also {afterDice[2]=curDice[4]}.also { afterDice[3]=curDice[3] }
                    .also{afterDice[4]=curDice[5]}.also {afterDice[5]=curDice[0] }
                }
                else dir=1
            }
            4-> dir=0

            -1 ->dir=3
        }
        curDice=afterDice
        if(curDice[5]>B)  dir += 1

        if(curDice[5]<B)  dir -= 1

        if(curDice[5]==B) dir=dir


        fun dfs(x:Int,y:Int){
            for(k in 0 until 4){
                val zx=x+dx[k]
                val zy=y+dy[k]

                if(zx in 0 until M && zy in 0 until N){
                    if(map[zx][zy]==B){
                        C++
                        dfs(zx,zy)
                    }
                }
            }
        }
        score +=B*C
    }
    repeat(K){
        diceRoll(0,0)
    }
    println(score)
}