package implementation

fun main()=with(System.`in`.bufferedReader()){
    val times = readln().toInt()

println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    reply(times , 0)
}
fun reply (times :Int,repeatCount :Int){
    if (times ==0){
        underBar(repeatCount)
        println("\"재귀함수가 뭔가요?\"");
        underBar(repeatCount)
        println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        underBar(repeatCount)
        println("라고 답변하였지.");
        return
    }
  underBar(repeatCount)
    println("\"재귀함수가 뭔가요?\"");
    underBar(repeatCount);
    println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.")
    underBar(repeatCount)
    println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")
    underBar(repeatCount)
    println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"")
    reply(times-1,repeatCount+1)
    underBar(repeatCount)
    println("라고 답변하였지.")
}
fun underBar(times: Int){
    for (times in 0 until  times){
        print("____")
    }
}



















/*
  __넣기 실패한 버젼 나중에 이방식으로 만들어보기(depth를 사용하면 줄마다 적용가능하다는데?

fun main()=with(System.`in`.bufferedReader()) {
    val times = readln().toInt()
    val monga ="재귀함수가 뭔가요?"
    val reply ="""
        "재귀함수가 뭔가요?"
        "잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
        "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
        "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
    """
    val hochul ="재귀함수는 자기 자신을 호출하는 함수라네"


}


fun repeat(reply:String, monga : String,times :Int,count:Int){
    if(times>0){
        println(monga)
        println(reply)
        repeat(reply,monga,times -1,count+1)

    }
}
*/









