package greedy

fun main() = with(System.`in`.bufferedReader()) {
    val number = readLine()
    val listOfNumbers = number.split("-").toList()

    val wonsohap = mutableListOf<Int>()
    var answer = 0

    for (i in listOfNumbers) {
        val numbers = i.split("+")
        val sum = numbers.sumOf { it.toInt() }
        wonsohap.add(sum)
        if (wonsohap.size == 1) {
            answer = sum
        } else {
            answer -= sum
        }
    }
    println(answer)
}




