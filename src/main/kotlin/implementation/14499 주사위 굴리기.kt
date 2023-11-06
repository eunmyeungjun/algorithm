package implementation



fun main()=with(System.`in`.bufferedReader()){
    val (n,m,x,y,k)=readLine().split(" ").map { it.toInt() }
    var map =Array(n){IntArray(m)}
    for(i in 0 until n){
        val input =readLine().split(" ").map { it.toInt() }
        for(j in 0 until m){
            map[i][j]=input[j]
        }
    }
    var now =map[x][y]
    val orderList=readLine().split(" ").map { it.toInt() }.toList()
    var curDice= mutableListOf(0,0,0,0,0,0)
    var afterDice= mutableListOf(0,0,0,0,0,0)
    fun diceRoll(dir:Int){
        when(dir){
            1-> {
                if(x+1 in 0 until m){
                    now=map[x+1][y]
                    afterDice[0]=curDice[0].also { afterDice[1]=curDice[5] }
                        .also {afterDice[2]=curDice[1]}.also { afterDice[3]=curDice[2] }
                        .also{afterDice[4]=curDice[4]}.also {afterDice[5]=curDice[3] }
                    println(afterDice[3])
                    if(map[x+1][y]==0){
                        map[x+1][y]=afterDice[5]
                    }else{
                        afterDice[5]=map[x+1][y]
                    }
                }
            }

            2-> {
                if(x-1 in 0 until m){
                    now=map[x-1][y]
                    afterDice[0]=curDice[0].also { afterDice[1]=curDice[2] }
                        .also {afterDice[2]=curDice[3]}.also { afterDice[3]=curDice[5] }
                        .also{afterDice[4]=curDice[4]}.also {afterDice[5]=curDice[1] }
                    println(afterDice[3])
                    if(map[x-1][y]==0){
                        map[x-1][y]=afterDice[5]
                    }else{
                        afterDice[5]=map[x-1][y]
                    }
                }
            }


            3-> {
                if(y+1 in 0 until n){
                    afterDice[0]=curDice[2].also { afterDice[1]=curDice[1] }
                        .also {afterDice[2]=curDice[4]}.also { afterDice[3]=curDice[3] }
                        .also{afterDice[4]=curDice[5]}.also {afterDice[5]=curDice[0] }
                    println(afterDice[3])
                    if(map[x][y+1]==0){
                        map[x][y+1]=afterDice[5]
                    }else{
                        afterDice[5]=map[x][y+1]
                    }
                }
            }

            4-> {
                if(y-1 in 0 until n){
                    afterDice[0]=curDice[5].also { afterDice[1]=curDice[1] }
                        .also {afterDice[2]=curDice[0]}.also { afterDice[3]=curDice[3] }
                        .also{afterDice[4]=curDice[2]}.also {afterDice[5]=curDice[4] }
                    println(afterDice[3])
                    if(map[x][y-1]==0){
                        map[x][y-1]=afterDice[5]
                    }else{
                        afterDice[5]=map[x][y-1]
                    }
                }
            }
        }
        curDice.clear()
        curDice.addAll(afterDice)
    }
    for(dir in orderList){
        diceRoll(dir)
    }
}