package implementation


import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val T = readLine().toInt()
    val mod = 1_000_000_007

    repeat(T) {
        val N = readLine().toInt()
        val slime = readLine().split(" ").map { it.toLong() }
        val slimeQ = PriorityQueue<Long>()
        slimeQ.addAll(slime)
        var slimeEnergy = 1L
      

        while (true) {
            if (slimeQ.size == 1) {
                break
            }
            val smallSlime = slimeQ.poll()
            val smallSlime2 = slimeQ.poll()
            val newSlime = smallSlime * smallSlime2
            slimeQ.add(newSlime)
            slimeEnergy *= (smallSlime % mod * smallSlime2 % mod) % mod
            slimeEnergy %= mod
        }
        bw.write("${slimeEnergy}\n")
    }
    bw.close()
}


/* 시간초과버젼 bw.write를 사용하여 해결.
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

 */