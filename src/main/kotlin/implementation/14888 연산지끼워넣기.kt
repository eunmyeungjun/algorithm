package implementation

fun main()=with(System.`in`.bufferedReader()){
    val N = readLine().toInt()
    val numbers=readLine()!!.split(" ").map{it.toInt()}.toList()
    val (plus,minus,times,divide) = readLine()!!.split(" ").map { it.toInt() }
    //최소 최대값의 결괏값이 선언한 값보다 크거나 작거나 하면 선언할때의 값이 나온다. 주의하기
    var max=-100000000
    var min=1000000000


    fun calculate(answer:Int,repeat:Int,plus:Int,minus:Int,times:Int,divide:Int){
        if(repeat==N){
            max=maxOf(answer,max)
            min=minOf(answer,min)
            return
        }
        if(plus != 0 ){
            calculate(answer+numbers[repeat],repeat+1,plus-1,minus,times,divide)
        }
        if(minus != 0){
            calculate(answer-numbers[repeat],repeat+1,plus,minus-1,times,divide)
        }
        if(times != 0){
            calculate(answer* numbers[repeat],repeat+1,  plus,minus,times-1,divide)
        }
        if(divide !=0){
            calculate(answer/numbers[repeat],repeat+1,plus,minus,times,divide-1)
        }

    }


    calculate(numbers[0],1,plus,minus,times,divide)
    println(max)
    println(min)
}