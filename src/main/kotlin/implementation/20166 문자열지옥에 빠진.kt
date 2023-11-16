package implementation

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (N, M, K) = readLine().split(" ").map { it.toInt() }
    val map = Array(M){CharArray(N)}
    for(i in 0 until N){
        val input = readLine().toList()
        for(j in 0 until M){
            map[j][i] = input[j]
        }
    }
    val dx = listOf(0,1,1,1,0,-1,-1,-1)
    val dy = listOf(1,1,0,-1,-1,-1,0,1)

    repeat(K){
        val godSentence = readLine().toCharArray()
        var answer = 0

        fun dfs(x:Int, y:Int, count:Int, sentence:MutableList<Char>){

            sentence.add(map[x][y])

            if(sentence[count-1] != godSentence[count-1]){
                return
            }

            if(count == godSentence.size){
                if(godSentence contentEquals sentence.toCharArray()){
                    answer++
                }
                return
            }
            for (l in 0 until 8){
                val zx = (x+dx[l]+M) % M
                val zy = (y+dy[l]+N) % N

                dfs(zx,zy,count+1,sentence)
                sentence.removeAt(sentence.size-1)
            }
        }

        for(o in 0 until N){
            for(p in 0 until M){
                if(map[p][o] == godSentence[0]){
                    dfs(p,o,1,mutableListOf())
                }
            }
        }
        bw.write("${answer}\n")
    }
    bw.close()
}


