package greedy

fun main()=with(System.`in`.bufferedReader()){
    val N= readLine().toInt()
    val ropes= mutableListOf<Int>()
    repeat(N){
        ropes.add(readLine().toInt())
    }
    val weight =ropes.sorted()
    var heavy=0
    for(i in 0 until weight.size){
        if(weight[i] * (weight.size-i)>heavy){
            heavy=weight[i] * (weight.size-i)
        }
    }

    println(heavy)

}

