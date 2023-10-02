
package greedy

fun main( ) =with(System.`in`.bufferedReader()){
        val n = readln().toInt()
        val homeArray = readln().toCharArray()

        val sortedHome =homeArray.toSortedSet()

            println(homeArray[(n-1)/2])
}
