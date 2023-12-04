package implementation


//이게 왜 안댈까?



fun main(){
    val arr = arrayOf(2,6,8,14)
    var answer = 0
    var arrSort = arr.sorted().toMutableList()
    while (arrSort.size > 1){
        if (arrSort.size < 2){
            break
        }
        var a = arrSort[1]
        var b = arrSort[0]
        val gop = (a * b).toLong()
        var remain = a % b
        arrSort.removeAt(0)
        arrSort.remove(0)
        while (b != 0){
            remain = a % b
            a = b
            b = remain
        }
        val gongBae = gop / a


        arrSort.add(gongBae.toInt())
        arrSort =arrSort.sorted().toMutableList()
    }
    answer += arrSort[0]

    println(answer)

}

