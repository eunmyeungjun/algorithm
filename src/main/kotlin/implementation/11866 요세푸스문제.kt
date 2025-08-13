//package implementation
//
//import java.util.StringTokenizer
//
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val st = StringTokenizer(readLine())
//    val n = st.nextToken().toInt()
//    val k = st.nextToken().toInt()
//
//    val que = ArrayDeque<Int>()
//    val list = mutableListOf<Int>()
//
//    for (i in 1..n) {
//        que.addLast(i)
//    }
//
//
//    while (que.isNotEmpty()) {
//        for (j in 0 until k -1) {
//            que.addLast(que.removeFirst())
//        }
//        list.add(que.removeFirst())
//    }
//
//    val result = "<" + list.joinToString  (", " ) + ">"
//
//
//
//
//    print(result)
//
//}