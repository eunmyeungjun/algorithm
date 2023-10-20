package implementation
/* 단순반복시에 repeat 사용,변수를 받는 문자가 중복이라서 오류발생 <-코드고치기
fun main()=with(System.`in`.bufferedReader()) {
    val T = readln().toInt()
    val dx = listOf(0,0,1,-1)
    val dy =listOf(1,-1,0,0)

       for(i in 0 until T) {
        var answer =0
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        val farm = Array(m) { Array<Int>(n) { 0 } }
        for (j in 0 until k) {
            val (q, r) = readln().split(" ").map { it.toInt() }
            farm[q][r] = 1
        }
        fun move(x: Int, y: Int) {
            for (L in 0 until 4) {
                val zx = x + dx[L]
                val zy = y + dy[L]
                if (zx >= 0 && zy >= 0 && zx < m && zy < n) {
                    if (farm[zx][zy] == 1) {
                        farm[zx][zy]= 0
                        move(zx,zy)
                    }
                }
            }
        }
        for(k in 0 until m){
            for(l in 0 until n){
                if(farm[k][l]==0){
                    farm[k][l]=1
                    answer++
                    move(k,l)
                }
            }
        }
        println(answer)
    }
}
 */
fun main()=with(System.`in`.bufferedReader()) {
    val T = readLine()!!.toInt()
    val dx = listOf(0, 0, 1, -1)
    val dy = listOf(1, -1, 0, 0)

    repeat(T) {
        var answer = 0
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        val farm = Array(m) { Array(n) { 0 } }

        repeat(k) {
            val (q, r) = readln().split(" ").map { it.toInt() }
            farm[q][r] = 1
        }

        fun move(x: Int, y: Int) {
            for (l in 0 until 4) {
                val zx = x + dx[l]
                val zy = y + dy[l]
                if (zx >= 0 && zy >= 0 && zx < m && zy < n) {
                    if (farm[zx][zy] == 1) {
                        farm[zx][zy] = 0
                        move(zx, zy)
                    }
                }
            }
        }
        for (k in 0 until m) {
            for (l in 0 until n) {
                if (farm[k][l] == 1) {
                    farm[k][l] = 0
                    move(k, l)
                    answer++
                }
            }
        }
        println(answer)
    }
}

