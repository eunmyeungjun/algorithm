package greedy
fun main()=with(System.`in`.bufferedReader()){
    val (n,l)=readln().split(" ").map{it.toInt()}
    val hole =readln().split(" ").map{it.toInt()}.toIntArray()
    val sortedHole =hole.sorted()
    var tape =1
    val tapeStart = sortedHole[0]- 0.5
    var tapeEnd = tapeStart +l

    for (i in sortedHole) {
        if (i >= tapeEnd) {
            tape++
            tapeEnd = i+ l -0.5
        }
    }
    println(tape)
}

