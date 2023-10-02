package implementation

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()){

    val stack =Stack<Char>()
    while(true){
      val str = readln()
      if (str ==".") return

       str.forEach{currentChar ->
           val lastStack = if(stack.isNotEmpty())stack.peek() else null

           if(currentChar == '('|| currentChar == '{'||currentChar ==')'||currentChar=='}'){
               if (lastStack =='('){
                   if(currentChar ==')') {
                       stack.pop()
                   }
                   else stack.add(currentChar)
               }
               if(lastStack=='{'){
                   if(currentChar=='}'){
                       stack.pop()
                   }
                   else stack.add(currentChar)
               }
           }
        }
        if (stack.isEmpty()) println("yes")
        else(println("no"))
        stack.clear()
    }


}


