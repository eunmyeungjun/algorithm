package implementation

import java.util.Stack

//해결코드
fun main() {
    val s = "}]()[{"
    var answer = 0
    val stack = Stack<Char>()
    val S = s.map { it }.toMutableList()

    repeat(S.size ) {
        val temp = S[0]
        for (i in 0 until S.size -1){
            S[i] = S[i+1]
        }
        S[S.size -1] = temp

        S.forEach {
            val last =  if (stack.isNotEmpty()){
                stack.peek()
            } else {
                null
            }
            if (stack.isEmpty()){
                stack.push(it)
            }
            if (it == '[' || it == '(' || it =='{' || it ==']'|| it == ')' || it == '}'){
                if (last == '['){
                    if (it ==']'){
                        stack.pop()
                    } else stack.push(it)
                }
                if (last == '('){
                    if (it == ')'){
                        stack.pop()
                    } else stack.push(it)
                }
                if (last == '{'){
                    if (it == '}'){
                        stack.pop()
                    } else stack.push(it)
                }

            }
        }
        if (stack.isEmpty()){
            answer ++
        }
        stack.clear()
    }
    println(answer)

}



/*
위 코드와 다른점 stack이 비어있을 때 it을 스택에 추가해주는 코드 추가


import java.util.Stack


fun main() {
    val s = "[](){}"
    var answer = 0
    val stack = Stack<Char>()
    val S = s.map { it }.toMutableList()

    repeat(S.size ) {
        val temp = S[0]
        for (i in 0 until S.size -1){
            S[i] = S[i+1]
        }
        S[S.size -1] = temp

        S.forEach {
            val last = if (stack.isNotEmpty()){
                stack.peek()
            } else null
            if (it == '[' || it == '(' || it =='{' || it ==']'|| it == ')' || it == '}'){
                if (last == '['){
                    if (it ==']'){
                        stack.pop()
                    }
                    else stack.push(it)
                }
                if( last == '('){
                    if (it == ')'){
                        stack.pop()
                    }
                    else stack.push(it)
                }
                if (last == '{'){
                    if (it == '}'){
                        stack.pop()
                    }
                    else stack.push(it)
                }

                else stack.push(it)
            }
        }

        if (stack.isEmpty()){
            answer ++
        }
        stack.clear()
    }

    println(answer)

}
*/
