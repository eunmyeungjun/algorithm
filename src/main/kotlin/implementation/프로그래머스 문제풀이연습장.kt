
package implementation

fun main() {
    var answer = 0
    val want = arrayOf("banana", "apple", "rice", "pork", "pot")
    val number = arrayOf(3, 2, 2, 2, 1)
    val discount = arrayOf(
        "chicken", "apple", "apple", "banana", "rice", "apple",
        "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
    var wantNum = mutableMapOf<String, Int>()
    for (i in 0 until want.size){
        wantNum += (want[i] to number[i])
    }
    val temp = wantNum
    for (j in 0 until discount.size - 9){
        wantNum = temp
        for (k in 0..9){
            if (discount[j+k] in wantNum){
                wantNum -1
            }
        }
        if (wantNum.isEmpty()){
            answer = j+1
            break
        }
    }


    println(answer)




}
