package implementation
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val div = 10007
    val arr = IntArray(1001){0}
    arr[0] = 0
    arr[1] = 1
    arr[2] = 3

    for (i in 3..n){
        arr[i] = ((arr[i-2] * 2) + arr[i-1]) % div
    }
    println(arr[n])

}


