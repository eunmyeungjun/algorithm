package implementation

fun main()=with(System.`in`.bufferedReader()) {
    val paperCount = readln().toInt()
    val whitePaper = Array(100) { BooleanArray(100) }
    var answer = 0
repeat(paperCount){
    val(x,y)= readln().split(" ").map { it.toInt() }
    for (i in x until x + 10) {
        for (j in y until y + 10) {
            if (whitePaper[i][j]) continue
            whitePaper[i][j] = true
            answer++
        }
    }
    }
    println(answer)
}
