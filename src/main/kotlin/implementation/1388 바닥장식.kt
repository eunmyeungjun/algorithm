package implementation
/*
fun main()= with(System.`in`.bufferedReader()){

    val (n,m) = readLine().split(" ").map { it.toInt() }
    val floor = Array(n){ CharArray(m) }
    var count =0

    for(i in 0 until n){
            val deco = readLine()
            for(j in 0 until m){
                floor[i][j]=deco[j]
            }
    }
    fun move(q:Int, w: Int){
            if (q>=n || w>=m || floor[q][w]=='0'){
                return
            }
            for(x in 0 until m){
               for(y in 0 until n){
                   if(floor[x][y]=='-') {
                    if (x+1 <=m  && floor[x + 1][y] == '-'){
                        floor[x][y]='0'
                        move(x+1,y)
                    }
                    if(x+1<= m && floor[x+1][y]=='|' ){
                        floor[x][y]='0'
                        count++
                    }
                }
                if(floor[x][y]=='|'){
                    if(y+1 <=n && floor[x][y+1]=='|'){
                        floor[x][y]='0'
                        move(x,y+1)
                    }
                    if(y+1<=n &&floor[x][y+1]=='-'){
                        floor[x][y]='0'
                        count++
                    }
                }
            }
        }
    }
    for(M in 0 until m){
        for(N in 0 until n){
            count=0
            move(M,N)
        }
    }
    println(count)
}
*/

fun main() = with(System.`in`.bufferedReader()) {

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val floor = Array(n) { CharArray(m) }
    var count = 0

    for (i in 0 until n) {
        val deco = readLine()
        for (j in 0 until m) {
            floor[j][i] = deco[j]
        }
    }
    fun move(q: Int, w: Int) {
        if (q >= n || w >= m || floor[q][w] == 'X') {
            return
        }
        floor[q][w]='X'
        for (x in 0 until m) {
            for (y in 0 until n) {
                if (floor[x][y] == '-') {
                    if (x + 1 < m && floor[x + 1][y] == '-') {
                        move(x + 1, y)
                    }
                    if (x + 1 < m && floor[x + 1][y] == '|') {
                        count++
                    }
                }
                if (floor[x][y] == '|') {
                    if (y + 1 < n && floor[x][y + 1] == '|') {
                        move(x, y + 1)
                    }
                    if (y + 1 < n && floor[x][y + 1] == '-') {
                        count++
                    }
                }
            }
        }
    }

    for (M in 0 until m) {
        for (N in 0 until n) {
            count=0
            move(M, N)
        }
    }
    println(count)
}
