package implementation

import java.util.*




//import java.util.ArrayDeque
//
//
//
///*
//
//'(' 와 ')' 가 한 쌍이되어 () 이 만들어지면 YES
//쌍이 이루어 지지 않으면 No
//
//입력
//6
//(())())
//(((()())()
//(()())((()))
//((()()(()))(((())))()
//()()()()(()()())()
//(()((())()(
//
//출력
//NO
//NO
//YES
//NO
//YES
//NO
//
// */
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val sb = StringBuilder()
//    val t = readLine().toInt()
//
//
//    repeat(t) {
//        val index = readLine()
//        val deque = ArrayDeque<Char>()
//        var isValid = true
//
//        for (i in index) {
//            when(i) {
//                '(' -> deque.addLast(i)
//
//                ')' -> {
//                    if (deque.isNotEmpty()) {
//                        deque.removeLast()
//                    } else {
//                        isValid = false
//                        break
//                    }
//                }
//
//                else -> {
//                    isValid = false
//                    break
//                }
//            }
//
//
//
//        }
//
//        if (deque.isNotEmpty()) isValid = false
//
//
//        if (isValid) sb.append("YES\n") else sb.append("NO\n")
//
//
//
//
//    }
//
//    println(sb)
//
//}



fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())

    val answer = mutableListOf<String>()

    val t = st.nextToken().toInt()


    repeat(t) {
        val index = readLine()
        val deque = ArrayDeque<Char>()
        var isValid = true

        for (i in index) {
            when(i) {
                '(' -> deque.add(i)

                ')' -> {
                    if (deque.isNotEmpty()) {
                        deque.pop()
                    } else {
                        isValid = false
                        break
                    }
                }

                else -> {
                    isValid = false
                    break
                }
            }

        }
        if (deque.isNotEmpty()) isValid = false
        if (isValid) {
            answer.add("YES")
        } else answer.add("NO")



    }
    println(answer.joinToString("\n"))

}





