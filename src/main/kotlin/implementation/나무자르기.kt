package implementation
fun main() = with(System.`in`.bufferedReader()){
    val(N , M) = readLine().split(" ").map { it.toInt() }
    val tree = readLine().split(" ").map { it.toInt() }.toIntArray().sorted()
    var min = 0
    var max = tree[N-1]

    while (min  <= max){
        val  mid = (min + max) / 2
        var cut: Long = 0L
        for (i in tree){
            if (i > mid){
                cut += (i - mid).toLong()
            }
        }
        if (cut.toInt() == M){
            min = mid
            break
        }
        if (cut >= M){
            min = mid
        }else{
            max = mid
        }
    }
    println(min)
}