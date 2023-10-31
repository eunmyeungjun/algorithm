package implementation
fun main()=with(System.`in`.bufferedReader()){
    val members=readLine().toInt()
    val friendship =Array(members){IntArray(members){1} }
    val score =0
    val min = 0

    while(true){
        val(x,y)=readLine().split(" ").map{it.toInt()}
        if(x==-1 && y==-1){
            break
        }
        friendship[x][y]=1
        friendship[y][x]=1
    }
    for(i in 0 until members) {
        friendship[i][i] = 0
        for (j in 0 until members) {
            for (k in 0 until members) {
                if(friendship[j][k]>=friendship[j][i]+friendship[i][k]){
                    friendship[j][k]=friendship[j][i]+friendship[i][k]
                }
            }
        }
    }




}