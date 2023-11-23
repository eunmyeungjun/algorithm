package implementation

// 시간초과
fun main() {
    val ingredient = arrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)
    val hamburger = listOf(1, 2, 3, 1)
    val list = ingredient.toMutableList()
    var count = 0

    while (list.containsAll(hamburger)) {
        var canMake = false
        for (i in 0 until list.size -3){
            if (list[i] == 1 && list[i+1] == 2 && list[i+2] == 3 && list[i+3] == 1){
                canMake = true
                count++
                list.removeAt(i+3)
                list.removeAt(i+2)
                list.removeAt(i+1)
                list.removeAt(i)
                break
            }
        }
        if (canMake == false){
            break
        }
    }
    println(count)
}
