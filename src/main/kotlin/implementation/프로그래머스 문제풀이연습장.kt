package implementation
fun solution(n: Int, m: Int): IntArray {
    var answer = intArrayOf(0,0)
    var min =0; var max=0
    var b =0 ; var s =0

    if(n==m){
        answer[0]=1
        answer[1]=n
        return answer
    }
    if(n>m){
        b=n; s=m
    }else{
        b=m; s=n }
    while(true){
        if (b%s==0){
            max=s
            break
        }
        if(b%s==1){
            max=1
            break
        }
        if(b%s != 0){
            var now=b
            b=s
            s=now%s
        }
    }
    min=n*m/max
    answer[0]=max
    answer[1]=min
    return answer
}
fun main(){
    val answer= solution(3,12)
    println(answer)
}