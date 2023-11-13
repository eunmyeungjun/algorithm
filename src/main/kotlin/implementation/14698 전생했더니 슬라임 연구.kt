package implementation

import java.util.*

fun main() = with(System.`in`.bufferedReader()){
    val T = readLine().toInt()
    val mod =1_000_000_007

    repeat(T){
        val N = readLine().toInt()
        val slime = readLine().split(" ").map { it.toLong() }
        var slimeEnergy = 1L
        var slimeFarm = mutableListOf<Long>()

        slimeFarm = slime.sorted().toMutableList()


        while (true) {
            if (slimeFarm.size == 1){
                break
            }
            var newSlime = slimeFarm[0] * slimeFarm[1]
            slimeEnergy *= (slimeFarm[0] % mod * slimeFarm[1] % mod) % mod
            slimeEnergy %= mod
            slimeFarm.removeAt(0)
            slimeFarm.removeAt(0)
            slimeFarm.add(newSlime)
            slimeFarm = slimeFarm.sorted().toMutableList()
        }
        println(slimeEnergy)
    }
}