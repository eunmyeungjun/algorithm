package implementation

fun main()=with(System.`in`.bufferedReader()){
  val (n,x) = readln().split(" ").map { it.toInt() }
    var answer = longArrayOf(n.toLong())
        for(i in 1..n) {
            if(x != 0){
                answer.get(i*x)
            }
        }
    }



