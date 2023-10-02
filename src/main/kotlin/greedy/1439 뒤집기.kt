package greedy

// 실패 코드
//
//fun main() {
//    val insultNumber = readlnOrNull()
//
//    if (insultNumber != null){
//        val numberList = insultNumber.map{it.toString().toInt()}
//        var changeZero =0
//        var changeOne =0
//    for (i in 0 until numberList.size -1){
//        val current =numberList[i]
//        val next = numberList[i+1]
//        if (current==0 && next==1){
//            changeOne++}
//        else if(current==1 &&next ==0){
//            changeZero++
//        }
//    }
//        if(changeZero >=changeOne){
//            println("$changeOne")
//        }
//        else println("$changeZero")
//        }
//    }

fun main() {
    val insultNumber = readlnOrNull()

    if (insultNumber != null) {
        val numberArray = insultNumber.map { it.toString().toInt() }
        var changeZeroToOne = 0
        var changeOneToZero = 0

        for (i in 0 until numberArray.size -1  ) {
            val current = numberArray[i]
            val next = numberArray[i + 1]

            if (current == 0 && next == 1) {
                changeZeroToOne++
            } else if (current == 1 && next == 0) {
                changeOneToZero++
            }
        }
        val minChanges = minOf(changeZeroToOne, changeOneToZero)

        println("$minChanges")
    }
}







